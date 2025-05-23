/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoogramacionOrientadaObjetos;

/**
 *
 * @author santh
 */
public class Cliente extends Persona{
    private String correoElectronico;
    private boolean esFrecuente;

    // Constructor
    public Cliente(String nombre, int edad, String correo, boolean esFrecuente) {
        super(nombre, edad);
        this.correoElectronico = correo;
        this.esFrecuente = esFrecuente;
    }

    // Getters y Setters
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public boolean isEsFrecuente() {
        return esFrecuente;
    }

    public void setEsFrecuente(boolean esFrecuente) {
        this.esFrecuente = esFrecuente;
    }

    // Polimorfismo: implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Cliente: " + getNombre() + ", Edad: " + getEdad() +
                           ", Email: " + correoElectronico +
                           ", Frecuente: " + (esFrecuente ? "Sí" : "No"));
    }
}
