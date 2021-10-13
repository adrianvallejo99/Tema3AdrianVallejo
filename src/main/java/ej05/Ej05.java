package ej05;

import java.util.Scanner;

public class Ej05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;

        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. Calcular el área de un Cuadrado");
        System.out.println("2. Calcular el área de un Triángulo");
        System.out.println("3. Calcular el área de un Círculo");
        System.out.println("4. Finalizar");

        System.out.print("Elija una opción: ");
        opcion = teclado.nextInt();

        if (opcion == 1) {
            System.out.println("----AREA CUADRADO----");
            System.out.println("Introduce la longitud del lado: ");
            double lado = teclado.nextDouble();
            double areaCuadrado = Math.pow(lado, 2);
            System.out.println("El area del cuadrado es: " + areaCuadrado);
        }
        else if (opcion == 2) {
            System.out.println("----AREA TRIANGULO----");
            System.out.println("Introduce la longitud del cateto A: ");
            double catetoA = teclado.nextDouble();
            System.out.println("Introduce la longitud del cateto B: ");
            double catetoB = teclado.nextDouble();
            double areaTriangulo = (catetoA * catetoB) / 2;
            System.out.println("El area del triangulo es: " + areaTriangulo);
        }
        else if (opcion == 3) {
            System.out.println("----AREA CIRCULO----");
            System.out.println("Introduce el radio del circulo: ");
            double radio = teclado.nextDouble();
            double areaCirculo = Math.PI * Math.pow(radio, 2);
            System.out.println("El area del circulo es: " + areaCirculo);
        }
        else {
            System.out.println("----FINALIZAR----");
        }

    }
}
