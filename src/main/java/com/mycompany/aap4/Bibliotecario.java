/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aap4;

/**
 *
 * @author avill
 */
public class Bibliotecario extends Usuario {
    private boolean administrador;

    public Bibliotecario(boolean administrador, String nombre, String dni, String codigo) {
        super(nombre, dni, codigo);
        this.administrador = administrador;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }
    
    
    
}
