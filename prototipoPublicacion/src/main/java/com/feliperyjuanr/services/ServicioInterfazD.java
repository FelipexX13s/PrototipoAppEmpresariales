/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import com.feliperyjuanr.view.IclaseD;
import java.util.ArrayList;

/**
 *
 * @author juanp
 */
public class ServicioInterfazD {
    
    private ArrayList<IclaseD> interesadosEditoriales;
    private static ServicioInterfazD sInterfazD;
    
    private ServicioInterfazD()
    {
        interesadosEditoriales = new ArrayList<IclaseD>();
    }
    
    public synchronized static ServicioInterfazD getServicioInterfazD(){
    
        if (sInterfazD == null){
            sInterfazD = new ServicioInterfazD();
        }
        
        return sInterfazD;
    }
    
    public void addGUIInteresadaD(IclaseD interesada){
        interesadosEditoriales.add(interesada);
    }
    
    public void deleteInteresadaD(IclaseD interesada){
        interesadosEditoriales.remove(interesada);
    }
    
    public void darAvisoD(){
        for (IclaseD gui : interesadosEditoriales){
            gui.cambioEditoriales();
        }
    }
}
