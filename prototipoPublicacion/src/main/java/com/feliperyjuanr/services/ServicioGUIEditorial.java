/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import java.util.ArrayList;
import com.feliperyjuanr.view.IEditorialInteresado;

/**
 *
 * @author juanp
 */
public class ServicioGUIEditorial {
    
    private ArrayList<IEditorialInteresado> interesadosEditoriales;
    private static ServicioGUIEditorial sInterfazD;
    
    private ServicioGUIEditorial()
    {
        interesadosEditoriales = new ArrayList<IEditorialInteresado>();
    }
    
    public synchronized static ServicioGUIEditorial getServicioInterfazD(){
    
        if (sInterfazD == null){
            sInterfazD = new ServicioGUIEditorial();
        }
        
        return sInterfazD;
    }
    
    public void addGUIInteresadaD(IEditorialInteresado interesada){
        interesadosEditoriales.add(interesada);
    }
    
    public void deleteInteresadaD(IEditorialInteresado interesada){
        interesadosEditoriales.remove(interesada);
    }
    
    public void darAvisoD(){
        for (IEditorialInteresado gui : interesadosEditoriales){
            gui.cambioEditoriales();
        }
    }
}
