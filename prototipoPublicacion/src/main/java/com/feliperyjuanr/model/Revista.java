/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.model;

/**
 *
 * @author Juan
 */
public class Revista extends Publicacion implements Suscribible
{
    //Atributos
    private int volumen;
    private boolean suscrito;
    public static final double PORCENTAJE_DESCUENTO_SUSCRIPCION = 0.15;

    //Constructor
    public Revista( String titulo, String autor, double precio, int volumen, boolean suscrito) throws Exception 
    {
        super(titulo, autor, precio);
        this.volumen = volumen;
        this.suscrito = suscrito;
        
        if(volumen < 1)
        {
            throw new Exception();
        }
    }
    
    //Métodos
    @Override
    public double calcularPrecio() 
    {
        if(suscrito)
        {
            return getPrecio() - getPrecio()*PORCENTAJE_DESCUENTO_SUSCRIPCION;
        }
        return getPrecio();
    }

    @Override
    public void suscribirse() 
    {
        suscrito = true;
    }

    @Override
    public void cancelarSuscripcion() 
    {
        suscrito = false;
    }

    @Override
    public boolean estaSuscrito() 
    {
        return suscrito;
    }
    
    //Gets y sets
    public int getVolumen() 
    {
        return volumen;
    }

    public void setVolumen(int volumen) 
    {
        this.volumen = volumen;
    }
}
