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

    public habitacion(int numero, TipoHabitacion tipo, cliente clienteActual) {
        this.numero = numero;
        this.tipo = tipo;
        this.clienteActual = clienteActual;
        this.ocupada = false; 

    }

    public boolean estaDisponible() {

          return !ocupada; 

    }

    public void reservar(cliente cliente) {

    }

    public void liberar() {
        this.ocupada = false;
        this.clienteActual = null;

    }

    public int getNumero() {
        return numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public cliente getClienteActual() {
        return clienteActual;
    }

    @Override
    public String toString() {
        return "Numero de habitacion: " + numero + "\n" + "tipo de habitacion: " + tipo
                +"\n la habitacion esta ocupada ? : "+ isOcupada();
    }

}
