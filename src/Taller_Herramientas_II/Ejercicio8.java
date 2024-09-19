package Taller_Herramientas_II;
import java.util.*;

/*Desarrolla un algoritmo que simule las funciones de un cajero automático. El sistema debe
permitir a los clientes consultar su saldo, retirar dinero o realizar consignaciones. Además,
cada vez que se realice una consignación, el saldo experimentará un incremento del 0.5%. el
programa se termina cuando el usuario seleccione la opción que así lo indique. */

public class Ejercicio8{

    static int Saldo = 0;
    
    public static void main(String[] args) {
        
        Bucle();
    }
    
    public static void Bucle(){
        
        int Opcion = 0;
        Scanner scanner = new Scanner (System.in);
        
        while (Opcion != 4){
            
            System.out.println("=========== Bienvenido a EstafaBanco ===========\n\n");
            System.out.println("1. Consultar Saldo.");
            System.out.println("2. Retirar Dinero.");
            System.out.println("3. Realizar Consignacion.");
            System.out.println("4. Salir del programa.\n");
            
            System.out.println("Digite por favor una opcion: ");
            Opcion = scanner.nextInt();
            
            switch (Opcion){
                
                case 1:
                    ConsultarSaldo();
                    break;
                    
                case 2:
                    RetirarDinero();
                    break;
                    
                case 3:
                    RealizarConsignacion();
                    break;
                
                case 4:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Opcion Invalida, Por Favor Intentelo nuevamente.");
                    break;
            }
            
        }
    }
    
    public static void ConsultarSaldo(){
        
        System.out.println("Su Saldo Actual es de: " + Saldo);
    }
    
    public static void RetirarDinero(){
        
        Scanner scanner = new Scanner (System.in);
        int Retiro = 0; 
        
        System.out.println("=========== Retirar Dinero ===========");
        System.out.println("1. Retirar $ 10.000");
        System.out.println("2. Retirar $ 20.000");
        System.out.println("3. Retirar $ 50.000");
        System.out.println("4. Retirar $ 100.000");
        System.out.println("5. Retirar $ 500.000");
        System.out.println("6. Otro Valor.");
        
        System.out.println("Digite por favor una opcion: ");
        int Opcion = scanner.nextInt();
        
        switch(Opcion){
            
            case 1:
                if (Saldo >= 10000){
                Saldo -= 10000;
                } else {
                System.out.println("Saldo Insuficiente, lo sentimos \n");
                }
                break;
                
            case 2:
                if (Saldo >= 20000){
                Saldo -= 20000;
                } else {
                System.out.println("Saldo Insuficiente, lo sentimos \n");
                }
                break;
                
            case 3:
                if (Saldo >= 50000){
                Saldo -= 50000;
                } else {
                System.out.println("Saldo Insuficiente, lo sentimos \n");
                }
                break;
                
            case 4:
                if (Saldo >= 100000){
                Saldo -= 100000;
                } else {
                System.out.println("Saldo Insuficiente, lo sentimos \n");
                }
                break;
                
            case 5:
                if (Saldo >= 500000){
                Saldo -= 500000;
                } else {
                System.out.println("Saldo Insuficiente, lo sentimos \n");
                Bucle();
                }
                
            case 6:
                
                System.out.println("Digite por favor la cantidad que desea retirar: $");
                int Valor = scanner.nextInt();
                if (Saldo >= Valor){
                Saldo -= Valor;
                } else {
                System.out.println("Saldo Insuficiente, lo sentimos \n");
                }
                break;
            
            default:
                
                System.out.println("Opcion Incorrecta, Regresando al Menu....");
                break;
        }
    }
    
    public static void RealizarConsignacion(){
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite por favor el valor que desea Consignar: $");
        int Consignacion = scanner.nextInt();
        Saldo += Consignacion;
        System.out.println(".\n.\n.\n.\n");
        System.out.println("Consignacion Realizada Correctamente.\n");
        Saldo *= 1.05;
        ConsultarSaldo();
    }

}

