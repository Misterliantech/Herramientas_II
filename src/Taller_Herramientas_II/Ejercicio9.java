package Taller_Herramientas_II;
import java.util.*;

/* Realizar un programa con un bucle while que lea caracteres de un usuario hasta que se
introduzca la letra &quot;q&quot;, utilizando una variable de tipo char como control.*/

public class Ejercicio9{

    public static void main(String[] args) {
        
        char Control = 'A';
        Scanner scanner = new Scanner (System.in);

        while(Control != 'q'){

            System.out.println("Digita por favor un caracter: ");
            var entrada = scanner.nextLine();
            Control = entrada.charAt(0);
        }

        System.out.println("Felicidades, ingresaste la letra q!!");
    }
    
}