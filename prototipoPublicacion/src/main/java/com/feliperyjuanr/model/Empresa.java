/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.model;

import java.time.LocalDateTime;

/**
 *
 * @author juanp
 */
public class Empresa {
    private String nombre;
    private String direccion;
    private String nit;
    private String telefono;
    private LocalDateTime fechaFundacion;
    
    private static Empresa empresa;
    
    private Empresa() {
        nombre = "Publicaciones Inc.";
        nit = "2-444-666666";
        direccion = "Cll 100 #10-10";
        telefono = "277777777";
        fechaFundacion = LocalDateTime.now();
    }
    
    public synchronized static Empresa getEmpresa(){
    
        if (empresa == null){
            empresa = new Empresa();
        }
        
        return empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNit() {
        return nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDateTime getFechaFundacion() {
        return fechaFundacion;
    }

    @Override
    public String toString() {
        return "Empresa" + "\n" 
                + "{" + "\n" 
                + "Nombre = " + nombre + "\n"
                + "Direccion = " + direccion + "\n"
                + "Nit = " + nit + "\n"
                + "Telefono = " + telefono + "\n"
                + "Fecha Fundacion = " + fechaFundacion + "\n"
                + '}';
    }
    
    
    
}
