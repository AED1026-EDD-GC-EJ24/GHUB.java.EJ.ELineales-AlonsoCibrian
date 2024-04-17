package cuadrupedo;

public class cuadrupedo {
    private int idCuadrupedo;
    private String tipo;
    //constructor
    public cuadrupedo(int idCuadrupedo, String tipo) {
        this.idCuadrupedo = idCuadrupedo;
        this.tipo = tipo;
    }
    //getters y setters
    public int getIdCuadrupedo() {
        return idCuadrupedo;
    }
    public void setIdCuadrupedo(int idCuadrupedo) {
        this.idCuadrupedo = idCuadrupedo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //metodo toString
    @Override
    public String toString() {
        return "Cuadrupedo = ID: " + idCuadrupedo + ", Tipo: " + tipo + "\n";
    }
}
