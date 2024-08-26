/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.model;

import java.util.Date;

/**
 *
 * @author Juan
 */
public abstract class Publicacion 
{
    //Atributos
    private String titulo;
    private String autor;
    private double precio;

    //Constructor
    public Publicacion(String titulo, String autor, double precio) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        
        verificarInvariante();
    }

    //Métodos
    public abstract double calcularPrecio();
    
    //Gets y sets

    public String getTitulo() 
    {
        return titulo;
    }

    public void setTitulo(String titulo) 
    {
        this.titulo = titulo;
    }

    public String getAutor() 
    {
        return autor;
    }

    public void setAutor(String autor) 
    {
        this.autor = autor;
    }
    public double getPrecio() 
    {
        return precio;
    }

    public void setPrecio(double precio) 
    {
        this.precio = precio;
        
        verificarInvariante();
    }
    
    private void verificarInvariante()
    {
        assert precio >= 50;
        assert titulo != null && !titulo.isBlank();
        assert autor != null && !autor.isBlank();
    }

}
