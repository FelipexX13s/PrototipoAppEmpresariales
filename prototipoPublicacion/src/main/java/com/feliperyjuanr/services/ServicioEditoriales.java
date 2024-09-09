/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import com.feliperyjuanr.model.Editorial;
import java.util.ArrayList;
import com.feliperyjuanr.view.IEditorialInteresado;

/**
 *
 * @author Juan
 */
public class ServicioEditoriales {

    //Atributos
    private ArrayList<Editorial> editoriales;
    private ServicioGUIEditorial servicioD;
    private static ServicioEditoriales sEditoriales;
    private ServicioGUILibro servicioB;
    
    
    private ServicioEditoriales() {
        editoriales = new ArrayList<>();
        servicioD = ServicioGUIEditorial.getServicioInterfazD();
        servicioB = ServicioGUILibro.getServicioInterfazB();
    }
    
    public synchronized static ServicioEditoriales getServicioEditoriales(){
    
        if (sEditoriales == null){
            sEditoriales = new ServicioEditoriales();
        }
     
        return sEditoriales;
    }
    
    public int agregarEditorial(String nombre, String direccion) {
        Editorial editorial = null;
        
        try
        {
            editorial = new Editorial(nombre, direccion);
        }
        catch(Exception e)
        {
            return 1;
        }
        
        if (buscarEditorial(editorial.getNombre()) == null) {
            editoriales.add(editorial);
            servicioD.darAvisoD();
            servicioB.darAvisoB();
            return 0;
        }
        return 2;
    }

    public ArrayList<Editorial> listarEditoriales() {
        return editoriales;
    }

    public Editorial buscarEditorial(String nombre) {
        for (Editorial edi : editoriales) {
            if (edi.getNombre().equalsIgnoreCase(nombre)) {
                return edi;
            }
        }
        return null;
    }
    
    public boolean eliminarEditorial(String titulo) {
        boolean eliminado = false;
        Editorial edi = buscarEditorial(titulo);
        eliminado = editoriales.remove(edi);
        servicioD.darAvisoD();
        servicioB.darAvisoB();
        return eliminado;
    }
    
    public int actualizarEditorial(String nombreAntiguo, String nombre, String direccion) {
        Editorial editorial = buscarEditorial(nombreAntiguo);
        
        try
        {
            editorial.setNombre(nombre);
            editorial.setDireccion(direccion);
        }
        catch(Exception e)
        {
            return 1;
        }
        
        servicioD.darAvisoD();
        servicioB.darAvisoB();
        return 0;
    }
    
    public void addInteresadaD(IEditorialInteresado interesada)
    {
        servicioD.addGUIInteresadaD(interesada);
    }
    
    public void deleteInteresadaD(IEditorialInteresado interesada)
    {
        servicioD.deleteInteresadaD(interesada);
    }
}
