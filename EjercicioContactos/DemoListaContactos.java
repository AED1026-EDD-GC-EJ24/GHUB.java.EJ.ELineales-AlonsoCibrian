package EjercicioContactos;
import miPrincipal.*;
public class DemoListaContactos {
    public static void menu() throws PosicionIlegalException{
        System.out.println("****************************");
        System.out.println("      Lista de Contactos    ");
        System.out.println("****************************");
        System.out.println();
        ListaDeContactos ldc = new ListaDeContactos();
        //agregamos algunos contactos
        ldc.agregarContacto("Fernando", "Castro", "C11 12 No 12-12 Papagayo",
        "fernando@gmail.com","8207858","314878245");
        ldc.agregarContacto("Maria Andrea", "Vargas",
        "C11 11 No 10-45", "mariv@gmail.com","8237252","3113231231");
        ldc.agregarContacto("Carolina","Sanchez",
        ",","carolsa@gmail.com","8211121","3001235845");
        ldc.agregarContacto("Federica","Cardenas",
        ",","fede@gmail.com","8332322","3001257845");
        System.out.println("---Listado de todos los contacto---");
        Lista<Contacto> listado = ldc.mostrarTodosLosContactos();
        for(int i=0;i<listado.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }
        if (ldc.eliminarContacto("Fernando", "Castro"))
        {
            System.out.println("Contacto eliminado");
        }
        listado =ldc.mostrarTodosLosContactos();
        System.out.println("---Listado de todos los contacto despues de la eliminacion---");
        for(int i=0;i<listado.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }
        ldc.modificarContacto("Federica", "Cardenas",
        "Cra 16 No 11-12 Cali","fernando@gmail.com","8252323","314878245");
        listado =ldc.mostrarTodosLosContactos();
        System.out.println("---Listado de todos los contacto despues de la modificacion---");
        for(int i=0;i<listado.getTamanio();i++){
            System.out.println(listado.getValor(i));
        }
        System.out.println("---- Elemento Buscado ---");
        System.out.println("Elemento buscado:"+ldc.buscarContacto("Carolina", "Sanchez"));   
    } 
}