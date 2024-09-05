/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import com.feliperyjuanr.view.IclaseB;
import java.util.ArrayList;

/**
 *
 * @author juanp
 */
public class ServicioInterfazB {
    private ArrayList<IclaseB> interesadosLibros;
    
    public ServicioInterfazB()
    {
        interesadosLibros = new ArrayList<IclaseB>();
    }
    
    public void addGUIInteresadaB(IclaseB interesada){
        interesadosLibros.add(interesada);
    }
    
    public void deleteInteresadaB(IclaseB interesada){
        interesadosLibros.remove(interesada);
    }
    
    public void darAvisoB(){
        for (IclaseB gui : interesadosLibros){
            gui.cambioLibro();
        }
    }
}
