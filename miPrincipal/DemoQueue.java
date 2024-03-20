package miPrincipal;
import java.util.LinkedList;
import java.util.Queue; //interface
/*
 * Queue es una interface por lo que se requiere instanciar como un objeto
 * en concreto: se puede elegir una de las implementaciones de la API Collections
 * de java: pueden ser java.util.LinkedList o java.util.PriorityQueue
 * Linkedlist es una cola estandar y
 * PriorityQueue es una cola de prioridad que almacena los elemntos internos de acuerdo
 * a un orden
 * add() inserta un elemento a la cola
 * remove() remueve un elemento de la cola
 * 
 */
public class DemoQueue {
    public static void menu(){
        System.out.println("=================================");
        System.out.println("            QUEUE              ");
        System.out.println("=================================");
        System.out.println();

        Queue micola = new LinkedList<>();
        micola.add("ELEMENTO 1");
        micola.add("ELEMENTO 2");
        micola.add("ELEMENTO 3");
        //muestra primer elemento
        System.out.println("El primer elemento de la cola es: " + micola.peek());
        //remueve el primer elemento
        micola.remove();
        //muestra primer elemento
        System.out.println("El primer elemento de la cola es: " + micola.peek());
        micola.remove();
        //muestra primer elemento
        System.out.println("El primer elemento de la cola es: " + micola.peek());
        micola.remove();
        //muestra primer elemento
        System.out.println("El primer elemento de la cola es: " + micola.peek());
        
    }
}
