package diapositivas;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        String caracter = teclado.nextLine();

        for (int i = 0; i < caracter.length(); i++) {
            char letra = caracter.charAt(i);
            if (letra >= 48 && letra <= 57) {
                System.out.println("Char en posición " + i + ": " + letra);
                System.out.println("Es un dígito");
            } else if (letra >= 65 && letra <= 90) {
                System.out.println("Char en posición " + i + ": " + letra);
                System.out.println("Es una letra mayúscula");
            } else if (letra >= 97 && letra <= 122) {
                System.out.println("Char en posición " + i + ": " + letra);
                System.out.println("Es una letra minúscula");
            } else {
                System.out.println("Char en posición " + i + ": " + letra);
                System.out.println("Fuera de rango");
            }
            //System.out.println("Char en posición " + i + ": " + letra);
        }

        /*if (letra >= 48 && letra <= 57) {
            System.out.println("Es un dígito");
        } else if (letra >= 65 && letra <= 90) {
            System.out.println("Es una letra mayúscula");
        } else if (letra >= 97 && letra <= 122){
            System.out.println("Es una letra minúscula");
        } else{
            System.out.println("Fuera de rango");
        }*/
    }
}
