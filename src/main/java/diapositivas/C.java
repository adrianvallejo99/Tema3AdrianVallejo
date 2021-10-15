package diapositivas;

import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Introduce un número del 1 al 10");
            numero = teclado.nextInt();
        }while(numero < 1 || numero > 10);

        System.out.println(numero + " En número romano: ");
        switch (numero){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
        }
    }
}
