package Taller_2;

public class Masajista extends SeleccionFutbol{
    
    private String Titulacion;
    private int AniosExperiencia;
    
    public Masajista (int id, String Nombre, String Apellidos, int Edad, String Titulacion, int AniosExperiencia){
        
        super(id, Nombre, Apellidos, Edad);
        this.Titulacion = Titulacion;
        this.AniosExperiencia = AniosExperiencia;
    }
    
    @Override
    public void Entrenamiento(){
        
        System.out.println("Da asistencia en el entrenamiento (Clase Masajista)");
    }
    
    public void DarMasaje(){
        
        System.out.println("Da un Masaje");
    }
}
