package miPrincipal;
import java.util.*;
import cuadrupedo.cuadrupedo;

/*
 * Se introduce 10000 cuadrupedos en una lista de tipo estatica list y dinamica
 * linkedlist, el atributo tipo debe establecerse de forma aleatoria
 * a continuación el programa debe mostrar por consola los datos de los objetos con idCuadrupedo multiplo
 * de 1000 y mostrar un resumen de cuantos cuadrupedos hay por cada grupo y mostrarlo por medio 
 * de un iterador la lista de todos los cuadrupedos creados aleatoriamente
 * 
 */

public class DemoLinkedListCuadrupedos {
    public static void menu(){
        System.out.println("**************************");
        System.out.println("LinkedList de Cuadrúpedos");
        System.out.println("**************************");
        try {
            List <cuadrupedo> cuadrupedos = new ArrayList<cuadrupedo>();
            String[] tipos = {"Perro", "Gato", "León", "Elefante"};
            Random r = new Random();
            for (int i = 1; i < 10000; i++) {
                String tipo = tipos[r.nextInt(tipos.length)];
                cuadrupedos.add(new cuadrupedo(i, tipo));
            }
            int leonCount = 0, perroCount = 0, gatoCount = 0, elefanteCount = 0;
            for (cuadrupedo c : cuadrupedos) {
                if (c.getIdCuadrupedo() % 1000 == 0) {
                    System.out.println("ID: " + c.getIdCuadrupedo() + ", Tipo: " + c.getTipo() + "\n");
                }
                switch (c.getTipo()) {
                    case "Perro":
                        perroCount++;
                        break;
                    case "Gato":
                        gatoCount++;
                        break;
                    case "León":
                        leonCount++;
                        break;
                    case "Elefante":
                        elefanteCount++;
                        break;
                    
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
