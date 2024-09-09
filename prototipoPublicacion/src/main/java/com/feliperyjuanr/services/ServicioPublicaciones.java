/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import com.feliperyjuanr.model.Editorial;
import com.feliperyjuanr.model.Libro;
import com.feliperyjuanr.model.Publicacion;
import com.feliperyjuanr.model.Revista;
import java.util.ArrayList;
import com.feliperyjuanr.view.ILibroInteresado;
import com.feliperyjuanr.view.IRevistaInteresada;

/**
 *
 * @author Juan
 */
public class ServicioPublicaciones {

    //Atributos
    private ArrayList<Publicacion> publicaciones;
    private ServicioGUILibro servicioB;
    private ServicioGUIRevista servicioC;
    private static ServicioPublicaciones sPublicaciones;
    
    
    //Constructor
    private ServicioPublicaciones() {
        publicaciones = new ArrayList<>();
        servicioB = ServicioGUILibro.getServicioInterfazB();
        servicioC = ServicioGUIRevista.getServicioInterfazC();
    }
    
    public synchronized static ServicioPublicaciones getServicioPublicaciones(){
    
        if (sPublicaciones == null){
            sPublicaciones = new ServicioPublicaciones();
        }
        
        return sPublicaciones;
    }
    
    //Métodos
    public int agregarLibro(String titulo, String autor, double precio, boolean tapaDura, Editorial editorial) 
    {
        Libro libro = null;
        
        try
        {
            libro = new Libro(titulo, autor, precio, tapaDura, editorial);
        }
        catch(Exception e) 
        {
            return 1;
        }
        
        if (buscarLibro(libro.getTitulo()) == null) 
        {
            publicaciones.add(libro);
            servicioB.darAvisoB();
            return 0;
        }
      
        return 2;
    }

    public int agregarRevista(String titulo, String autor, double precio, int volumen, boolean suscrito) {
        Revista revista = null;
        
        try
        {
            revista = new Revista(titulo, autor, precio, volumen, suscrito);
        }
        catch(Exception e) 
        {
            return 1;
        }
        
        if (buscarRevista(revista.getTitulo()) == null) 
        {
            publicaciones.add(revista);
            servicioC.darAvisoC();
            return 0;
        }
      
        return 2;
    }

    public Libro buscarLibro(String titulo) {
        for (Publicacion pub : publicaciones) {
            if (pub.getTitulo().equalsIgnoreCase(titulo)
                    && pub.getClass().getSimpleName().equalsIgnoreCase("Libro")) {
                return (Libro) pub;
            }
        }

        return null;
    }
    
    public Revista buscarRevista(String titulo) {
        for (Publicacion pub : publicaciones) {
            if (pub.getTitulo().equalsIgnoreCase(titulo)
                    && pub.getClass().getSimpleName().equalsIgnoreCase("Revista")) {
                return (Revista) pub;
            }
        }

        return null;
    }

    public boolean eliminarLibro(String titulo) {
        boolean eliminado = false;
        Publicacion pub = buscarLibro(titulo);
        eliminado = publicaciones.remove(pub);
        servicioB.darAvisoB();
        return eliminado;
    }
    
    public boolean eliminarRevista(String titulo) {
        boolean eliminado = false;
        Publicacion pub = buscarRevista(titulo);
        eliminado = publicaciones.remove(pub);
        servicioC.darAvisoC();
        return eliminado;
    }

    public ArrayList<Libro> listarLibros() {
        
        ArrayList<Libro> pubs = new ArrayList<>();
        for (int i = 0; i < publicaciones.size(); i++) {
            
            if (publicaciones.get(i).getClass().getSimpleName().equalsIgnoreCase("Libro")) {
                Libro pub = (Libro) publicaciones.get(i);
                pubs.add(pub);
            }
        }

        return pubs;
    }
    
    public ArrayList<Revista> listarRevistas() {
        
        ArrayList<Revista> pubs = new ArrayList<>();
        for (int i = 0; i < publicaciones.size(); i++) {
            
            if (publicaciones.get(i).getClass().getSimpleName().equalsIgnoreCase("Revista")) {
                Revista pub = (Revista) publicaciones.get(i);
                pubs.add(pub);
            }
        }

        return pubs;
    }

    public double calcularPrecioTotal(String tipo) {
        double suma = 0;

        for (Publicacion pub : publicaciones) {
            if (pub.getClass().getSimpleName().equalsIgnoreCase(tipo)) {
                suma += pub.calcularPrecio();
            }
        }

        return suma;
    }
    
    public int actualizarLibro(String tituloAntiguo, String titulo, String autor, double precio, boolean tapaDura, Editorial editorial) 
    {
        Libro nuevo = null;
        
        try
        {
            nuevo = new Libro(titulo, autor, precio, tapaDura, editorial);
        }
        catch(Exception e) 
        {
            return 1;
        }
        
        if (buscarLibro(tituloAntiguo) != null) 
        {
            Libro libroAntiguo = buscarLibro(tituloAntiguo);
            int index = publicaciones.indexOf(libroAntiguo);
            publicaciones.set(index, nuevo);
            servicioB.darAvisoB();
            return 0;
        }
      
        return 2;
    }
    
    public int actualizarRevista(String tituloAntiguo, String titulo, String autor, double precio, int volumen, boolean suscrito) {
        Revista nueva = null;
        
        try
        {
            nueva = new Revista(titulo, autor, precio, volumen, suscrito);
        }
        catch(Exception e) 
        {
            return 1;
        }
        
        if (buscarRevista(tituloAntiguo) != null) 
        {
            Revista revistaAntigua = buscarRevista(tituloAntiguo);
            int index = publicaciones.indexOf(revistaAntigua);
            publicaciones.set(index, nueva);
            servicioC.darAvisoC();
            return 0;
        }
      
        return 2;
    }
    
    public void addInteresadaB(ILibroInteresado interesada)
    {
        servicioB.addGUIInteresadaB(interesada);
    }
    
    public void addInteresadaC(IRevistaInteresada interesada)
    {
        servicioC.addGUIInteresadaC(interesada);
    }
    
    public void deleteInteresadaB(ILibroInteresado interesada)
    {
        servicioB.deleteInteresadaB(interesada);
    }
    
    public void deleteInteresadaC(IRevistaInteresada interesada)
    {
        servicioC.deleteInteresadaC(interesada);
    }
    
}
