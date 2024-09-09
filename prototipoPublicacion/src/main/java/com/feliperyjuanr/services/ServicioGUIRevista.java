/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import java.util.ArrayList;
import com.feliperyjuanr.view.IRevistaInteresada;

/**
 *
 * @author juanp
 */
public class ServicioGUIRevista {
    private ArrayList<IRevistaInteresada> interesadosRevistas;
    private static ServicioGUIRevista sInterfazC;
    
    private ServicioGUIRevista()
    {
        interesadosRevistas = new ArrayList<IRevistaInteresada>();
    }
    
    public synchronized static ServicioGUIRevista getServicioInterfazC(){
    
        if (sInterfazC == null){
            sInterfazC = new ServicioGUIRevista();
        }
        
        return sInterfazC;
    }    
    
    
    
    public void addGUIInteresadaC(IRevistaInteresada interesada){
        interesadosRevistas.add(interesada);
    }
    
    public void deleteInteresadaC(IRevistaInteresada interesada){
        interesadosRevistas.remove(interesada);
    }
    
    public void darAvisoC(){
        for (IRevistaInteresada gui : interesadosRevistas){
            gui.cambioRevista();
        }
    }
}
