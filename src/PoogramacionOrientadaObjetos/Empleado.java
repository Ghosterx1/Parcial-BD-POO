/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PoogramacionOrientadaObjetos;

/**
 *
 * @author santh
 */
public class Empleado extends Persona {
    private String puesto;
    private double salario;

    // Constructor
    public Empleado(String nombre, int edad, String puesto, double salario) {
        super(nombre, edad); // Herencia: llamada al constructor de Persona
        this.puesto = puesto;
        this.salario = salario;
    }

    // Getters y Setters
    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Polimorfismo: implementación del método abstracto
    @Override
    public void mostrarInformacion() {
        System.out.println("Empleado: " + getNombre() + ", Edad: " + getEdad() +
                           ", Puesto: " + puesto + ", Salario: $" + salario);
    }
    
}
