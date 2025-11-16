import javax.swing.JOptionPane;

public class Actividad1 {
    /*
     * Crear un programa que pida al usuario la opcion de un un menu
     * El menu debe permitir elegir entre pedir pizza, hamburguesa o tacos
     * Si no es ninguna de estas opciones mostrar un mensaje de error.
     */

     public static void main(String[] args) {
        int opcionesUsuario = Integer.parseInt(JOptionPane.showInputDialog("SELECCIONE DEL MENU: 1.Pizza 2.Harburguesa 3.Tacos"));
        ordenarComida(opcionesUsuario);
    }

     public static void ordenarComida(int opciones){
        switch (opciones) {
            case 1:
                JOptionPane.showMessageDialog(null, "Usted pidio una pizza");
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Usted pidio harburguesa");
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "Usted pidio tacos");
            break;
            default:
                JOptionPane.showMessageDialog(null,"No se encuentra en el menu la opcion que ingreso");
            break;
        }
     }
}
