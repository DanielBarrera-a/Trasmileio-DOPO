package Logica;

import java.util.Scanner;

public class Transmilenio {

    public static void main(String[] args) {
        SistemaDeTransmilenio sistema = new SistemaDeTransmilenio();
        Scanner scanner = new Scanner(System.in);
        int opcion = -1;


        while (opcion != 0) {
            System.out.println("1. Consultar tiempo de espera de una estación");
            System.out.println("2. Listar rutas ordenadas alfabéticamente");
            System.out.println("3. Buscar rutas sin transbordo entre dos estaciones");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un número válido.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre de la estación: ");
                    String nombreEstacion = scanner.nextLine().trim();
                    System.out.println();
                    sistema.consultarTiempoEspera(nombreEstacion);
                    break;

                case 2:
                    System.out.println();
                    sistema.listarRutasAlfabeticamente();
                    break;

                case 3:
                    System.out.print("Ingrese el nombre de la estación de origen: ");
                    String origen = scanner.nextLine().trim();
                    System.out.print("Ingrese el nombre de la estación de destino: ");
                    String destino = scanner.nextLine().trim();
                    System.out.println();
                    sistema.rutasSinTransbordo(origen, destino);
                    break;

                case 0:
                    System.out.println("¡Hasta luego! 🚌");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
    }
}