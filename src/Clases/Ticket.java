package Clases;
import java.util.List;
import java.util.ArrayList;

public abstract class Ticket {
    protected Pasajero pasajero;
    protected Ruta ruta;
    protected List<Servicio> serviciosAdicionales;

    public Ticket(Pasajero pasajero, Ruta ruta, List<Servicio> serviciosAdicionales) {
        this.pasajero = pasajero;
        this.ruta = ruta;
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public abstract double calcularPrecioTotal();

    // Metodo para mostrar información general del ticket
    public void mostrarDetalles() {
        System.out.println("=== TICKET ===");
        System.out.println("Pasajero: " + pasajero.getNombre());
        System.out.println("Ruta: " + ruta.getOrigen() + " -> " + ruta.getDestino());
        System.out.println("Hora de salida: " + ruta.getHoraSalida());
        System.out.println("Servicios adicionales:");
        for (Servicio s : serviciosAdicionales) {
            System.out.println(" - " + s.getNombre() + ": $" + s.getCosto());
        }
        System.out.println("Costo total: $" + calcularPrecioTotal());
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }
    public Ruta getRuta() {
        return ruta;
    }
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }




}
