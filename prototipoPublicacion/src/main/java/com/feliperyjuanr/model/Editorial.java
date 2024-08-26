/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.model;

/**
 *
 * @author Juan
 */
public class Editorial 
{
    //Atributos
    private String nombre;
    private String direccion;

    //Constructor
    public Editorial(String nombre, String direccion) throws Exception 
    {
        this.nombre = nombre;
        this.direccion = direccion;
        
        if(nombre == null || nombre.isBlank() || direccion == null || direccion.isBlank())
        {
            throw new Exception();
        }
    }
    
    //Gets y sets
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getDireccion() 
    {
        return direccion;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion = direccion;
    }
}
