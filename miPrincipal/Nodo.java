package miPrincipal;
public class Nodo<T>{
    //Atributos valor de tipo T. Almacena la referencia del objeto
    private T valor;
    //referencia al siguiente nodo enlaado
    private Nodo<T> siguiente;
    //Constructor por defecto
    public Nodo(){
        this.valor = null;
        this.siguiente = null;
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
    

}