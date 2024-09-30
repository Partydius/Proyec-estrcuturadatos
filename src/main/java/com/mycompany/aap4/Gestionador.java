/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.aap4;

/**
 *
 * @author avill
 */
import java.util.ArrayList;
import java.util.HashMap;

public interface Gestionador {
    String agregarRecurso(String recurso);
    String quitarRecurso(String recurso);
    String prestarRecurso(String recurso);
    String agregarUsuario(String usuario);
    String quitarUsuario(String usuario);
    String buscarRecurso(String recurso);
    ArrayList<String> listarRecursos();
}

class BibliotecaGestionador implements Gestionador {
    private ArrayList<String> recursos = new ArrayList<>();
    private HashMap<String, Boolean> disponibilidad = new HashMap<>();
    private ArrayList<String> usuarios = new ArrayList<>();

    @Override
    public void agregarRecurso(String recurso) {
        recursos.add(recurso);
        disponibilidad.put(recurso, true);
        System.out.println("Recurso agregado: " + recurso);
    }

    @Override
    public void quitarRecurso(String recurso) {
        recursos.remove(recurso);
        disponibilidad.remove(recurso);
        System.out.println("Recurso quitado: " + recurso);
    }

    @Override
    public void prestarRecurso(String recurso) {
        if (disponibilidad.getOrDefault(recurso, false)) {
            disponibilidad.put(recurso, false);
            System.out.println("Recurso prestado: " + recurso);
        } else {
            System.out.println("Recurso no disponible: " + recurso);
        }
    }

    @Override
    public void agregarUsuario(String usuario) {
        usuarios.add(usuario);
        System.out.println("Usuario agregado: " + usuario);
    }

    @Override
    public void quitarUsuario(String usuario) {
        usuarios.remove(usuario);
        System.out.println("Usuario quitado: " + usuario);
    }

    @Override
    public String buscarRecurso(String recurso) {
        if (recursos.contains(recurso)) {
            return "Recurso encontrado: " + recurso;
        } else {
            return "Recurso no encontrado.";
        }
    }

    @Override
    public ArrayList<String> listarRecursos() {
        return recursos;
    }

    public static void main(String[] args) {
        BibliotecaGestionador gestionador = new BibliotecaGestionador();
        
        gestionador.agregarRecurso("Libro A");
        gestionador.agregarRecurso("Libro B");
        gestionador.agregarUsuario("Usuario1");
        
        System.out.println(gestionador.buscarRecurso("Libro A"));
        gestionador.prestarRecurso("Libro A");
        System.out.println(gestionador.buscarRecurso("Libro A"));
        
        System.out.println("Recursos: " + gestionador.listarRecursos());
    }
}

