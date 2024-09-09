/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import java.util.ArrayList;
import com.feliperyjuanr.view.ILibroInteresado;

/**
 *
 * @author juanp
 */
public class ServicioGUILibro {
    private ArrayList<ILibroInteresado> interesadosLibros;
    private static ServicioGUILibro sInterfazB;
    
    private ServicioGUILibro()
    {
        interesadosLibros = new ArrayList<ILibroInteresado>();
    }
    
    public synchronized static ServicioGUILibro getServicioInterfazB(){
    
        if (sInterfazB == null){
            sInterfazB = new ServicioGUILibro();
        }
        
        return sInterfazB;
    }
    
    public void addGUIInteresadaB(ILibroInteresado interesada){
        interesadosLibros.add(interesada);
    }
    
    public void deleteInteresadaB(ILibroInteresado interesada){
        interesadosLibros.remove(interesada);
    }
    
    public void darAvisoB(){
        for (ILibroInteresado gui : interesadosLibros){
            gui.cambioLibro();
        }
    }
}
