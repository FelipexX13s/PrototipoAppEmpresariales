/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import com.feliperyjuanr.model.Empresa;

/**
 *
 * @author juanp
 */
public class ServicioEmpresa 
{
    private Empresa empresa;
    
    public ServicioEmpresa(){
        empresa = Empresa.getEmpresa();
    }
    
    public Empresa getEmpresa(){
        return empresa;
    }
            
    
}
