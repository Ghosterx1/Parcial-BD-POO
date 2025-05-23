/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoogramacionOrientadaObjetos;

/**
 *
 * @author santh
 */
public abstract class Persona {
    // Encapsulamiento: atributos privados
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método que será sobrescrito (polimorfismo)
    public abstract void mostrarInformacion();

    // Sobrecarga de método saludar
    public void saludar() {
        System.out.println("Hola, soy una persona.");
    }

    public void saludar(String mensaje) {
        System.out.println("Hola, " + mensaje);
    }
}
