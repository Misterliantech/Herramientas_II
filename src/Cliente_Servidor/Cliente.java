package Cliente_Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class Cliente {

    /**
     * Puerto
     */
    private final static int PORT = 5003;
    /**
     * Host
     */
    private final static String SERVER = "localhost";

    public static void main(String[] args) {
        boolean exit = false; // Bandera para controlar el ciclo del programa

        System.out.println("Cliente> Inicio");

        try (BufferedReader brRequest = new BufferedReader(new InputStreamReader(System.in))) {
            while (!exit) { // Ciclo repetitivo
                try (Socket socket = new Socket(SERVER, PORT); // Abre socket
                     BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                     PrintStream output = new PrintStream(socket.getOutputStream())) {

                    System.out.println("Cliente> Escriba comando");
                    // Captura comando escrito por el usuario
                    String request = brRequest.readLine();

                    // Manda petición al servidor
                    output.println(request);

                    // Captura respuesta e imprime
                    String response = input.readLine();
                    if (response != null) {
                        System.out.println("Servidor> " + response);
                    }

                    if (request.equalsIgnoreCase("exit")) { // Terminar aplicación
                        exit = true;
                        System.out.println("Cliente> Fin de programa");
                    }
                } catch (IOException ex) {
                    System.err.println("Error en la conexión con el servidor: " + ex.getMessage());
                }
            } // end while
        } catch (IOException ex) {
            System.err.println("Error al leer desde la entrada estándar: " + ex.getMessage());
        }
    }
}

