
package Cliente_Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Servidor {

    private final static int PORT = 5003;

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Servidor> Servidor iniciado");
            System.out.println("Servidor> En espera de cliente...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader input = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintStream output = new PrintStream(clientSocket.getOutputStream())) {

                    String request = input.readLine();
                    System.out.println("Cliente> peticion [" + request + "]");
                    
                    String strOutput = process(request);
                    System.out.println("Servidor> Resultado de peticion");
                    System.out.println("Servidor> \"" + strOutput + "\"");

                    output.println(strOutput);
                } catch (IOException e) {
                    System.err.println("Error al manejar la conexión del cliente: " + e.getMessage());
                }
            }
        } catch (IOException ex) {
            System.err.println("Error al iniciar el servidor: " + ex.getMessage());
        }
    }

    /**
     * Procesa la petición del cliente y retorna un resultado
     * @param request petición del cliente
     * @return String resultado
     */
    public static String process(String request) {
        String result = "";

        // Frases
        String[] phrases = {
            "La tecnología se alimenta a sí misma. La tecnología hace posible más tecnología.-Alvin Toffler.",
            "La tecnología es solo una herramienta. En términos de llevar a los niños a trabajar juntos y motivarlos, el profesor es el más importante.-Bill Gates.",
            "La máquina tecnológicamente más eficiente que el hombre ha inventado es el libro.-Northrop Frye.",
            "Ya no hacen más los bugs como bunny - Olav Mjelde",
            "Un lenguaje de programación es de bajo nivel cuando requiere que prestes atención a lo irrelevante.-Alan J. Perlis.",
            "Hablar es barato. Enséñame el código.-Linus Torvalds",
            "No me importa si funciona en su máquina! No me envían su máquina!.-Vidiu Platon",
            "Siempre codifica como si la persona que finalmente mantendrá tu código fuera un psicópata violento que sabe dónde vives.-Martin Golding"
        };
        ArrayList<String> phrasesList = new ArrayList<>();
        Collections.addAll(phrasesList, phrases);

        // Libros
        String[] books = {
            "Divina Comedia - Dante Alighieri",
            "Don Quijote de la Mancha - Miguel de Cervantes",
            "Cien años de soledad - Gabriel García Márquez",
            "Moby Dick - Herman Melville",
            "Ana Karenina - Lev Tolstói",
            "Eneida - Virgilio",
            "Otelo - William Shakespeare",
            "El viejo y el mar - Ernest Hemingway",
            "Orgullo y prejuicio - Jane Austen"
        };
        ArrayList<String> booksList = new ArrayList<>();
        Collections.addAll(booksList, books);

        if (request != null) {
            switch (request.toLowerCase()) {
                case "frase":
                    Collections.shuffle(phrasesList);
                    result = phrasesList.get(0);
                    break;
                case "libro":
                    Collections.shuffle(booksList);
                    result = booksList.get(0);
                    break;
                case "exit":
                    result = "bye";
                    break;
                default:
                    result = "La petición no se puede resolver.";
                    break;
            }
        }

        return result;
    }
}

