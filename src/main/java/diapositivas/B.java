package diapositivas;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        char letra = (char) teclado.nextInt();

        if (letra >= 48 && letra <= 57) {
            System.out.println("Es un dígito");
        } else if (letra >= 65 && letra <= 90) {
            System.out.println("Es una letra mayúscula");
        } else if (letra >= 97 && letra <= 122){
            System.out.println("Es una letra minúscula");
        } else{
            System.out.println("Fuera de rango");
        }
    }
}
