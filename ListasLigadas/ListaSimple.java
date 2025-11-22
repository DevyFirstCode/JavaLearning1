package ListasLigadas;
public class ListaSimple {
    Nodo inicio =null;

    public void insertarNodo(Nodo nuevo){
        if(inicio == null){
            inicio = nuevo;
        }else{
            nuevo.Siguiente =inicio;
            inicio = nuevo;
        }
    }

    public void mostrarLista(){
        String lista ="Lista de datos \n";
        Nodo recorrer = inicio;

        if(recorrer == null){
            System.out.println("La lista esta vacia");
        }else{
            while(recorrer!=null){
                lista += "valor: " + recorrer.dato + "\n";
                recorrer = recorrer.Siguiente;
            }
        }
        System.out.println(lista);
        
    }

    public boolean eliminarPorDato(int dato){
        // Si la lista está vacía
        if(inicio == null){
            System.out.println("La lista está vacía");
            return false;
        }

        // Si el nodo a eliminar es el primero
        if(inicio.dato == dato){
            inicio = inicio.Siguiente;
            System.out.println("Nodo con dato " + dato + " eliminado");
            return true;
        }

        // Buscar el nodo con el dato especificado
        Nodo actual = inicio;
        while(actual.Siguiente != null){
            if(actual.Siguiente.dato == dato){
                actual.Siguiente = actual.Siguiente.Siguiente;
                System.out.println("Nodo con dato " + dato + " eliminado");
                return true;
            }
            actual = actual.Siguiente;
        }

        System.out.println("Nodo con dato " + dato + " no encontrado");
        return false;
    }
    
}
