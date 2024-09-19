package Cajeros;

public class Cliente {
    
    private String Nombre;
    private int[] Carro;
    
    public Cliente (){
        
        
    }
    
    public Cliente (String Nombre, int[] Carro) {
        
        this.Nombre = Nombre;
        this.Carro = Carro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int[] getCarro() {
        return Carro;
    }

    public void setCarro(int[] Carro) {
        this.Carro = Carro;
    }
    
    
}
