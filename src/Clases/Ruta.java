package Clases;

public class Ruta {
    private String origen;
    private String destino;
    private String horaSalida;
    private double duracion; // en horas
    private double precioBase;

    public Ruta(String origen, String destino, String horaSalida, double duracion, double precioBase) {
        this.origen = origen;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.duracion = duracion;
        this.precioBase = precioBase;
    }

    public static void mostrarRutas(){
        System.out.println("===Rutas del servicio===");
        System.out.println("1. Quito-Guayaquil (pasaje: $20)\n" );
        System.out.println("2. Quito-Puyo (pasaje: $15)\n");
        System.out.println("3. Quito-Tulcán (pasaje: $17,50)\n");
        System.out.println("4. Quito-Riobamba (pasaje: $17,50)\n");
    }

    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {}
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {}
    public String getHoraSalida() {
        return horaSalida;
    }
    public void setHoraSalida(String horaSalida) {}
    public double getDuracion() {
        return duracion;
    }
    public void setDuracion(double duracion) {}
    public double getPrecioBase() {
        return precioBase;
    }
    public void setPrecioBase(double precioBase) {}

}
