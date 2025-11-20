package ListasLigadas;

public class SistemaListas {
    public static void main(String[] args) {
        ListaSimple listaNumeros = new ListaSimple();

        Nodo newItem = new Nodo(1);
        Nodo newItem2 = new Nodo(2);
        listaNumeros.insertarNodo(newItem);
        listaNumeros.insertarNodo(newItem2);
        newItem = new Nodo(3);
        listaNumeros.insertarNodo(newItem);

        listaNumeros.mostrarLista();

    }
}
