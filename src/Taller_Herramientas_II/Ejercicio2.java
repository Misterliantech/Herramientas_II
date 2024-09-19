package Taller_Herramientas_II;
import java.util.Scanner;

public class Ejercicio2 {
    
    static int HombresPobres = 0;
    static int MujeresRicas = 0;
    static int MujeresMedias = 0;
    static int Excepciones = 0;
    static int Global = 0;
        
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        int Opcion = 0;
        
        while (Opcion != 3){
            System.out.println("=========== Menu ===========");
            System.out.println("1. Ingresar Nuevos Datos.");
            System.out.println("2. Resultados Totales");
            System.out.println("3. Salir del programa");
            
            Opcion = scanner.nextInt();
            
            switch (Opcion){
                case 1:
                    Ingresar_Datos();
                    break;
                case 2:
                    ResultadosTotales();
                    break;
                 
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opcion incorrecta, intentalo nuevamente.");
                    break;
            }
        }
        
    }
    
    public static void Ingresar_Datos(){
        
        Ejercicio2 Pruebas = new Ejercicio2();
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Digite por favor los siguientes datos: \n");
        System.out.println("Nombre: ");
        String Nombre = scanner.next();
        System.out.println("Sueldo Mensual: ");
        int Sueldo = scanner.nextInt();
        System.out.println("Edad: ");
        int Edad = scanner.nextInt();
        System.out.println("Digite 1: Hombre <<<>>> Digite 2: Mujer: ");
        int Sexo = scanner.nextInt();

        if (Sueldo < 500 && Sexo == 1) {

            Pruebas.HombresPobres(Nombre);

        } else if (Sexo == 2 && Sueldo > 6000) {

            Pruebas.MujeresRicas(Nombre);

        } else if (Edad >= 20 && Edad <= 30 && Sueldo >= 1200 && Sueldo <= 2000) {

            Pruebas.MujeresJovenesMedias(Nombre);
        } else {

            Pruebas.Excepciones(Nombre);
        }
        
        Global++;
        
    }
    
    public void HombresPobres(String Nombre){
        
        int Contador = 1;
        System.out.println(Nombre + " Es un Hombre Pobre.");
        Contador(Contador);
    }
    
    public void MujeresRicas(String Nombre){
        
        int Contador = 2;
        System.out.println(Nombre + " Es una Mujer Rica");
        Contador(Contador);
    }
    
    public void MujeresJovenesMedias(String Nombre){
        
        int Contador = 3;
        System.out.println(Nombre + " Es una mujer de clase media");
        Contador(Contador);
    }
    
    public void Excepciones (String Nombre){
        
        int Contador = 4;
        System.out.println(Nombre + " No ingresa en ninguna opcion.");
        Contador(Contador);
    }
    
    public void Contador(int num){

        switch (num){
            case 1 -> HombresPobres++;
            case 2 -> MujeresRicas++;
            case 3 -> MujeresMedias++;
            case 4 -> Excepciones++;
        }
    }
    
    public static void ResultadosTotales (){
        
        System.out.println("Total de Hombres pobres fue: " + HombresPobres);
        System.out.println("Total de Mujeres Ricas fue: " + MujeresRicas);
        System.out.println("Total de Mujeres Clase Media fue: " + MujeresMedias);
        System.out.println("Total de Excepciones fue: " + Excepciones);
        System.out.println("\n\n*El total de personas encuestadas fue*: " + Global);
    }
}

