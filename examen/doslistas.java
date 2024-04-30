package examen;

import miPrincipal.Lista;
import miPrincipal.Nodo;
import miPrincipal.PosicionIlegalException;

public class doslistas<T> {
    /*
     * concatenar dos listas list1 y list2, dejando el resultado 
     * en la primera de ellas
     * cree un metodo con las siguientes caracteristicas
     * public voidpublic void concatLista(Lista<T> lst1, Lista<T> lst2)
     */

    public static void main(String[] args) throws PosicionIlegalException {
        Lista<Integer> list1 = new Lista<Integer>();
        Lista<Integer> list2 = new Lista<Integer>();
        list1.agregar(1);
        list1.agregar(2);
        list1.agregar(3);
        list2.agregar(4);
        list2.agregar(5);
        list2.agregar(6);
        System.out.println("Lista 1 antes de concatenar:");
        System.out.println("Dato en la posicion 0: " + list1.getValor(10));
        System.out.println("Dato en la posicion 1: " + list1.getValor(20));
        System.out.println("Dato en la posicion 2: " + list1.getValor(30));
        System.out.println("Lista 2 antes de concatenar:");
        System.out.println("Dato en la posicion 0: " + list2.getValor(40));
        System.out.println("Dato en la posicion 1: " + list2.getValor(50));
        System.out.println("Dato en la posicion 2: " + list2.getValor(60));
        concatLista(list1, list2);
        System.out.println("Lista 1 después de concatenar:");
        System.out.println("Dato en la posicion 0: " + list1.getValor(0));
        System.out.println("Dato en la posicion 1: " + list1.getValor(1));
        System.out.println("Dato en la posicion 2: " + list1.getValor(2));
        System.out.println("Dato en la posicion 3: " + list1.getValor(3));
        System.out.println("Dato en la posicion 4: " + list1.getValor(4));
        System.out.println("Dato en la posicion 5: " + list1.getValor(5));

       
    }
    public static <T> void concatLista(Lista<T> lst1, Lista<T> lst2) throws PosicionIlegalException {
        for (int i = 0; i < lst2.getTamanio(); i++) {
            lst1.agregar(lst2.getValor(i));
        }
    }
    }


