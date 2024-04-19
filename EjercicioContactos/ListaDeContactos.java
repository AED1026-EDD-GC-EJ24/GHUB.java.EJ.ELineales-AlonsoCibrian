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
	if (con == null){
		Contacto nuevo = new Contacto(nombres, apellidos, direccion, correo, telefono, celular);
		contactos.agregar(nuevo);
		return true;
	}else{
		return false;
	}
	}
	//elimina un contacto de la lista si se encuentra
	//dado sus nombres y apellidos si el usuario existe en la lista
	//se elimina, return true, en caso contrario return false
	public boolean eliminarContacto(String nombres, String apellidos) throws PosicionIlegalException{
		Contacto con = buscarContacto(nombres, apellidos);
		if (con != null) 
		{
		for(int i=0; i<contactos.getTamanio(); i++){
			Contacto aux = contactos.getValor(i);
			if(aux.getNombres().equals(nombres) && aux.getApellidos().equals(apellidos)){
				contactos.remover(i);
			}
		}
		return true;
		}
		else
		{
		return false;
		}
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
	return null; //no se encontro el contacto
	}
	//modificar los contactos
	public boolean modificarContacto(String nombres, String apellidos , String direccion, String correo, String telefono, String celular) throws PosicionIlegalException
	{
		//verificar si el contacto existe
		Contacto con = buscarContacto(nombres, apellidos);
		if(con == null){
			return false;
		}else{
			con.setDireccion(direccion);
			con.setCorreo(correo);
			con.setTelefono(telefono);
			con.setCelular(celular);
			return true;
		}
	}
}




