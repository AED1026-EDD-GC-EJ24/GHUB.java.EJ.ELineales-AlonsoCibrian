package miPrincipal;
import java.util.Stack;
public class DemoStack {
    public static void menu() {
        System.out.println("===========================");
        System.out.println("        DEMO STACK          ");
        System.out.println("===========================");
        // Crear una nueva pila de enteros
        Stack<Integer> pila = new Stack<Integer>();
        // Apilar elementos con .push()
        pila.push(2);
        pila.push(6);
        pila.push(7);       
        // Buscar elemento
        System.out.println("El elemento 6 esta en la posición: " + pila.search(6));

        // Mostrar el tope de la pila con .peek()
        System.out.println("El tope de la pila es: " + pila.peek());

        // Desapilar un elemento con .pop()
        pila.pop();
        System.out.println("El tope de la pila es: " + pila.peek());
        pila.pop();
        System.out.println("El tope de la pila es: " + pila.peek());
    
       } 
}

