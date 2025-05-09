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
    public static ArrayList lista = new ArrayList();

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

                }

                break;
                case 2: {

                }

                break;
                case 3: {

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

        } while (salida != true);//fin while

    }//fin main

}//fin clase
