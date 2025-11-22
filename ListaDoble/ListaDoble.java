package ListaDoble;

public class ListaDoble {

    NodoD inicio = null;
    
    public void insertarNuevoNodo(NodoD nuevoNodo){
        // Si no hay nodos
        if(inicio == null){
            inicio = nuevoNodo;
            System.out.println("Primer nodo insertado: " + nuevoNodo.dato);
        }else{
            // Si ya existen Nodos
            nuevoNodo.siguiente = inicio;
            inicio.anterior = nuevoNodo;
            inicio = nuevoNodo;
            System.out.println("Nodo insertado al inicio: " + nuevoNodo.dato);
        }
    }

    public void iterarDerecho(){
        String lista = "Lista de datos (derecho) \n";
        NodoD recorrer = inicio;

        if(recorrer == null){
            System.out.println("La lista esta vacia");
        }else{
            while(recorrer != null){
                lista += "valor: " + recorrer.dato + "\n";
                recorrer = recorrer.siguiente;
            }
        }
        System.out.println(lista);
    }

    public void iterarIzquierdo(){
        String lista = "Lista de datos (izquierdo) \n";
        NodoD recorrer = inicio;

        if(recorrer == null){
            System.out.println("La lista esta vacia");
        }else{
            // Primero llegar al último nodo
            while(recorrer.siguiente != null){
                recorrer = recorrer.siguiente;
            }
            
            // Ahora recorrer hacia atrás usando anterior
            while(recorrer != null){
                lista += "valor: " + recorrer.dato + "\n";
                recorrer = recorrer.anterior;
            }
        }
        System.out.println(lista);
    }

    public boolean eliminarPorDato(String dato){
        // Si la lista está vacía
        if(inicio == null){
            System.out.println("La lista está vacía");
            return false;
        }

        // Buscar el nodo con el dato especificado
        NodoD actual = inicio;
        while(actual != null){
            if(actual.dato.equals(dato)){
                // Caso 1: Es el único nodo en la lista
                if(actual.anterior == null && actual.siguiente == null){
                    inicio = null;
                }
                // Caso 2: Es el primer nodo (pero hay más nodos)
                else if(actual.anterior == null){
                    inicio = actual.siguiente;
                    inicio.anterior = null;
                }
                // Caso 3: Es el último nodo
                else if(actual.siguiente == null){
                    actual.anterior.siguiente = null;
                }
                // Caso 4: Es un nodo en el medio
                else{
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }
                
                System.out.println("Nodo con dato '" + dato + "' eliminado");
                return true;
            }
            actual = actual.siguiente;
        }

        System.out.println("Nodo con dato '" + dato + "' no encontrado");
        return false;
    }
}
