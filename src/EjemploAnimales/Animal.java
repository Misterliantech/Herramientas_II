package EjemploAnimales;

public class Animal {
    
    private int id;
    private String Tipo, Nombre;
    
    public Animal(int id, String Tipo, String Nombre){
        
        this.id = id;
        this.Tipo = Tipo;
        this.Nombre = Nombre; 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void Moverse (int x, int y){
        
        System.out.println("Moverse en la coordenada x:" + x + ", en la coordenada y: " + y);
    }
}
