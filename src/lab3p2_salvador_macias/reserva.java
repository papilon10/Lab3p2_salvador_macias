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

    public habitacion getHabitacion() {
        return habitacion;
    }

    public int getNoches() {
        return noches;
    }
    
    

    public double getCosto_total() {
        
        return noches*habitacion.tipo.getPrecio();
    }

    @Override
    public String toString() {
        
       return "habitacion: "+ habitacion
               +"\n numero de noches: "+ noches
               +"costo total : "+getCosto_total() + " LPS";
    }

}
