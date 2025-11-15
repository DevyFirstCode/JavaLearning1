public class Condiciones {
    public static void main (String [] args){
        int edad = 20;
        int edad2 =15;
        validarEdad(edad);
        validarEdad(edad2);

    }

    public static void validarEdad(int edad){
        if(edad>=18){
            System.out.println("El usuario puede tomar el riesgo");
        }else{
            System.out.print("El usuario no es mayor de edad, no puede tomar el riesgo");
        }
    }
}
