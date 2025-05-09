/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_salvador_macias;

/**
 *
 * @author Apple
 */
public enum TipoHabitacion {
    SIMPLE(50.),
    DOBLE(80.0),
    SUITE(150.0);

    public double precio;

    private TipoHabitacion(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

}
