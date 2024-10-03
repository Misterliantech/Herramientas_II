
package Estudiante_GUI;

public class Clase_Estudiante {
    
    private int Documento;
    private String Nombres;
    private String Apellidos;
    private String Fecha_Nacimiento;
    private String Carrera;
    private String Semestre;

    public Clase_Estudiante(int Documento, String Nombres, String Apellidos, String Fecha_Nacimiento, String Carrera, String Semestre) {
        
        this.Documento = Documento;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Fecha_Nacimiento = Fecha_Nacimiento;
        this.Carrera = Carrera;
        this.Semestre = Semestre;
        
    }
    
    public void MostrarDatos(){
        
        System.out.println(Documento + Nombres + Apellidos + Fecha_Nacimiento + Carrera + Semestre);
    }
    
}
