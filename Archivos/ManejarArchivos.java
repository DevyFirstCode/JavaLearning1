package Archivos;

public class ManejarArchivos {
    public static void main(String[] args) {
        String nombreArchivo = "archivo.txt";
        EscribeArchivo(nombreArchivo);
        LeerArchivo(nombreArchivo);
    }

    public static void EscribeArchivo(String nombreArchivo){
        try (var escritor = new java.io.PrintWriter(nombreArchivo)) {
            escritor.println("Hola Mundo");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
    }

    public static void LeerArchivo(String nombreArchivo){
        try (var lector = new java.io.BufferedReader(new java.io.FileReader(nombreArchivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (java.io.IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
