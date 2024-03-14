package miPrincipal;

public class DemoPila {
    public static void menu() {
        System.out.println("===========================");
        System.out.println("        DEMO PILA           ");
        System.out.println("===========================");

        // crear una nueva pila de enteros
        Pila<Integer> pila = new Pila<Integer>();

        // apilar elementos
        pila.apilar(2);
        pila.apilar(5);
        pila.apilar(7);

        System.out.println("El tope de la pila es: " + pila.cima());

        // desapilar un elemento
        pila.retirar();

        System.out.println("El tope de la pila es: " + pila.cima());
    }
}
