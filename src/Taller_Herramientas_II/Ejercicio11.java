package Taller_Herramientas_II;
import java.util.*;

/*Desarrollar un programa que permita a un número indeterminado de usuarios ingresar su
peso y estatura, calcule su índice de masa corporal y determine su estado nutricional según los
siguientes criterios:
Bajo peso: IMC menor a 18.5
Peso normal: IMC entre 18.5 y 24.9
Sobrepeso: IMC entre 25 y 29.9
Obesidad: IMC mayor a 30 */

public class Ejercicio11 {

    public static void main(String[] args) {
        
        Entrada();
    }

    public static void Entrada(){

        Scanner scanner = new Scanner(System.in);

        double Peso, Altura;

        int Opcion = 1;
        
        while (Opcion == 1){

            System.out.println("Digite por favor su peso en Kg: ");
            Peso = scanner.nextDouble();
            System.out.println("Digite por favor su altura en Cm: ");
            Altura = scanner.nextDouble();

            double IndiceCorporal = Peso / (Altura * Altura);

            if (IndiceCorporal < 18.5) {

                System.out.println("Bajo Peso");
            } else if (IndiceCorporal >= 18.5 && IndiceCorporal < 25) {

                System.out.println("Peso Normal");
            } else if (IndiceCorporal >= 25 && IndiceCorporal < 30) {

                System.out.println("SobrePeso");
            } else if (IndiceCorporal >= 30) {

                System.out.println("Obesidad");
            }
            System.out.println("Bingo!! --> Su indice de masa corporal es de: " + IndiceCorporal);

            System.out.println("Para Reiniciar, Presione la tecla 1.");

            Opcion = scanner.nextInt();
    
        }
    }
}