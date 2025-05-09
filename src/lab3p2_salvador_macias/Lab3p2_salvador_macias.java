/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_salvador_macias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Lab3p2_salvador_macias {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<reserva> historial = new ArrayList();
    public static ArrayList<cliente> clientes = new ArrayList();
    public static ArrayList<habitacion> habitaciones = new ArrayList();

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        boolean salida = false;
        do {
            System.out.println("---menu principal---");
            System.out.println("1. Registrar cliente\n"
                    + "2. Registrar habitacion\n"
                    + "3. Ver habitaciones disponibles\n"
                    + "4. Hacer una reserva\n"
                    + "5. Cancelar una reserva\n"
                    + "6. Ver historial de reservas\n"
                    + "7. Salir");
            int opc = lea.nextInt();
            switch (opc) {
                case 1: {

                    System.out.println("ingrese el nombre: ");
                    String nombre = str.nextLine();
                    System.out.println("Ingrese la identidad: ");
                    String id = str.nextLine();
                    clientes.add(new cliente(nombre, id));

                }

                break;

                case 2: {
                    System.out.println("ingrese el numero: ");
                    int numero = lea.nextInt();
                    cliente vacio = null;
                    System.out.println("ingrese el tipo de habitacion: "
                            + "\n(0.SIMPLE"
                            + "\n1.DOBLE"
                            + "\n2.SUITE)");
                    int tipo_habitacion = lea.nextInt();
                    if (tipo_habitacion==0) {
                        TipoHabitacion convertir = TipoHabitacion.SIMPLE;
                        habitaciones.add(new habitacion(numero, TipoHabitacion.SIMPLE, vacio));

                    } else if (tipo_habitacion==1) {
                        TipoHabitacion convertir = TipoHabitacion.DOBLE;
                        habitaciones.add(new habitacion(numero, TipoHabitacion.DOBLE, vacio));

                    } else if (tipo_habitacion==2) {
                        TipoHabitacion convertir = TipoHabitacion.SUITE;
                        habitaciones.add(new habitacion(numero, TipoHabitacion.SUITE, vacio));

                    } else {
                        System.out.println("el tipo de habitacion es invalido.");

                    }

                }

                break;
                case 3: {
                    System.out.println("");
                lista_habitacionesDisponibles();
                    System.out.println("");

                }

                break;
                case 4: {

                }

                break;
                case 5: {

                }

                break;
                case 6: {

                }

                break;
                case 7: {
                    System.out.println("se abandonara el programa");
                    salida = true;

                }

                break;
                default:
                    System.out.println("la opcion ingresada es invalida");
            }

        } while (salida
                != true);//fin while

    }//fin main
    
    public static void lista_habitacionesDisponibles(){
        if (true) {
            
        }
        System.out.println("---habitaciones disponibles---");
        if (habitaciones.isEmpty()) {
            System.out.println("la lista de habitaciones esta vacia");
        } else {
            for (int i = 0; i < habitaciones.size(); i++) {
                System.out.println(
                        habitaciones.indexOf(habitaciones.get(i)) + "-"
                        + habitaciones.get(i)
                );
            }
        }
    
    }

}//fin clase
