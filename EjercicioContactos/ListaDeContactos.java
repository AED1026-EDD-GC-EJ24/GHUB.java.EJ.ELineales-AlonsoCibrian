package EjercicioContactos;
import miPrincipal.*;

public class ListaDeContactos {
    //Atributos
	private Lista<Contacto> contactos;
	//metodos
	//Constructores
	public ListaDeContactos() {
		contactos = new Lista<Contacto>();
	}
	public Lista<Contacto> mostrarTodosLosContactos(){
		return contactos;
	}
	//agrega un nuevo contacto a la lista si todavia no hay ningun contacto
	public boolean agregarContacto(String nombres, String apellidos, String direccion,
	 String correo, String telefono, String celular) throws PosicionIlegalException{
	 Contacto con = buscarContacto(nombres, apellidos);
	
		

	}
	//busca un contacto en la lista con sus nombres y apellidos
	//return el contacto si se encuentra y null en caso contrario
	public Contacto buscarContacto(String nombres, String apellidos) throws PosicionIlegalException{
	for(int i=0; i<contactos.getTamanio(); i++){
		Contacto con = contactos.getValor(i);
		if(nombres.equals(con.getNombres()) && apellidos.equals(con.getApellidos())){
			return con;
		}
	}
	return null;
}

}
