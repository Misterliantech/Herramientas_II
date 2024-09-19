package Taller_Herramientas_II;
import java.util.Scanner;

/*Desarrolla un programa que, mediante un bucle `while`, evalúe si un solicitante es elegible
para un préstamo según sus ingresos anuales y la cantidad de hijos que tiene. El banco tiene
las siguientes políticas de concesión de préstamos:
- Si los ingresos son superiores a 12000 dólares anuales, se concede el crédito.
- Si los ingresos son inferiores a 12000 dólares anuales pero superiores a 10000 dólares y el cliente
tiene máximo 2 hijos, se concede el crédito.
- También se concede el crédito si el solicitante tiene ingresos entre 8000 y 10000 dólares, pero no
tiene hijos.
El ciclo debe ejecutarse para 5 clientes.

Al finalizar, genera el siguiente reporte:
Cantidad de clientes sin créditos comedidos
Cantidad de clientes con ingresos superiores a 12000 dólares
Cantidad de clientes con ingresos inferiores a 12000 pero superiores a 10000 y máximo 2 hijos */

public class Ejercicio4 {

    static int SnCredito = 0, Altos = 0, Medios = 0, Bajos = 0;
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int Ingresos, Hijos, Opcion = 1;

        while (Opcion != 0){

            System.out.println("========== Menu ==========\n");
            System.out.println("Ingrese por favor el salario del solicitante: ");
            Ingresos = scanner.nextInt();
            System.out.println("Digite por favor cuantos hijos tiene el solicitante: ");
            Hijos = scanner.nextInt();

            Analisis(Ingresos, Hijos);

            System.out.println("Presione 1 para continuar con otro cliente, Presione cualquier otro numero para finalizar");
            int Input = scanner.nextInt();

            if (Input != 1){
                Opcion = 0;
            }
        }

        System.out.println(Mostrar());
        System.exit(0);
    }

    public static void Analisis(int Ingresos, int Hijos){

        if (Ingresos >= 12000){
            System.out.println("Felicitaciones, Credito Aprobado");
            Contador(1);
        } else if (Ingresos < 12000 && Ingresos >= 10000 && Hijos <= 2){
            System.out.println("Felicitaciones, Credito Aprobado");
            Contador(2);
        }else if (Ingresos >= 8000 && Ingresos <= 10000 && Hijos <= 0){
            System.out.println("Felicitaciones, Credito Aprobado");
            Contador(3);
        }else{
            System.out.println("Lo sentimos, no cumples los requisitos minimos para el prestamo.");
            Contador(4);
        }
    }

    public static void Contador(int Opcion){
        
        switch (Opcion){
            
            case 1 -> Altos++;
            case 2 -> Medios++;
            case 3 -> Bajos++;
            case 4 -> SnCredito++;
        }
    }

    public static String Mostrar(){
        int Totales = Altos + Medios + Bajos + SnCredito;
        int Aprobados = Totales - SnCredito;

        return "El resultado total fue de: " + Totales + " Solicitudes, de las cuales\n" + Altos + " Creditos se aprobaron a personas de ingresos mayores a 12000\n"
        + Medios + " Creditos se aprobaron a personas con ingresos entre los 12000 y 10000 con maximo 2 hijos\n" + Bajos + " Creditos se aprobaron a personas con ingresos entre los 18000 y 10000 sin hijos, dando asi un total de: " + Aprobados + " Creditos Aprobados. Y dejando asi " + SnCredito + " Creditos sin aprobar.";
    }
}
