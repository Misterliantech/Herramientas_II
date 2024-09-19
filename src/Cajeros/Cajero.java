package Cajeros;


public class Cajero extends Thread {
    
    private String Nombre;
    private Cliente cliente;
    private long TiempoInicial;
    
    public Cajero(){
        
    }
    
    public Cajero(String Nombre, Cliente cliente, long TiempoInicial){
        
        this.Nombre = Nombre;
        this.cliente = cliente;
        this.TiempoInicial = TiempoInicial;
        
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void TiempoInicial (long TiempoInicial){
        
        this.TiempoInicial = TiempoInicial;
    }
    
    private void EsperarXSegundos (int segundos){
        
        try{
            
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void ProcesarCompra (Cliente cliente, long TiempoEspera){
        
        System.out.println("Nombre de la cajera: " + this.Nombre + " Empieza a procesar la compra del cliente: " 
                + cliente.getNombre() + " En el tiempo = " + (System.currentTimeMillis() - TiempoEspera)/1000 + " Segundos.");
        
        
        for (int i = 0; i < cliente.getCarro().length; i++){
            
            this.EsperarXSegundos(cliente.getCarro()[i]);
            System.out.println("Procesado del producto " + (i + 1) 
            + " del cliente " + cliente.getNombre() + " -> Tiempo: " 
            + (System.currentTimeMillis() - TiempoEspera) / 1000
            + " segundos");
            
            System.out.println("La Cajera " + this.Nombre + " Ha Terminado de Procesar "
            + cliente.getNombre() + " En el Tiempo: " +
                    (System.currentTimeMillis() - TiempoEspera) / 1000
            + " segundos");
        }
        
    }
}
