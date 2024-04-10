public class Lista<T> {
    //primer elemento lista
    private Nodo<T> cabeza;
    //total elementos
    private int tamanio;
    //constructor
    public Lista() {
        cabeza = null;
        tamanio = 0;
    }

    public int getTamanio() {
        return tamanio;
    }
    public boolean esVacia() {
       if (cabeza == null) 
           return true;
        else 
            return false;
    }
    public void agregar(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (esVacia()) {
            cabeza = nuevo;
        } else{
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    } 
}
