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
            
            
        }
    }
}
