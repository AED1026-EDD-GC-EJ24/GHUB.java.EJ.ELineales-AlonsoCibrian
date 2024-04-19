package EjercicioContactos;
import miPrincipal.*;

public class DemoListaContactos {
    public static void menu() throws PosicionIlegalException{
        System.out.println("**************************");
        System.out.println("Lista de Contactos");
        System.out.println("**************************");
        System.out.println();
        ListaDeContactos ldc = new ListaDeContactos();
       //agregamos algunos contactos
        ldc.agregarContacto("Sergio", "Perez", "Calle 1", "fernando@gmail.com", "6672034745","6677175551");
        ldc.agregarContacto("Maria", "Barbara", "Calle 2", "barbara@gmail.com", "667567567","6677175552");
        ldc.agregarContacto("Alonso", "Cibrian", "Calle 3", "cibrian@gmail.com", "667123456","6671234567");
        ldc.agregarContacto("Alondra", "Olea", "Calle 4", "olea@gmail.com", "667221707","6677472217");
        System.out.println("LISTADO DE CONTACTOS");
        Lista<Contacto> listado = ldc.mostrarTodosLosContactos();
        for(int i=0; i<listado.getTamanio(); i++){
            System.out.println(listado.getValor(i));
        }
        if(ldc.eliminarContacto("Maria", "Barbara")){
            System.out.println("Contacto eliminado");
        System.out.println("LISTADO DE CONTACTOS despues de eliminar ");
        listado = ldc.mostrarTodosLosContactos();
        for(int i=0; i<listado.getTamanio(); i++){
            System.out.println(listado.getValor(i));
        }
}
ldc.modificarContacto("Alonso", "Cibrian", "Calle 5", "cibrian@gmail.com","6678252323","6674626226");
System.out.println("LISTADO DE CONTACTOS despues de modificar ");
listado = ldc.mostrarTodosLosContactos();
for(int i=0; i<listado.getTamanio(); i++){
    System.out.println(listado.getValor(i));  
  }
}
}
