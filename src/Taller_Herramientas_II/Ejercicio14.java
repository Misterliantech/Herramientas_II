package Taller_Herramientas_II;
import java.util.*;

/*Escriba un programa que se ejecute 5 veces, y en cada iteración reciba como datos tres valores
enteros R, T, Q, determine si los mismos satisfacen la siguiente expresión, y que, en caso
afirmativo, escriba los valores correspondientes de R, T y Q.

R 4 – T 3 + 4 * Q 2 &lt; 820 */

public class Ejercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        for (int i = 0; i < 5; i++){

            System.out.println("Interaccion #" + (i+1) +" \n");

            System.out.println("Digite por favor un valor para R: ");
            int R = scanner.nextInt();
            System.out.println("Digite por favor un valor para T: ");
            int T = scanner.nextInt();
            System.out.println("Digite por favor un valor para Q: ");
            int Q = scanner.nextInt();

            int Resultado = (int) Math.pow(R, 4) - (int) Math.pow(T, 3) + 4 * (int) Math.pow(Q, 2);

            Resultado(Resultado, R, T, Q);
        }

    }

    public static void Resultado (int Resultado, int R, int T, int Q){

        if (Resultado < 820){

            System.out.println("Se cumplen las condiciones.");
            System.out.println("Valores Correspondientes: R: " + R + ", T: " + T + ", Q: " + Q);
        } else {

            System.out.println("Los numeros Indicados, no cumplen los parametros.");
        }
    }
}