
package miPrincipal;
public class DemoListaSimple {
        public static void menu() throws PosicionIlegalException {
            System.out.println("************************");
            System.out.println("*     Lista Simple     *");
            System.out.println("************************");
            System.err.println();
            Lista <Integer> lista = new Lista<Integer>();
            //agrega 3 elementos a la lista
             lista.agregar(12); 
             lista.agregar(15);
             lista.agregar(20);
            //imprimir los datos agregados
            System.out.println("Dato en la posicion 0: " + lista.getValor(0));
            System.out.println("Dato en la posicion 1: " + lista.getValor(1));
            System.out.println("Dato en la posicion 2: " + lista.getValor(2));
            //insertar un 13 en posicion 1
            lista.insertar(13, 1);
            //insertar un 16 en posicion 3
            lista.insertar(16, 3);
            //imprimir los datos agregados
            System.out.println("Nuevos datos agregados");
            System.out.println("Dato en la posicion 0: " + lista.getValor(0));
            System.out.println("Dato en la posicion 1: " + lista.getValor(1));
            System.out.println("Dato en la posicion 2: " + lista.getValor(2));
            System.out.println("Dato en la posicion 3: " + lista.getValor(3));
            System.out.println("Dato en la posicion 4: " + lista.getValor(4));
            //Insertar un elemento en posicion 6 para comprobar que funciona la excepcion
            // lista.insertar(17, 6);
            //eliminar posicion 0 
            lista.remover(0);
            //eliminar posicion 3
            lista.remover(3);
            //imprimir los datos despues de la eliminación
            System.out.println("Datos despues de eliminar");
            System.out.println("Dato en la posicion 0: " + lista.getValor(0));
            System.out.println("Dato en la posicion 1: " + lista.getValor(1));
            System.out.println("Dato en la posicion 2: " + lista.getValor(2));
        }
        
}
