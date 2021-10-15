package diapositivas;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();

        if (numero > 0){
            System.out.println("Tu número es positivo");
        }
        else if (numero < 0 ){
            System.out.println("Tu número es negativo");
        }
        else {
            System.out.println("Tu número es cero");
        }
    }
}
