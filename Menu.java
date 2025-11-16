class Menu {
    public static void main(String[] args) {
        seleccionarOpcion(4);
    }

    public static void seleccionarOpcion(int opcion){

        switch (opcion) {
            case 1:
                System.out.println("Selecciono 1");
            break;
            case 2:
                System.out.println("Selecciono 2");
            break;
            case 3:
                System.out.println("Selecciono 3");
            break;
        
            default:
                System.out.println("Selecciono una opcion no valida");
            break;
        }
    }
}
