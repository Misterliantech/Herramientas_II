
package Estudiante_GUI;

public class Estudiante {
    
    private int Documento;
    private String Nombres;
    private String Apellidos;
    private String Fecha_Nacimiento;
    private String Carrera;
    private String Semestre;

    public Estudiante() {

    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(String Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    public String getSemestre() {
        return Semestre;
    }

    public void setSemestre(String Semestre) {
        this.Semestre = Semestre;
    }
    
    
    
    public void MostrarDatos(){
        
        System.out.println(Documento + Nombres + Apellidos + Fecha_Nacimiento + Carrera + Semestre);
    }
    
}
