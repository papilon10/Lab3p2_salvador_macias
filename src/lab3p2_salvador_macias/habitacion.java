/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_salvador_macias;

/**
 *
 * @author Apple
 */
public class habitacion {

    public int numero;
    public TipoHabitacion tipo;
    public boolean ocupada;
    public cliente clienteActual;

    public boolean estaDisponible() {

        return false;

    }

    public void reservar(cliente cliente) {

    }

    public void liberar() {

    }

    @Override
    public String toString() {
        return "habitacion{" + "numero=" + numero + ", tipo=" + tipo + ", ocupada=" + ocupada + ", clienteActual=" + clienteActual + '}';
    }

}
