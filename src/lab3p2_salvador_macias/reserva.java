/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_salvador_macias;

/**
 *
 * @author Apple
 */
public class reserva {

    public habitacion habitacion;
    public int noches;
    public double costo_total;

    public reserva(habitacion habitacion, int noches) {
        this.habitacion = habitacion;
        this.noches = noches;
    }

    public double getCosto_total() {
        return costo_total;
    }

    @Override
    public String toString() {
        return "reserva{" + "habitacion=" + habitacion + ", noches=" + noches + ", costo_total=" + costo_total + '}';
    }

}
