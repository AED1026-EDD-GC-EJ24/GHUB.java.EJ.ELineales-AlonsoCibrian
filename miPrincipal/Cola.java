package miPrincipal;

public class Cola <T> {
    //atributo cabeza, que apunta al primer elemento de la cola
        private Nodo <T> cabeza;    
    //atributo cola, que apunta al último elemento de la cola
        private Nodo <T> cola;
    //almacena el total de elementos de la cola
        private int tamanio;

    //constructor
        public Cola(){
            cabeza = null;
            cola = null;
            tamanio = 0;
        }

        public int getTamanio() {
            return tamanio;
        }

        public void setTamanio(int tamanio) {
            this.tamanio = tamanio;
        }

        //metodo para saber si es vacia
        public boolean esVacia(){
            return cabeza == null;
        }
        //encolar
        public void encolar(T valor){
            Nodo <T> nuevo = new Nodo <T>();
            //fijar el valor dentro del nodo
            nuevo.setValor(valor);

            if(esVacia()){
                //cabeza y cola apuntan al nuevo nodo
                cabeza = nuevo;
                cola = nuevo;
            }
            else{
                //se enlaza el nuevo nodo al final de la cola
                cola.setSiguiente(nuevo);
                //se actualiza la cola
                cola = nuevo;
            }
           //incrementa el tamanio por el nu8evo elemento 
            tamanio++;
        }
        //desencolar
        public void desencolar(){
            //si no es vacia 
            if(!esVacia()){
                //verificar si hay un solo elemento
                if(cabeza == cola){
                    //cabeza y cola apuntan a null
                    cabeza = null;
                    cola = null;
                }
                else{
                    //se elimina el primer elemento de la cola
                    //desplazando la cabeza al siguiente nodo
                    cabeza = cabeza.getSiguiente();
                }
               tamanio --;
            }

        }
        //Devuelve el primer valor 
        //frente
        public T frente(){
            if(!esVacia()){
                return cabeza.getValor();
            }
            return null;
        }

}
