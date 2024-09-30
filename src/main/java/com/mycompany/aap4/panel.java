/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aap4;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class panel extends JFrame {
    private ArrayList<String> catalogo = new ArrayList<>();

    public panel() {
        setTitle("Biblioteca");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        getContentPane().add(panel);
        panel.setLayout(null);

        JButton usuarioButton = new JButton("Usuario");
        usuarioButton.setBounds(50, 50, 120, 30);
        panel.add(usuarioButton);

        JButton adminButton = new JButton("Administrador");
        adminButton.setBounds(200, 50, 120, 30);
        panel.add(adminButton);

        usuarioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarOpcionesUsuario();
            }
        });

        adminButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarOpcionesAdmin();
            }
        });
    }

    private void mostrarOpcionesUsuario() {
        String[] opciones = {"Listar catálogo", "Buscar material", "Prestar recurso", "Devolver recurso"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Usuario",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (seleccion) {
            case 0:
                listarCatalogo();
                break;
            case 1:
                buscarMaterial();
                break;
            case 2:
                prestarRecurso();
                break;
            case 3:
                devolverRecurso();
                break;
        }
    }

    private void mostrarOpcionesAdmin() {
        String[] opciones = {"Listar catálogo", "Buscar material", "Prestar recurso", "Devolver recurso", "Eliminar recurso", "Agregar recurso"};
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Administrador",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (seleccion) {
            case 0:
                listarCatalogo();
                break;
            case 1:
                buscarMaterial();
                break;
            case 2:
                prestarRecurso();
                break;
            case 3:
                devolverRecurso();
                break;
            case 4:
                eliminarRecurso();
                break;
            case 5:
                agregarRecurso();
                break;
        }
    }

    private void listarCatalogo() {
        JOptionPane.showMessageDialog(null, "Catálogo: " + catalogo.toString());
    }

    private void buscarMaterial() {
        String material = JOptionPane.showInputDialog("Ingrese el nombre del material a buscar:");
        if (catalogo.contains(material)) {
            JOptionPane.showMessageDialog(null, "Material encontrado: " + material);
        } else {
            JOptionPane.showMessageDialog(null, "Material no encontrado.");
        }
    }

    private void prestarRecurso() {
        String material = JOptionPane.showInputDialog("Ingrese el nombre del material a prestar:");
        if (catalogo.contains(material)) {
            catalogo.remove(material);
            JOptionPane.showMessageDialog(null, "Material prestado: " + material);
        } else {
            JOptionPane.showMessageDialog(null, "Material no disponible.");
        }
    }

    private void devolverRecurso() {
        String material = JOptionPane.showInputDialog("Ingrese el nombre del material a devolver:");
        catalogo.add(material);
        JOptionPane.showMessageDialog(null, "Material devuelto: " + material);
    }

    private void eliminarRecurso() {
        String material = JOptionPane.showInputDialog("Ingrese el nombre del material a eliminar:");
        if (catalogo.contains(material)) {
            catalogo.remove(material);
            JOptionPane.showMessageDialog(null, "Material eliminado: " + material);
        } else {
            JOptionPane.showMessageDialog(null, "Material no encontrado.");
        }
    }

    private void agregarRecurso() {
        String material = JOptionPane.showInputDialog("Ingrese el nombre del material a agregar:");
        catalogo.add(material);
        JOptionPane.showMessageDialog(null, "Material agregado: " + material);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new panel().setVisible(true);
            }
        });
    }
}
