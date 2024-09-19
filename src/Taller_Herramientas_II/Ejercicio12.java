package Taller_Herramientas_II;
import java.util.*;

/*Haz un programa que muestre la tabla de multiplicar de un número introducido por teclado
por el usuario. Aquí tienes un ejemplo de cómo se debe comportar el programa: */

public class Ejercicio12 {

    public static void main(String[] args) {
        
        Entrada();
    }

    public static void Entrada(){

        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite por favor el numero a multiplicar: ");
    
        int num = scanner.nextInt();

        Tabla(num);
    }

    public static void Tabla(int num){

        for (int i = 1; i <= 10; i++){

            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }


}