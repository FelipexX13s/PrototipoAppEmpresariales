/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.model;


/**
 *
 * @author Juan
 */
public class Libro extends Publicacion 
{
    //Atributos
    private boolean tapaDura;
    private Editorial editorial;
    public static final double COSTO_TAPA_DURA = 4000;

    //Constructor
    public Libro(String titulo, String autor, double precio, boolean tapaDura, Editorial editorial) 
    {
        super(titulo, autor, precio);
        this.tapaDura = tapaDura;
        this.editorial = editorial;
    }

    //Métodos
    @Override
    public double calcularPrecio() 
    {
        if(tapaDura)
        {
            return getPrecio() + COSTO_TAPA_DURA;
        }
        return getPrecio();
    }
    
    //Gets y sets
    public boolean isTapaDura() 
    {
        return tapaDura;
    }

    public void setTapaDura(boolean tapaDura) 
    {
        this.tapaDura = tapaDura;
    }

    public Editorial getEditorial() 
    {
        return editorial;
    }

    public void setEditorial(Editorial editorial) 
    {
        this.editorial = editorial;
        verificarInvariante();
    }
    
    private void verificarInvariante()
    {
        assert editorial != null;
    }
}