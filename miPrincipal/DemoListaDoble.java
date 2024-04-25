package miPrincipal;
import listaDobles.ListaDoblementeEnlazada;

public class DemoListaDoble {
    public static void menu() throws PosicionIlegalException{
        System.out.println("***********************");
        System.out.println("    Demo Lista Dobles   ");
        System.out.println("***********************");
        ListaDoblementeEnlazada<Integer> listaDobles = new ListaDoblementeEnlazada<Integer>();
        listaDobles.agregar(1);
        listaDobles.agregar(2);
        listaDobles.agregar(3);
        System.out.println(listaDobles.getValor(0));
        System.out.println(listaDobles.getValor(1));
        System.out.println(listaDobles.getValor(2));
        System.out.println("Mostrar los elementos despues de agregar");
        System.out.println("elemento 0: "+listaDobles.getValor(0));
        System.out.println("elemento 1: "+listaDobles.getValor(1));
        System.out.println("elemento 2: "+listaDobles.getValor(2));
        for (int i = 0; i < listaDobles.getTamanio(); i++) {
            System.out.println("elemento "+i+": "+listaDobles.getValor(i));
        }
        listaDobles.insertar(50, 1);
        for (int i = 0; i < listaDobles.getTamanio(); i++) {
            System.out.println("elemento "+i+": "+listaDobles.getValor(i));
        }
    }
}
