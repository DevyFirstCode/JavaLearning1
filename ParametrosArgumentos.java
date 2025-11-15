class ParametrosArgumentos {
    public static void main (String []args){
        int resultadoSuma = sumar(1, 2);
        multiplicar(resultadoSuma, 2);
    }

    public static int sumar(int num1, int num2){
        int resultado = num1 + num2;
        System.out.println(resultado);
        return resultado;
    }

    public static void multiplicar(int num1, int num2){
        int resultadoMultiplicacion;
        resultadoMultiplicacion = num1 * num2;
        System.out.println(resultadoMultiplicacion);
    }
}
