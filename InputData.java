import javax.swing.JOptionPane;
public class InputData {
    public static void main(String[] args) {
        //pedirNombre();
        pedirNumeros();
    }

    public static void pedirNombre(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
    }

    public static void pedirNumeros(){
        int numero1;
        int numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero: "));
        //System.out.println("usuario ingreso" + numero1 + " y " + numero2);
        JOptionPane.showMessageDialog(null,"usuario ingreso" + numero1 + " y " + numero2);
    }

}
