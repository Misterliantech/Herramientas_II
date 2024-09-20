package Taller_2;

public  abstract class SeleccionFutbol {
    
    protected int id, Edad;
    protected String Nombre, Apellidos;

    public SeleccionFutbol(int id, String Nombre, String Apellidos, int Edad) {
        this.id = id;
        this.Edad = Edad;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    
    
    
    public void viajar(){
        
        System.out.println("Viajar (Clase Padre)");
    }
    
    public void Concentrarse(){
        
        System.out.println("Concentrarse (Clase Padre)");
    }
    
    public abstract void Entrenamiento();
    
    public void PartidoFutbol(){
        
        System.out.println("Asiste al Partido de Futbol(Clase Padre)");
    }
}
