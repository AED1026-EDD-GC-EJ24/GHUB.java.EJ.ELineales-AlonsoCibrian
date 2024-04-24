package listaDobles;

public class Nodo<T>{
    //Atributos valor de tipo T. Almacena la referencia del objeto
    private T valor;
    //referencia al siguiente nodo enlaado
    private Nodo<T> siguiente;
    //referencia al nodo anterior enlazado
    private Nodo<T> anterior;

    //Constructor por defecto
    public Nodo(){
        this.valor = null;
        this.siguiente = null;
        this.anterior = null;
    }
    
    public T getValor(){
        return valor;
    }
    public void setValor(T valor){
        this.valor = valor;
    }
    public Nodo<T> getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo<T> siguiente){
        this.siguiente = siguiente;
    }
    public Nodo<T> getAnterior(){
        return anterior;
    }
    public void setAnterior(Nodo<T> anterior){
        this.anterior = anterior;
    }
    

}