package Taller_2;

public class Entrenador extends SeleccionFutbol {

    private int idFederacion;
    
    public Entrenador (int id, String Nombre, String Apellidos, int Edad, int idFederacion){
        
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    
    
    @Override
    public void Entrenamiento(){
        
        System.out.println("Dirige un entrenamiento (Clase Entrenador)");    
    }
    
    @Override
    public void PartidoFutbol(){
        
        System.out.println("Digite un partido(Clase Entrenador)");
    }
    
    public void PlanificarEntrenamiento(){
    
        System.out.println("Planificar un Entrenamiento");
    }
    
}
