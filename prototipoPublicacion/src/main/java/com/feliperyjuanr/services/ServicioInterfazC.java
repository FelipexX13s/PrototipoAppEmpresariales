/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import com.feliperyjuanr.view.IclaseC;
import java.util.ArrayList;

/**
 *
 * @author juanp
 */
public class ServicioInterfazC {
    private ArrayList<IclaseC> interesadosRevistas;
    
    public ServicioInterfazC()
    {
        interesadosRevistas = new ArrayList<IclaseC>();
    }
    
    public void addGUIInteresadaC(IclaseC interesada){
        interesadosRevistas.add(interesada);
    }
    
    public void deleteInteresadaC(IclaseC interesada){
        interesadosRevistas.remove(interesada);
    }
    
    public void darAvisoC(){
        for (IclaseC gui : interesadosRevistas){
            gui.cambioRevista();
        }
    }
}
