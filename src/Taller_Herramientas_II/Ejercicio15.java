package Taller_Herramientas_II;
import java.util.*;

/*Diseña un programa que, a partir del valor de los dos lados de un rectángulo (4 y 6 metros,
respectivamente), muestre el valor de su perímetro (en metros) y el de su área (en metros
cuadrados). (El perímetro debe darte 20 metros y el área 24 metros cuadrados.). Probar para 4
rectángulos.

Perimetro = 2 x (Ancho + Largo)
Area = Ancho x largo*/

public class Ejercicio15 {

    public static int largo = 0, ancho = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        leerLargo();
        leerAncho();
        mostrarResultados();
    }

    public static void leerLargo() {

        System.out.println("Digite por favor el largo del rectángulo en mts: ");
        largo = scanner.nextInt();
    }

    public static void leerAncho() {

        System.out.println("Digite por favor el ancho del rectángulo en mts: ");
        ancho = scanner.nextInt(); 
    }

    public static void mostrarResultados() {

        int perimetro = 2 * (ancho + largo);
        int area = ancho * largo;

        System.out.println("Los resultados son los siguientes:");
        System.out.println("Largo: " + largo + " mts");
        System.out.println("Ancho: " + ancho + " mts");
        System.out.println("Perímetro: " + perimetro + " mts");
        System.out.println("Área: " + area + " mts cuadrados");
    }

    
}