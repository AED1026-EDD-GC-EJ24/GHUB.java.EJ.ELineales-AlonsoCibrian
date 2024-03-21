package miPrincipal;

public class Persona {
    // 3 atributs, nombre, edad y nacionalidad
    private String nombre;
    private int edad;
    private String nacionalidad;
    //constructor
    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    //metodo toString
    @Override
    public String toString() {
        return nombre + "," + edad + "," + nacionalidad;
    }

}
