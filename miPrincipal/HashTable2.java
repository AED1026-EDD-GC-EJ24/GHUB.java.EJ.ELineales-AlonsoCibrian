package miPrincipal;

import java.util.*; //clase linkedlist, hastable, vector, collection 

public class HashTable2<T> {
    private Hashtable<String, LinkedList<T>> tabla;
    private Vector<String> claves;

    //constructor
    public HashTable2() {
        tabla = new Hashtable<String, LinkedList<T>>();
        claves = new Vector<String>();
    }

    public void put(String key, T elm){
        LinkedList <T> lst = tabla.get(key);
        if(lst == null){
            lst = new LinkedList<T>();
            tabla.put(key, lst);
            claves.add(key);
        }
        lst.addLast(elm);
    }

    //metodo get
    public LinkedList<T> get(String key){
        return tabla.get(key);
    }
    public Collection <String> keys(){
        return claves;
    }
    
}
