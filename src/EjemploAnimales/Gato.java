package EjemploAnimales;

public class Gato extends Animal{
    
    private String Pelo, Bigote;
    private boolean Colmillos;
 
    public Gato(String Pelo, String Bigote, boolean Colmillos, int id, String Tipo, String Nombre) {
        super(id, Tipo, Nombre);
        this.Pelo = Pelo;
        this.Bigote = Bigote;
        this.Colmillos = Colmillos;
    }

    public String getPelo() {
        return Pelo;
    }

    public void setPelo(String Pelo) {
        this.Pelo = Pelo;
    }

    public String getBigote() {
        return Bigote;
    }

    public void setBigote(String Bigote) {
        this.Bigote = Bigote;
    }

    public boolean isColmillos() {
        return Colmillos;
    }

    public void setColmillos(boolean Colmillos) {
        this.Colmillos = Colmillos;
    }
    
    public void Trepar(){
        
        System.out.println("Trepando el Gato");
    }
    
}
