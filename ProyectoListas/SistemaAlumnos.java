package ProyectoListas;

public class SistemaAlumnos {
    static ListaSimple listaAlumnos;
    public static void main(String[] args) {
        Nodo newNodoAluNodo;
        listaAlumnos = new ListaSimple();

        listaAlumnos = ManejarArchivos.cargarAlumnosDeLista();
        Alumno alumno1 = new Alumno(4,"Raul", "Gomez", "code@hotmail.com");
        newNodoAluNodo = new Nodo(alumno1);
        listaAlumnos.insertarNodo(newNodoAluNodo);
        listaAlumnos.mostrarLista();
        ManejarArchivos.guardarListaEnArchivo(listaAlumnos);
    }
}
