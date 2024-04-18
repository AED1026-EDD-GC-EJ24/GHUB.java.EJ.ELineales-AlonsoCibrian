package miPrincipal;

import java.util.Scanner;

import EjercicioContactos.DemoListaContactos;

public class Principal {
    public static void main(String[] args) throws PosicionIlegalException {
        int opcion;
        do {
            Scanner rd = new Scanner(System.in);
                
            // hacer un menu
            System.out.println("======================");
            System.out.println("Estructuras lineales");
            System.out.println("======================");
            System.out.println("1. Pila");
            System.out.println("2. Stack");
            System.out.println("3. Delimitadores");
            System.out.println("4. Expresión infija a posfija");
            System.out.println("5. Cola");
            System.out.println("6. DemoQueue");
            System.out.println("7. Tablas de Dispersión");
            System.out.println("8: Estructura Combinada");
            System.out.println("9: Lista simplemente enlazada");
            System.out.println("10: LinkedList y ArrayList: ");
            System.out.println("11: Arraylisy de Personas");
            System.out.println("12: LinkedList de Cuadrúpedos");
            System.out.println("13: Lista de Contactos");

            System.out.println();

            System.out.println("0) Salir");
            System.out.print("Selecciona opción:");
            opcion = rd.nextInt();
            switch (opcion) {
                case 1:
                    DemoPila.menu();
                    break;

                case 2:
                    DemoStack.menu();
                    break;
                case 3:
                   DemoDelimitador.menu();
                   break;
                case 4:
                   // DemoExpresion.menu();
                    break;
                case 5:
                    DemoCola.menu();
                    break;
                case 6:
                    DemoQueue.menu();
                    break;
                case 7:
                    DemoTablaDispersion.menu();
                    break;
                case 8:
                    DemoEstructuraCombinada.menu();
                    break;
                case 9:
                    DemoListaSimple.menu();
                    break;
                case 10:
                    DemoLinkedListArrayList.menu();
                    break;
                case 11:
                   DemoArrayListPersonas.menu();
                    break;
                case 12:
                  DemoLinkedListCuadrupedos.menu();
                    break;
                case 13:
                    DemoListaContactos.menu();
                    break;
                    
                case 0:
                    System.out.println("ADIOS!");
                    rd.close();
                    break;
                default:
                    System.out.println("Valor incorrecto, intente de nuevo");
                    break;
            }

        }while (opcion !=0);

        
    }
}
