
package Animales;
import java.util.Scanner;

public class Gatos {

    static Scanner scanner = new Scanner (System.in);
    String Nombre, Color, TipoPelo;
    int Patas, Ojos, Colas;

    public Gatos(String Nombre, String Color, String TipoPelo, int Patas, int Ojos, int Colas) {
        this.Nombre = Nombre;
        this.Color = Color;
        this.TipoPelo = TipoPelo;
        this.Patas = Patas;
        this.Ojos = Ojos;
        this.Colas = Colas;
    }

    public String getNombre(){
        
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        
        this.Nombre = Nombre;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipoPelo() {
        return TipoPelo;
    }

    public void setTipoPelo(String TipoPelo) {
        this.TipoPelo = TipoPelo;
    }

    public int getPatas() {
        return Patas;
    }

    public void setPatas(int Patas) {
        this.Patas = Patas;
    }

    public int getOjos() {
        return Ojos;
    }

    public void setOjos(int Ojos) {
        this.Ojos = Ojos;
    }

    public int getColas() {
        return Colas;
    }

    public void setColas(int Colas) {
        this.Colas = Colas;
    }
    
    public void Comer (){
        
        System.out.println("Toma Leche");
    }
    
    public void Dormir (){
        System.out.println("Ok, como tu digas amo.");
    }
    
    
    
}