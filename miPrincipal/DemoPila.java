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

    //buscar un elemento en la pila que sí esta    
    int pos = pila.buscar(5);
    if(pos != -1){
        System.out.println("El elemento se encuentra en la posicion: " + pos);
    } else{
        //regresar el -1 si no se encontro el elemento
        System.out.println(-1);
    }
    //buscar un elemento en la pila que no esta
    pos = pila.buscar(10);
    if(pos != -1){
        System.out.println("El elemento se encuentra en la posicion: " + pos);
    } else{
        //regresar el -1 si no se encontro el elemento
        System.out.println("Elemento no encontrado en la pila " + -1);

    }
}
}