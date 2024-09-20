package Taller_2;

public class Futbolista extends SeleccionFutbol {
    
    private int Dorsal;
    private String Posicion;
    
    public Futbolista (int id, String Nombre, String Apellidos, int Edad, int Dorsal, String Posicion){
        
        super(id, Nombre, Apellidos, Edad);
        this.Dorsal = Dorsal;
        this.Posicion = Posicion;
    }

    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {
        this.Dorsal = dorsal;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
    
    
    @Override
    public void Entrenamiento(){
        System.out.println("Realiza Entrenamiento(Clase Futbolista)");
    }
    
    @Override
    public void PartidoFutbol(){
        System.out.println("Juega un Partido(Clase Futbolista)");
    }
    
    public void Entrevista(){
        System.out.println("Da una entrevista");
    }
    
}
