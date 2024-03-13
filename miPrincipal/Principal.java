package miPrincipal;

public class Principal {
    public static void main(String[] args) {
        //crear una nueva pila de enteros
        Pila<Integer> pila = new Pila<Integer>();
        //apilar elementos
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);
        System.out.println("El tope de la pila es: " + pila.cima());
        //desapilar un elemento
        pila.retirar();
        System.out.println("El tope de la pila es: " + pila.cima());
        
    }
}
