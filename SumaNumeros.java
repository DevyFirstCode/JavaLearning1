class SumaNumeros {
    public static void main( String []args){
        sumarNumeros(10, 5);
        sumarNumeros(11, 51);
    }

    public static void sumarNumeros(int numero1, int numero2){
        int resultado;

        resultado = numero1 + numero2;
        System.out.println("El resultado es: " + resultado);
    }
}
