package miPrincipal;
import java.util.Stack;
public class DemoStack {
    public static void main(String[] args) {
        //crear una nueva pila de enteros
        Stack<Integer> pila = new Stack<Integer>();
        //apilar elementos con .push()
        pila.push(2);
        pila.push(6);
        pila.push(7);
        //buscamos elemento
        System.out.println("El elemento 6 esta en la  posición : " + pila.search(6));

        //mostrar el tope de la pila con .peek()
        System.out.println("El tope de la pila es: " + pila.peek());
        //desapilar un elemento con .pop()
        pila.pop();
        System.out.println("El tope de la pila es: " + pila.peek());
        pila.pop();
        System.out.println("El tope de la pila es: " + pila.peek());

        //invocar a la clase demostack
      
    }
}
