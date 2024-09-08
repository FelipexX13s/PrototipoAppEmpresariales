/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import com.feliperyjuanr.model.Editorial;
import com.feliperyjuanr.view.IclaseD;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class ServicioEditoriales {

    //Atributos
    private ArrayList<Editorial> editoriales;
    private ServicioInterfazD servicioD;
    private static ServicioEditoriales sEditoriales;
    private ServicioInterfazB servicioB;
    
    
    private ServicioEditoriales() {
        editoriales = new ArrayList<>();
        servicioD = ServicioInterfazD.getServicioInterfazD();
        servicioB = ServicioInterfazB.getServicioInterfazB();
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
        Editorial nueva = null;
        
        try
        {
            nueva = new Editorial(nombre, direccion);
        }
        catch(Exception e)
        {
            return 1;
        }
        
        Editorial editorialAntigua = buscarEditorial(nombreAntiguo);
        int index = editoriales.indexOf(editorialAntigua);
        editoriales.set(index, nueva);
        servicioD.darAvisoD();
        servicioB.darAvisoB();
        return 0;
    }
    
    public void addInteresadaD(IclaseD interesada)
    {
        servicioD.addGUIInteresadaD(interesada);
    }
    
    public void deleteInteresadaD(IclaseD interesada)
    {
        servicioD.deleteInteresadaD(interesada);
    }
}
