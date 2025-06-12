import Clases.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import static Clases.Ruta.mostrarRutas;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Ruta> rutas = Arrays.asList(
                new Ruta("Quito", "Guayaquil", "08:00", 8.0, 20.0),
                new Ruta("Quito", "Tulcán", "09:00", 6.0, 17.5),
                new Ruta("Quito", "Puyo", "07:30", 5.0, 15.0),
                new Ruta("Quito", "Riobamba", "10:00", 4.0, 17.5)
        );

        int opcion;
        do {
            // Menu principal
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Mostrar rutas");
            System.out.println("2. Comprar ticket");
            System.out.println("3. Mostrar tickets");
            //System.out.println("4. Actualizar ticket");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextInt();

            // Ejecuta la opcion seleccionada
            switch(opcion) {
                case 1 -> mostrarRutas();
                case 2 -> SistemaReservas.comprarTicket(rutas);
                case 3 -> SistemaReservas.mostrarTickets();
                //case 4 -> SistemaReservas.actualizarTicket(rutas);
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while(opcion != 0); // Continua hasta que el usuario decida salir


    }
}