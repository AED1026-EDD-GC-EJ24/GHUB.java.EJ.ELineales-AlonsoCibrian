package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion;
        do {
            Scanner rd = new Scanner(System.in);
            
            // hacer un menu
            System.out.println("======================");
            System.out.println("Estructuras lineales");
            System.out.println("======================");
            System.out.println("1. Pila");
            System.out.println("2. Stack");
            System.out.println("0. Salir");
            System.out.println();
            
            System.out.println("Ingrese una opcion: ");
            opcion = rd.nextInt();
            
            switch (opcion) {
                case 1:
                    DemoPila.menu();
                    break;
                case 2:
                    DemoStack.menu();
                    break;
                case 0:
                    System.out.println("BYE BYE!");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }
}
