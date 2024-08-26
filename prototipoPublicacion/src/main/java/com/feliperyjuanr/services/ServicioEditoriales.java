/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.feliperyjuanr.services;

import com.feliperyjuanr.model.Editorial;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class ServicioEditoriales {

    //Atributos
    private ArrayList<Editorial> editoriales;

    public ServicioEditoriales() {
        editoriales = new ArrayList<>();
    }

    public boolean agregarEditorial(String nombre, String direccion) {
        Editorial editorial = new Editorial(nombre, direccion);
        if (buscarEditorial(editorial.getNombre()) == null) {
            editoriales.add(editorial);
            return true;
        }
        return false;
    }

    public ArrayList<Editorial> listarEditoriales() {
        return editoriales;
    }

    public Editorial buscarEditorial(String nombre) {
        for (Editorial edi : editoriales) {
            if (edi.getNombre().equalsIgnoreCase(nombre)) {
                return edi;
            }
        }
        return null;
    }
}
