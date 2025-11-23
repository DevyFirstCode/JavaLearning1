public class EjercicioArreglos {
    public static void main(String[] args) {
        manejarArreglos();
    }

    public  static void manejarArreglos(){
        String vAlumnos[];
        vAlumnos = new String[4];


        vAlumnos[0] ="Jose";
        vAlumnos[1] = "Daniel";
        vAlumnos[2] = "Raul";
        vAlumnos[3] = "Consuelo";
        
        for(int i = 0; i<vAlumnos.length; i++){
            //System.out.println(vAlumnos[i]);
            System.out.println("posicion[" + i +"] :" + vAlumnos[i] );
        }

    }
}

// Ejercicio de reforzamiento
//Craer un array de numeros, y con un ciclo sumar todos los valores y pintar el resultado