package miPrincipal;
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
    //insertar nuevo elemento en la lista
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if (pos >= 0 && pos <= tamanio) {
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            if (pos == 0) {
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
            } else{
               //si el nodo se inserta al final de la lista
               if (pos == tamanio) {
                   Nodo<T> aux = cabeza;
                   while(aux.getSiguiente() != null){
                       aux = aux.getSiguiente();
                   }
                   aux.setSiguiente(nuevo);
               } 
               //el nodo se inserta en medio de la lista
               else{
                   Nodo<T> aux = cabeza;
                   for (int i = 0; i <= pos-2; i++) {
                       aux = aux.getSiguiente();
                   }
                   nuevo.setSiguiente(aux.getSiguiente());
                   aux.setSiguiente(nuevo);
               }
            }
            tamanio++;
        }
        else{
            throw new PosicionIlegalException();
        }   

    } 
    public T getValor(int pos) throws PosicionIlegalException{
        if (pos >= 0 && pos < tamanio) {
          T valor;
          if (pos==0) {
            valor = cabeza.getValor();
            return valor;
          }else{
            Nodo<T> aux = cabeza;
            for (int i = 0; i <= pos-1; i++) {
                aux = aux.getSiguiente();
            }
            valor = aux.getValor();
            return valor;
          }
        }
        else{
            throw new PosicionIlegalException();
        }
    }

    public void remover(int pos) throws PosicionIlegalException{
        if (pos >= 0 && pos < tamanio) {
            if (pos == 0) {
                //eliminar el primer nodo de la lista
                cabeza = cabeza.getSiguiente();
                tamanio--;
            } else{ // remover el ultimo o en medio
                Nodo<T> aux = cabeza;
                for (int i = 0; i <= pos-2; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo<T> prox = aux.getSiguiente();
                aux.setSiguiente(prox.getSiguiente());
                tamanio--;
            }
        }
        else{
            throw new PosicionIlegalException();
        }
    }
    //eliminar todos los elementos de la lista
    public void limpiar(){
        cabeza = null;
        tamanio = 0;
    }
}
