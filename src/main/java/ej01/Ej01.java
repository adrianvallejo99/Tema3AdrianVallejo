package ej01;

import java.util.Scanner;

public class Ej01 {
    public static void main(String[] args) {
        /*
            1.- Implementa el siguiente programa y realiza ejecuciones para los siguientes datos de edad:
             10,18 y 67. ¿Cuáles son los resultados?
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("escanear edad:");

        int edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.print("mostrar la edad: ");
        System.out.println(edad);
    }
}
