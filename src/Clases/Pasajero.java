package Clases;

public class Pasajero {
    private String nombre;
    private String apellido;
    private String destino;
    private String cedula;

    public Pasajero(String nombre, String destino, String cedula) {
        this.nombre = nombre;
        this.destino = destino;
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }


}
