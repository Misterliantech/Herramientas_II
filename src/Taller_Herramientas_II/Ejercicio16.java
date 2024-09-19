package Taller_Herramientas_II;
import java.util.*;

/* Haz un programa que pida a varios usuarios una cantidad de euros, una tasa de interés y un
número de años. Muestra por pantalla en cuánto se habrá convertido el capital inicial
transcurridos esos años si cada año se aplica la tasa de interés introducida. Recuerda que un
capital de C euros a un interés del x por cien durante n años se convierten en
C ·(1 + x/100) n euros.
(Prueba tu programa sabiendo que una cantidad de 10000 al 4.5% de interés anual se convierte en
24117.14 al cabo de 20 años.)*/

import java.util.Scanner;

public class Ejercicio16 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Entrada();
    }

    public static void Entrada(){

        System.out.println("Digite por favor la cantidad de euros: ");
        int Euros = scanner.nextInt();

        System.out.println("Digite por favor la tasa de interes: en %: ");
        double Tasa = scanner.nextDouble();

        System.out.println("Digite por favor la cantidad de años: ");
        int años = scanner.nextInt();

        Calculos(Euros, Tasa, años);
        
    }

    public static void Calculos (int Euros, double Tasa, int años){

        Double CapitalFinal = Euros * Math.pow(1 + Tasa / 100, años);

        for (int i = 0; i < años; i++){

            CapitalFinal += CapitalFinal;
        }

        System.out.println("El Capital Final despues de " + años + " años fue de: " + CapitalFinal);
    }
}
