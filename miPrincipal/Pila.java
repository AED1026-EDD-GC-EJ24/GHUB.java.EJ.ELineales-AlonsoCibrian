package miPrincipal;

public class Pila<T> {
    //atributo cabeza que apunta al tope la pila
    private Nodo<T> cabeza;
    //almacena el total de elementos de la pila
    private int tamanio;
    //constructor
    public Pila(){
        cabeza = null;
        tamanio = 0;
    }
    //metodo devuelve el total de elementos de la pila
    public int getTamanio(){
        return tamanio;
    }
    //metodo que devuelve true si la pila esta vacia
    public boolean esVacia(){
        return cabeza == null;
    }

    //Apilar un elemento nuevo
    public void apilar(T valor){
        //crear un nuevo nodo
        Nodo<T> nuevo = new Nodo<T>();
        //fijar el valor dentro del nodo
        nuevo.setValor(valor);
        if(esVacia()){
            //si la pila esta vacia, la cabeza de la pila apunta al nuevo nodo
            cabeza = nuevo;
        } else{
        //se enlaza el campo siguiente de nuevo con la cabeza
        nuevo.setSiguiente(cabeza);
        //la nueva cabeza de la pila pasa a ser nuevo
        cabeza = nuevo;
        }
       tamanio++;
    }
}