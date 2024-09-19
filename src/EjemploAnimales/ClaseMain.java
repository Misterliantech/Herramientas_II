package EjemploAnimales;
import java.util.Scanner;

public class ClaseMain {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int id; 
        String Nombre, Tipo, Bigote, Pelo;
        boolean Colmillos = true;
        
        System.out.println("Digite por favor el ID: ");
        id = scanner.nextInt();
        
        System.out.println("Digite por favor el tipo de gato: ");
        Tipo = scanner.next();
        
        System.out.println("Digite por favor Nombre del Gato: ");
        Nombre = scanner.next();
        
        System.out.println("Digite por favor si / no tiene bigote: ");
        Bigote = scanner.next();
        
        System.out.println("Digite si / no tiene pelo el pulgoso: ");
        Pelo = scanner.next();
        
        Gato g = new Gato (Pelo,  Bigote,  Colmillos,  id,  Tipo,  Nombre);
        
        System.out.println("Pelo: " + g.getPelo() + ", Bigote: " + g.getBigote() + ", ID: " + g.getId() + ", Tipo: " + g.getTipo() + ", Nombre: " + g.getNombre());
        
    }
}
