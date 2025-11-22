package PilaDinamica;

public class Pila {
    Nodo tope = null;  // Equivale al "inicio" de ListaSimple

    // PUSH: Insertar elemento al tope de la pila (basado en insertarNodo)
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        if(tope == null){
            tope = nuevo;
        }else{
            nuevo.Siguiente = tope;
            tope = nuevo;
        }
        System.out.println("Elemento " + dato + " apilado");
    }

    // POP: Sacar elemento del tope de la pila (basado en eliminar primero)
    public int pop(){
        if(tope == null){
            System.out.println("La pila está vacía - no se puede desapilar");
            return -1; // Valor que indica error
        }
        
        int datoSacado = tope.dato;
        tope = tope.Siguiente;
        System.out.println("Elemento " + datoSacado + " desapilado");
        return datoSacado;
    }

    // PEEK: Ver el elemento del tope sin sacarlo
    public int peek(){
        if(tope == null){
            System.out.println("La pila está vacía");
            return -1;
        }
        return tope.dato;
    }

    // LISTAR: Mostrar todos los elementos de la pila (basado en mostrarLista)
    public void mostrarPila(){
        String pila = "Contenido de la pila (tope → base) \n";
        Nodo recorrer = tope;

        if(recorrer == null){
            System.out.println("La pila está vacía");
        }else{
            while(recorrer != null){
                pila += "elemento: " + recorrer.dato + "\n";
                recorrer = recorrer.Siguiente;
            }
        }
        System.out.println(pila);
    }

    // Método adicional: Verificar si la pila está vacía
    public boolean estaVacia(){
        return tope == null;
    }
}
