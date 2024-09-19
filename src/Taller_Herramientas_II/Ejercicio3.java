package Taller_Herramientas_II;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Menu(0);
    }
    
    static int Pares = 0, Impares = 0;

    public static void Menu (int Opcion){
        
        Scanner scanner = new Scanner(System.in);
        
        while (Opcion != 3){
            
            System.out.println("========= MENU =========\n");
            System.out.println("1. Ingresar Nuevo Numero.");
            System.out.println("2. Resultados Totales.");
            System.out.println("3. Salir del Programa.");
            System.out.println("\n Digite por favor una opcion: ");
            Opcion = scanner.nextInt();
            
            switch(Opcion){
                case 1 -> Ingreso();
                case 2 -> Acumulados(3, 0);
                case 3 -> System.exit(0);
            }
        }
    }
    
    public static void Ingreso(){
        
        Scanner scanner = new Scanner (System.in);
        int num;
        System.out.println("Digite por favor un numero: ");
        num = scanner.nextInt();
        
        if (num < 0){
            System.out.println("Numero Invalido.");
            Menu(0);
        } else if (num == 9999){
            Menu(3);
        } else {
            Determinante(num);
        }
    }
    
    public static void Determinante(int num){
        
        if (num % 2 == 0){
            
            Par(num);
        } else {
            Impar(num);
        }
        
        Menu(0);
    }
    
    public static void Acumulados(int Dato, int num){
        
        switch (Dato){
            case 1: 
                Pares += num;
                break;
            case 2:
                Impares++;
                break;
            case 3:
                System.out.println("Totales Pares: " + Pares + "\nConteo Impares: " + Impares);
                Menu(0);
                break;
        }
        Menu(0);
    }
    
    public static void Par(int num){
        System.out.println("El numero es par");
        Acumulados(1, num);
    }
    
    public static void Impar(int num){
        System.out.println("El numero es Impar");
        Acumulados(2, num);
    }
}
