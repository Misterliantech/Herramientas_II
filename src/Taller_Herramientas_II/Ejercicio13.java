package Taller_Herramientas_II;
import java.util.*;

/*Escriba un programa que, dados como datos el modelo de un vehículo y su precio, determine
el valor final que debe pagar el comprador. El concesionario está haciendo descuentos
teniendo en cuenta el modelo, con base en la siguiente tabla:
Número de
modelo

Modelo Descuent
o
1 Cutlass 8%
2 Cavalie
r
5%
3 Chevy 6%
4 Centur
y
9%

Haga uso de un entero para representar el modelo. Además, utilice una opción por defecto que
imprima “El modelo no es válido”. */

public class Ejercicio13 {

    public static void main(String[] args) {

        Menu();

    }

    public static void Menu(){

        int Opcion = 0, Valor = 100000;
        Scanner scanner = new Scanner(System.in);

        while (Opcion !=5){

            System.out.println("============ Menu de Consecionario ============");
            System.out.println("La Marca del Coche es Mercedes Benz, Tiene un valor base de $100.000 dolares, Ahora elige el Modelo: ");
            System.out.println("1. Cutlass -> Descuento del 8%");
            System.out.println("2. Cavalier -> Descuento del 5%");
            System.out.println("3. Chevy -> Descuento del 6%");
            System.out.println("4. Century -> Descuento del 9%");

            System.out.println("\nDigite por favor una opcion: ");

            Opcion = scanner.nextInt();

            switch (Opcion){

                case 1 -> Valor *= 0.92;
                case 2 -> Valor *= 0.95;
                case 3 -> Valor *= 0.94;
                case 4 -> Valor *= 0.91;
                default -> System.out.println("Digite por favor una opcion valida.");

            }

            System.out.println("El valor final del coche es de: $" + Valor + " Dolares.");

        }
    }
}