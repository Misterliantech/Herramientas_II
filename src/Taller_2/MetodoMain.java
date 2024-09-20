package Taller_2;

import java.util.ArrayList;

public class MetodoMain {
    
    public static ArrayList <SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    
    public static void main(String[] args) {
        
        SeleccionFutbol delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, 28489);
        
        SeleccionFutbol James = new Futbolista(2, "James", "Rodriguez", 29, 6, "Interior Derecho");
        
        SeleccionFutbol RaulMartinez = new Masajista (3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);
        
        integrantes.add(delBosque);
        integrantes.add(James);
        integrantes.add(RaulMartinez);
        
        System.out.println("Todos los integrantes comienzan una concentracion.");
        
        for (SeleccionFutbol integrante: integrantes){
            
            System.out.println(integrante.getNombre()+ "  " + integrante.getApellidos() + " -> ");
            integrante.Concentrarse();
        }
        
        System.out.println("Todos los integrantes viajan a jugar un partido.");
        
        for (SeleccionFutbol integrante : integrantes){
            
            System.out.println(integrante.getNombre()+ "  " + integrante.getApellidos() + " -> ");
            integrante.viajar();
        }
        
        System.out.println("Todos los integrantes tienen su funcion de entrenamiento");
        
        for (SeleccionFutbol integrante : integrantes){
            
            System.out.println(integrante.getNombre() + "  " + integrante.getApellidos() + " -> ");
            integrante.Entrenamiento();
        }
        
        System.out.println("Todos los integrantes tienen su funcion de partido de futbol.");
        
        for (SeleccionFutbol integrante : integrantes){
            
            System.out.println(integrante.getNombre() + "  " + integrante.getApellidos() + " -> ");
            
            integrante.PartidoFutbol();
        }
        
        //Metodos Privados de clase
        //Planificar Entrenamiento
        
        System.out.println("Planificar Entrenamiento");
        System.out.println(delBosque.getNombre() + " " + delBosque.getApellidos() + " -> ");
        ((Entrenador)delBosque).PlanificarEntrenamiento();
        
        //Entrevista
        
          System.out.println("Entrevista");
        System.out.println(James.getNombre() + " " + James.getApellidos() + " -> ");
        ((Futbolista)James).Entrevista();
        
        //Masaje
        
        System.out.println("Dar Masaje");
        System.out.println(RaulMartinez.getNombre() + RaulMartinez.getApellidos() + " -> ");
        ((Masajista)RaulMartinez).DarMasaje();
    }
}
