package Taller_Herramientas_II;
import java.util.Scanner;

public class Ejercicio5 {

    static String Clave1 = "Perro";

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        for (int i = 2; i >= 0; i--){

            System.out.println("Digite por favor la constraseña: ");
            String Clave2 = scanner.nextLine();
            if (Clave2.equals(Clave1)){
                Acceso();
            } else {
                System.out.println("Acceso Denegado, le quedan " + i + " Intentos");
            }

        }

        System.exit(0);
    }

    public static void Acceso(){

        System.out.println("Acceso Concedido");
        System.exit(0);

    }

}