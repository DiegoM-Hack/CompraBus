package Clases;
import java.util.List;

public class Normal extends Ticket{
    private boolean maletaAdicional;

    public Normal(Pasajero pasajero, Ruta ruta, List<Servicio> serviciosAdicionales, boolean maletaAdicional) {
        super(pasajero, ruta, serviciosAdicionales);
        this.maletaAdicional = maletaAdicional;
    }

    @Override
    public double calcularPrecioTotal() {
        double total = ruta.getPrecioBase();
        for (Servicio s : serviciosAdicionales) {
            total += s.getCosto();
        }
        if (maletaAdicional) total += 10.0;
        return total;
    }

    @Override
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
}
