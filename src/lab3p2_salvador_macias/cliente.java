/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_salvador_macias;

import java.util.ArrayList;
import javax.tools.Tool;

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
        this.reservas = new ArrayList<>();

    }

    public cliente() {
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<reserva> reservas) {
        this.reservas = reservas;
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
        this.reservas.add(reserva);

    }

    public void mostrarHistorial() {
        for (int i = 0; i < reservas.size(); i++) {
            System.out.println(reservas.indexOf(reservas.get(i)) + "-"
                    + reservas.get(i)
            );
            System.out.println("Gasto total: Lps " + calcularGasto());
        }
        this.toString();

    }

    double calcularGasto() {
        double gastoTot = 0.0;
        for (int i = 0; i < reservas.size(); i++) {

            gastoTot += reservas.get(i).getCosto_total();
        }

        return gastoTot;

    }

    @Override
    public String toString() {
        return  
                 "\n gasto total : " + calcularGasto() + " LPS" // + "nombre del cliente: " + nombre
                
                //+ "\n id: " + id;
                ;
    }

}
