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
    public Editorial(String nombre, String direccion) 
    {
        this.nombre = nombre;
        this.direccion = direccion;
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
    
    private void verificarInvariante()
    {
        assert nombre != null && !nombre.isBlank();
        assert direccion != null && !direccion.isBlank();
    }
}
