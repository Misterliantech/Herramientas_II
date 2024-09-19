package Taller_Herramientas_II;

import java.util.Scanner;

public class Ejercicio1 {
    
    public void Interaccion_Ciclo1 (){
        
        int j = 0, i = 0;
        
        while (i < 3){
            
            while (j < 3){
                
                System.out.print("i = " + i + " j = " + j);
                j++;
            }
            
            System.out.println("");
            j=0;
            i++;
        }
    }
    
    public void Interaccion_Ciclo2 (){
        
        int i=0, j=0, k=0;
        
        while (i < 3){
            while (j < 3){
                while (k < 3) {
                    System.out.println("$i= {i}, j= {j}, k={k},");
                    k++;
                }
                k=0;
                j++;
            }
            j=0;
            i++;
        }
    }
    
    public void Interacion_Ciclo3(int x, int y){
        
        while (x > 3){
            while (y > 3){
                System.out.print("${x} - {y}");
            }
        }
        
    }
    
    public void Interaccion_Ciclo4 (){
    
        int n = 5;
        
        while (n > 0){
            n--;
            System.out.println("${n}");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Ejercicio1 n1 = new Ejercicio1();
        
        n1.Interaccion_Ciclo1();
        n1.Interaccion_Ciclo2();
        
        System.out.println("Digite por favor dos numeros mayores que 3: ");
        System.out.println("Numero 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Numero 2: ");
        int num2 = scanner.nextInt();
        n1.Interacion_Ciclo3(num1, num2);
        n1.Interaccion_Ciclo4();
    }
    
}






