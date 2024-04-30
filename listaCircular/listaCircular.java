package listaCircular;
import miPrincipal.PosicionIlegalException;
import miPrincipal.Nodo;

public class listaCircular <T> {
    //primer elemento lista
    private Nodo<T> cabeza;
    //total elementos
    private int tamanio;
    //constructor
    public listaCircular() {
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
            //como hay un solo nodo, el siguiente apunta al mismo nodo
            nuevo.setSiguiente(nuevo);
            cabeza = nuevo;
        } else{
            Nodo<T> aux = cabeza;
            while(aux.getSiguiente() !=  cabeza ){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            //enlaza al ultimo nodo con el primer nodo
            nuevo.setSiguiente(cabeza);
        }
        tamanio++;
    } 
    //insertar nuevo elemento en la lista
    
    public void insertar(T valor, int pos) throws PosicionIlegalException{
        if (pos >= 0 && pos <= tamanio) {
            Nodo<T> nuevo = new Nodo<T>();
            nuevo.setValor(valor);
            if (pos == 0) {
                //buscar el ultimo nodo
                Nodo<T> ultimo = cabeza;
                while(ultimo.getSiguiente() != cabeza){
                    ultimo = ultimo.getSiguiente();
                }
                nuevo.setSiguiente(cabeza);
                cabeza = nuevo;
                //enlazar el ultimo con el nuevo primero
                ultimo.setSiguiente(cabeza);
            } else{
               //si el nodo se inserta al final de la lista
               if (pos == tamanio) {
                   Nodo<T> aux = cabeza;
                   while(aux.getSiguiente() != cabeza){

                       aux = aux.getSiguiente();
                   }
                   aux.setSiguiente(nuevo);
                   //enlazar el ultimo con el nuevo primero
                     nuevo.setSiguiente(cabeza);
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
                //buscar el ultimo nodo para enlazarlo con el nuevo cabeza
                Nodo<T> ultimo = cabeza;
                while(ultimo.getSiguiente() != cabeza){
                    ultimo = ultimo.getSiguiente();
                }
                //desplaza la cabeza al siguiente nodo
                cabeza = cabeza.getSiguiente();
                //enlazar el ultimo con la nueva cabeza
                ultimo.setSiguiente(cabeza);

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
