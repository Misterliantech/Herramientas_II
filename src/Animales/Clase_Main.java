
package Animales;
import java.util.Scanner;

public class Clase_Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        Gatos gato1 = new Gatos ("Firulais", "Amarillo", "Liso", 4, 2, 1);
        
        System.out.println("=========== Informacion del Gato ===========");
        System.out.println("Nombre: " + gato1.getNombre());
        System.out.println("Color: " + gato1.getColor());
        System.out.println("Tipo de Pelaje: " + gato1.getTipoPelo());
        System.out.println("N° de Patas: " + gato1.getPatas());
        System.out.println("N° de Colas: " + gato1.getColas());
        System.out.println("N° de Ojos: " + gato1.getOjos()+"\n\n");

        System.out.println("Digite por favor un nuevo nombre para el gato: ");
        String Nuevo = scanner.nextLine();
        gato1.setNombre(Nuevo);
        
        System.out.println("=========== Informacion del Gato ===========");
        System.out.println("Nombre: " + gato1.getNombre());
        System.out.println("Color: " + gato1.getColor());
        System.out.println("Tipo de Pelaje: " + gato1.getTipoPelo());
        System.out.println("N° de Patas: " + gato1.getPatas());
        System.out.println("N° de Colas: " + gato1.getColas());
        System.out.println("N° de Ojos: " + gato1.getOjos()+"\n\n");
     
        System.out.println("========= Menu de Gato =========");
        System.out.println("1. Comer.");
        System.out.println("2. Dormir.");
        System.out.println("\nDigite por favor una opcion: ");
        int Opcion = scanner.nextInt();
        
        while (Opcion !=3){
            
            switch (Opcion) {
                case 1:
                    gato1.Comer();
                    break;
                case 2:
                    gato1.Dormir();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    System.out.println("Saliendo del programa");
                default:
                    System.out.println("Numero, Incorrecto");
            }
        }
    }
}
