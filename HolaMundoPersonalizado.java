class HolaMundoPersonalizado{
    public static void main( String [] args){
        //saludar();
        saludarPersonalizado("nuevos estudiantes");
        saludarPersonalizado("Profesores");
    }

    public static void saludar(){
        System.out.println("Bienvenidos");
    }

    public static void saludarPersonalizado(String publico){
        System.out.println("Bienvenido(s): " + publico);
    }
}
