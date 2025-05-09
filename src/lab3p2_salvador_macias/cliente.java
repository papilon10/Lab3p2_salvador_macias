/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_salvador_macias;

import java.util.ArrayList;

/**
 *
 * @author Apple
 */
public class cliente {

    public String nombre;
    public String id;
    public ArrayList<reserva> reservas;

    public cliente(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    
    public void agregarReserva(reserva reserva) {

    }

    public void mostrarHistorial() {

    }

    double calcularGasto() {

        return 0;

    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", id=" + id + ", reservas=" + reservas + '}';
    }

}
