package Clases;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class SistemaReservas {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Ticket> tickets = new ArrayList<>();

    public static void comprarTicket(List<Ruta> rutasDisponibles) {
        System.out.println("=== COMPRA DE TICKET ===");

        System.out.print("Nombre del pasajero: ");
        String nombre = scanner.nextLine();
        System.out.print("Cédula: ");
        String cedula = scanner.nextLine();
        System.out.print("Correo: ");
        String correo = scanner.nextLine();

        Pasajero pasajero = new Pasajero(nombre, cedula, correo);

        System.out.println("Rutas disponibles:");
        for (int i = 0; i < rutasDisponibles.size(); i++) {
            Ruta r = rutasDisponibles.get(i);
            System.out.println((i + 1) + ". " + r.getOrigen() + " -> " + r.getDestino() + " ($" + r.getPrecioBase() + ")");
        }
        System.out.print("Seleccione ruta (1-" + rutasDisponibles.size() + "): ");
        int opcionRuta = Integer.parseInt(scanner.nextLine());
        Ruta rutaSeleccionada = rutasDisponibles.get(opcionRuta - 1);

        System.out.print("Tipo de ticket (1: Normal, 2: VIP): ");
        int tipo = Integer.parseInt(scanner.nextLine());

        List<Servicio> servicios = new ArrayList<>();

        if (tipo == 1) {
            servicios.add(new Servicio("Selección de asiento", 2.0));
            servicios.add(new Servicio("1 maleta incluida", 0.0));
            System.out.print("¿Desea maleta adicional? (s/n): ");
            boolean adicional = scanner.nextLine().equalsIgnoreCase("s");
            Ticket ticket = new Normal(pasajero, rutaSeleccionada, servicios, adicional);
            tickets.add(ticket);
            ticket.mostrarDetalles();
        } else {
            servicios.add(new Servicio("WiFi", 5.0));
            servicios.add(new Servicio("TV", 4.0));
            servicios.add(new Servicio("Bebidas", 3.0));
            servicios.add(new Servicio("2 maletas incluidas", 0.0));
            System.out.print("¿Desea maleta adicional? (s/n): ");
            boolean adicional = scanner.nextLine().equalsIgnoreCase("s");
            Ticket ticket = new VIP(pasajero, rutaSeleccionada, servicios, adicional);
            tickets.add(ticket);
            ticket.mostrarDetalles();
        }
    }

    public static void mostrarTickets() {
        if (tickets.isEmpty()) {
            System.out.println("No hay tickets comprados.");
        } else {
            for (Ticket t : tickets) {
                t.mostrarDetalles();
                System.out.println();
            }
        }
    }

    public static void actualizarTicket(List<Ruta> rutasDisponibles) {
        System.out.print("Ingrese la cédula del pasajero a actualizar: ");
        String cedula = scanner.nextLine();

        for (Ticket t : tickets) {
            if (t.getPasajero().getCedula().equals(cedula)) {
                System.out.println("Seleccione nueva ruta:");
                for (int i = 0; i < rutasDisponibles.size(); i++) {
                    Ruta r = rutasDisponibles.get(i);
                    System.out.println((i + 1) + ". " + r.getOrigen() + " -> " + r.getDestino() + " ($" + r.getPrecioBase() + ")");
                }
                System.out.print("Seleccione nueva ruta (1-" + rutasDisponibles.size() + "): ");
                int nuevaRuta = Integer.parseInt(scanner.nextLine());
                t.setRuta(rutasDisponibles.get(nuevaRuta - 1));
                System.out.println("Ruta actualizada exitosamente.");
                t.mostrarDetalles();
                return;
            }
        }
        System.out.println("Pasajero no encontrado.");
    }
}
