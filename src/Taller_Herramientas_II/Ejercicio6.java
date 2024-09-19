package Taller_Herramientas_II;

/*Desarrolla un programa que simule un juego de adivinanza de números. El programa debe
generar aleatoriamente un número entero entre 1 y 100. El usuario tendrá que adivinar este
número en un máximo de 5 intentos. Para cada intento, el programa informará al usuario si el
número ingresado es mayor, menor o igual al número objetivo. Una vez que el usuario adivine
correctamente el número o agote sus 5 intentos, se mostrará un mensaje indicando si ha
ganado o perdido. */

import java.util.*;

public class Ejercicio6 {

    public static void main(String[] args) {

        Generador();
    }

    public static void Generador(){

        Random rnd = new Random();
        int aleatorio = rnd.nextInt(1,100);
        Ingreso(aleatorio);
    }

    public static void Ingreso(int aleatorio){

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){

            System.out.println("Digite por favor un numero: ");
            int num = scanner.nextInt();

            if (num < aleatorio){

                System.out.println("El numero Objetivo esta mas arriba.");
            } else if (num > aleatorio){

                System.out.println("El numero Objetivo esta mas abajo.");
            } else {

                Decision();
            }
        }

        System.out.println("Lo sentimos, mucho, no has podido adivinar el numero.\n\nPresiona la tecla 1 para volverlo a intentar");
        int input = scanner.nextInt();
        if (input == 1){
            Generador();
        } else {
            System.exit(0);
        }
    }

    public static void Decision(){

        System.out.println("Excelente has ganado, Adivinaste el numero");
        System.exit(0);
    }
}