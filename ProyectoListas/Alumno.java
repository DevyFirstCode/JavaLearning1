package ProyectoListas;
class Alumno{

    int AlumnoId;
    String Nombre;
    String Apellidos;
    String Correo;

    public Alumno(int alumnoId, String nombre, String apellidos, String correo) {
        this.AlumnoId = alumnoId;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Correo = correo;
    }

    public String toString(){
        return AlumnoId + " " + Nombre + " " + Apellidos + " " + Correo;
    }
}