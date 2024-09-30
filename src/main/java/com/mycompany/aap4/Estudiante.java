/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aap4;

/**
 *
 * @author avill
 */
public class Estudiante extends Usuario {
    private int grado;
    private String nivel;

    public Estudiante(int grado, String nivel, String nombre, String dni, String codigo) {
        super(nombre, dni, codigo);
        this.grado = grado;
        this.nivel = nivel;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
    
    
}
