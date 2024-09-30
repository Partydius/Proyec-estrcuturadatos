package com.mycompany.aap4;

/**
 *
 * @author avill
 */
public class Docente extends Usuario {
    private String asignatura;

    public Docente(String asignatura, String nombre, String dni, String codigo) {
        super(nombre, dni, codigo);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
}
