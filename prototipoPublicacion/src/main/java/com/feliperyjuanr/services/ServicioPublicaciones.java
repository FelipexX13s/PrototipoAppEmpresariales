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

/**
 *
 * @author Juan
 */
public class ServicioPublicaciones {

    //Atributos
    private ArrayList<Publicacion> publicaciones;

    //Constructor
    public ServicioPublicaciones() {
        publicaciones = new ArrayList<>();

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
        Publicacion pub = buscarLibro(titulo);
        return publicaciones.remove(pub);
    }
    
    public boolean eliminarRevista(String titulo) {
        Publicacion pub = buscarRevista(titulo);
        return publicaciones.remove(pub);
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
}
