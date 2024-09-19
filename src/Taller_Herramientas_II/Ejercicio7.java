package Taller_Herramientas_II;

/*Desarrolla un programa que administre las calificaciones de 5 estudiantes, cada uno con 3
notas. Deberás presentar el promedio de cada estudiante. La condición para aprobar es que la
nota promedio sea superior a 4.0. Al finalizar el ingreso de datos, se requiere mostrar la
cantidad de estudiantes aprobados y reprobados. */

import java.util.*;

public class Ejercicio7{

    public static void main(String[] args) {

        Ingreso();

    }

    public static void Ingreso(){

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++){

            double Promedio = 0;

            System.out.println("Digite por favor las notas del estudiante #" + (i+1));

            for(int j = 0; j < 3; j++){

                System.out.println("Digite por favor la nota #" + (j+1));
                Promedio += scanner.nextDouble();
            }

            Promedio = Promedio / 3;

            if (Promedio < 4.0){

                System.out.println("Este estudiante fue Reprobado con un Promedio de: " + Promedio);
                Resultados(Promedio);
            } else {

                System.out.println("Este estudiante Aprobo la Materia con un Promedio de: " + Promedio);
                Resultados(Promedio);
            }
            
            System.out.println("\n\n");

        }

        Final();

    }

    static int Aprobados = 0, Reprobados = 0;

    public static void Final(){

        System.out.println(Aprobados + " Estudiantes Aprobaron la materia");
        System.out.println(Reprobados + " Estudiantes Reprobaron la materia");
    }

    public static void Resultados(double Promedio){

        if (Promedio < 4.0){

            Reprobados++;
        } else {

            Aprobados++;
        }

    }


}

