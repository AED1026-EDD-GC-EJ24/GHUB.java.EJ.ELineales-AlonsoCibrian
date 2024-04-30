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
    //Desapilar o eliminar un elemento de la pila
    public void retirar(){
        if(!esVacia()){
            //la cabeza de la pila pasa a ser el siguiente nodo
            cabeza = cabeza.getSiguiente();
            tamanio--;
        }
    }
    //Devuelve el elemento almacenado en el TOPE de la pila
    public T cima(){
        if(!esVacia()){
            //devuelve el valor almacenado en la cabeza de la pila
            return cabeza.getValor();
        }
        return null;
    }
    //metodo buscar
    /*
     * se busca que regrese la posicion dentro de la pila
     * si el objeto se encuentra, si no, en caso contrario regresar
     * un -1 cuando no se encontro
     */
    public int buscar (T valor){
        int posicion = 0;
        Nodo<T> aux = cabeza;
        while(aux != null){
            if(aux.getValor().equals(valor)){
                return posicion;
            }
            posicion++;
            aux = aux.getSiguiente();
        }
        return -1;
    }
    
}