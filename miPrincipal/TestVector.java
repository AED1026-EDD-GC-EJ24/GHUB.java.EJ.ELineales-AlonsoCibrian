package miPrincipal;
import java.util.Collection;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
       //el metodo obtenerlista() retorna una coleccion tipo vector
       Collection <String> coll = UNombres.obtenerlista();
         //recorrer la coleccion
            for (String nom : coll){
                System.out.println(nom);
            }

    }
}
