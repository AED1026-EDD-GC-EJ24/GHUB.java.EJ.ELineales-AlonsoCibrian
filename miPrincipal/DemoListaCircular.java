package miPrincipal;
import listaCircular.listaCircular;

public class DemoListaCircular {
    public static void menu() throws PosicionIlegalException {
        System.out.println("***********************");
        System.out.println("   Demo Lista Circular  ");
        System.out.println("***********************");
        System.out.println();
        listaCircular<Integer> lc= new listaCircular<Integer>();
        lc.agregar(10);
        lc.agregar(20);
        lc.agregar(30);
        //mostrarlos
        System.out.println("Lista Circular");
        //mostrar cada uno de los elementos por separado
        for (int i = 0; i < lc.getTamanio(); i++) {
            System.out.println("Elemento " + i + ": " + lc.getValor(i));
        }
        lc.insertar(50, 1);
    

        

    }
}