import javax.swing.JOptionPane;

public class MenuBucle {
    public static void main(String[] args) {
        
            seleccionarMenu();
    }

    public static void seleccionarMenu(){
        int opciones =0;
        do{
            opciones = Integer.parseInt(
            JOptionPane.showInputDialog("Ingrese una opcion"));
            switch (opciones) {
                case 1:
                    System.out.println("Selecciono 1");
                    break;
                case 2:
                    System.out.println("Selecciono 2");
                    break;
                case 3:
                    System.out.println("Hasta luego");
                break;
                default:
                    break;
            }

        }while(opciones!=3);
    }
}
