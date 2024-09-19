package Taller_Herramientas_II;
import java.util.*;

/* Investigar acerca del índice de masa corporal, qué es, cómo se calcula y qué información nos
proporciona acerca del estado nutricional de una persona.
Identificar las fórmulas necesarias para calcular el índice de masa corporal. 
Menor de 18.5: Bajo peso
18.5 - 24.9: Peso normal
25 - 29.9: Sobrepeso
30 o más: Obesidad*/

public class Ejercicio10 {

    public static void main(String[] args) {
        
        Entrada();
    }

    public static void Entrada(){

        Scanner scanner = new Scanner(System.in);

        double Peso, Altura;

        System.out.println("Digite por favor su peso en Kg: ");
        Peso = scanner.nextDouble();
        System.out.println("Digite por favor su altura en Cm: ");
        Altura = scanner.nextDouble();

        double IndiceCorporal = Peso / (Altura * Altura);

        if (IndiceCorporal < 18.5){

            System.out.println("Bajo Peso");
        } else if (IndiceCorporal >= 18.5 && IndiceCorporal < 25){

            System.out.println("Peso Normal");
        } else if (IndiceCorporal >= 25 && IndiceCorporal < 30){

            System.out.println("SobrePeso");
        } else if (IndiceCorporal >= 30){

            System.out.println("Obesidad");
        }
        System.out.println("Bingo!! --> Su indice de masa corporal es de: " + IndiceCorporal);
    }

}

