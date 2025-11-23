package ProyectoListas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManejarArchivos {
    
    public static void guardarListaEnArchivo(ListaSimple listaAlumnos){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ListaAlumnos.txt"))) {
            Nodo actual = listaAlumnos.inicio;
            while (actual != null) {
                writer.write(actual.dato.toString());
                writer.newLine();
                actual = actual.Siguiente;
            }
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    public static ListaSimple cargarAlumnosDeLista(){
        ListaSimple listaAlumnos = new ListaSimple();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("ListaAlumnos.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                if (!linea.trim().isEmpty()) {  // Evitar líneas vacías
                    // Parsear la línea del archivo (formato: "ID Nombre Apellidos Correo")
                    String[] partes = linea.trim().split(" ", 4);  // Dividir en máximo 4 partes
                    
                    if (partes.length >= 4) {
                        try {
                            int id = Integer.parseInt(partes[0]);
                            String nombre = partes[1];
                            String apellidos = partes[2];
                            String correo = partes[3];
                            
                            // Crear objeto Alumno y Nodo
                            Alumno alumno = new Alumno(id, nombre, apellidos, correo);
                            Nodo nuevoNodo = new Nodo(alumno);
                            listaAlumnos.insertarNodo(nuevoNodo);
                        } catch (NumberFormatException e) {
                            System.out.println("Error al parsear ID del alumno: " + linea);
                        }
                    } else {
                        System.out.println("Línea con formato incorrecto: " + linea);
                    }
                }
            }
            System.out.println("Lista de alumnos cargada exitosamente desde el archivo.");
        } catch (IOException e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
            System.out.println("Se retornará una lista vacía.");
        }
        
        return listaAlumnos;
    }
}
