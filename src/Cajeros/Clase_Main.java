package Cajeros;

public class Clase_Main {
    
    public static void main(String[] args) {
        
        Cliente Juan = new Cliente ("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3});
        Cliente Stefania = new Cliente ("Cliente 2", new int[] { 1, 3, 5, 1, 1 });
        
        long TiempoInicial = System.currentTimeMillis();
        Cajero cajera1 = new Cajero("Cajera 1", Juan, TiempoInicial);
        Cajero cajera2 = new Cajero("Cajera 2", Stefania, TiempoInicial);
        
        cajera1.ProcesarCompra(Juan, TiempoInicial);
        cajera2.ProcesarCompra(Stefania, TiempoInicial);
    }
}
