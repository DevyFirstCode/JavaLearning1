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
}
