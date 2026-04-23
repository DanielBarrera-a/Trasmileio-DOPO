package Logica;

import java.util.*;

public class SistemaDeTransmilenio {

    // TreeMap: clave = nombre estacion, valor = tiempo de espera (ordenado alfabeticamente)
    private TreeMap<String, Integer> tiemposEspera;

    // TreeSet de rutas ordenadas alfabeticamente por nombre
    private TreeSet<Ruta> rutas;

    public SistemaDeTransmilenio() {
        tiemposEspera = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        rutas = new TreeSet<>(Comparator.comparing(Ruta::getNombre, String.CASE_INSENSITIVE_ORDER));
        cargarDatos();
    }


    //Aqui los datos que se sacaron de la pagina de trasmilenio

    private void cargarDatos() {

        //Troncal:Calle 26
        Ruta calle26 = new Ruta("Calle 26");
        agregarEstacion(calle26, "Portal El Dorado - C.C. Nuestro Bogotá", 14);
        agregarEstacion(calle26, "Modelia", 28);
        agregarEstacion(calle26, "Normandia", 7);
        agregarEstacion(calle26, "Avenida Rojas - UNISALESIANA", 19);
        agregarEstacion(calle26, "El Tiempo - Cámara de Comercio de Bogotá", 33);
        agregarEstacion(calle26, "Salitre - El Greco", 11);
        agregarEstacion(calle26, "CAN", 25);
        agregarEstacion(calle26, "Gobernación", 8);
        agregarEstacion(calle26, "Quinta Paredes", 17);
        agregarEstacion(calle26, "Corferias", 22);
        agregarEstacion(calle26, "Ciudad Universitaria - Lotería de Bogotá", 30);
        agregarEstacion(calle26, "Consejo de Bogotá", 13);
        agregarEstacion(calle26, "Centro Memoria", 6);
        agregarEstacion(calle26, "Universidades - CityU", 21);
        rutas.add(calle26);

        //Troncal:Eje Ambiental
        Ruta ejeAmbiental = new Ruta("Eje Ambiental");
        agregarEstacion(ejeAmbiental, "AV: Jiménez - CL 13", 9);
        agregarEstacion(ejeAmbiental, "Museo del Oro", 34);
        agregarEstacion(ejeAmbiental, "Las Aguas - Centro Colombo Americano", 16);
        rutas.add(ejeAmbiental);

        //Troncal:Caracas Sur
        Ruta caracasSur = new Ruta("Caracas Sur");
        agregarEstacion(caracasSur, "Portal Tunal", 27);
        agregarEstacion(caracasSur, "Parque", 12);
        agregarEstacion(caracasSur, "Biblioteca", 5);
        agregarEstacion(caracasSur, "Portal Usme", 31);
        agregarEstacion(caracasSur, "Molinos", 18);
        agregarEstacion(caracasSur, "Consuelo", 23);
        agregarEstacion(caracasSur, "Socorro", 10);
        agregarEstacion(caracasSur, "Santa Lucia", 29);
        agregarEstacion(caracasSur, "Danubio", 15);
        agregarEstacion(caracasSur, "Calle 40 Sur", 7);
        agregarEstacion(caracasSur, "Quiroga", 20);
        agregarEstacion(caracasSur, "Olaya", 35);
        agregarEstacion(caracasSur, "Restrepo", 11);
        agregarEstacion(caracasSur, "Fucha", 26);
        agregarEstacion(caracasSur, "Nariño", 8);
        agregarEstacion(caracasSur, "Hortúa", 33);
        agregarEstacion(caracasSur, "Hospital", 14);
        rutas.add(caracasSur);

        //Troncal:Caracas
        Ruta caracas = new Ruta("Caracas");
        agregarEstacion(caracas, "Tercer Milenio", 22);
        agregarEstacion(caracas, "AV. Jiménez - Caracas", 9);
        agregarEstacion(caracas, "Temporal AV. Jiménez - Caracas", 17);
        agregarEstacion(caracas, "Calle 19", 31);
        agregarEstacion(caracas, "Temporal Calle 22", 6);
        agregarEstacion(caracas, "Calle 26-Atrio", 25);
        agregarEstacion(caracas, "Temporal Calle 34", 13);
        agregarEstacion(caracas, "AV. 39", 28);
        agregarEstacion(caracas, "Temporal AV. 39", 19);
        agregarEstacion(caracas, "Calle 45 - American School Way", 34);
        agregarEstacion(caracas, "Marly", 10);
        agregarEstacion(caracas, "Temporal Marly", 23);
        agregarEstacion(caracas, "Temporal Calle 57", 7);
        agregarEstacion(caracas, "Calle 63", 16);
        agregarEstacion(caracas, "Flores – Areandina", 30);
        agregarEstacion(caracas, "Calle 72", 12);
        agregarEstacion(caracas, "Calle 76 - San Felipe", 21);
        rutas.add(caracas);

        //Troncal:NQS Sur
        Ruta nqsSur = new Ruta("NQS Sur");
        agregarEstacion(nqsSur, "Portal Sur - JFK Coop. Financiera", 18);
        agregarEstacion(nqsSur, "Perdomo", 29);
        agregarEstacion(nqsSur, "CC Paseo Villa del Rio - Madelena", 11);
        agregarEstacion(nqsSur, "Servillana", 24);
        agregarEstacion(nqsSur, "Venecia", 8);
        agregarEstacion(nqsSur, "Alquería", 35);
        agregarEstacion(nqsSur, "General Santander", 14);
        agregarEstacion(nqsSur, "NQS - Calle 38A S", 27);
        agregarEstacion(nqsSur, "NQS - Calle 30 S", 6);
        agregarEstacion(nqsSur, "SENA", 20);
        agregarEstacion(nqsSur, "Bosa", 33);
        agregarEstacion(nqsSur, "Comuneros", 15);
        agregarEstacion(nqsSur, "Santa Isabel", 9);
        agregarEstacion(nqsSur, "San Mateo - CC Unisanar", 22);
        agregarEstacion(nqsSur, "Terreros - Hospital Cardio Vascular", 31);
        agregarEstacion(nqsSur, "León XIII", 17);
        agregarEstacion(nqsSur, "La Despensa", 26);
        rutas.add(nqsSur);

        //Troncal:Autopista Norte
        Ruta autopistaNorte = new Ruta("Autopista Norte");
        agregarEstacion(autopistaNorte, "Portal Norte – Unicervantes", 13);
        agregarEstacion(autopistaNorte, "Calle 187", 28);
        agregarEstacion(autopistaNorte, "Toberin - Foundever", 7);
        agregarEstacion(autopistaNorte, "Calle 161", 21);
        agregarEstacion(autopistaNorte, "Mazurén", 34);
        agregarEstacion(autopistaNorte, "Calle 146", 10);
        agregarEstacion(autopistaNorte, "Calle 142", 25);
        agregarEstacion(autopistaNorte, "Alcalá – Colegio S. Tomás Dominicos", 16);
        agregarEstacion(autopistaNorte, "Prado", 29);
        agregarEstacion(autopistaNorte, "Calle 127", 8);
        agregarEstacion(autopistaNorte, "Pepe Sierra UTEL Universidad", 33);
        agregarEstacion(autopistaNorte, "Calle 106 - Maletas Explora", 19);
        agregarEstacion(autopistaNorte, "Calle 100 - Marketmedios", 12);
        agregarEstacion(autopistaNorte, "Virrey", 27);
        agregarEstacion(autopistaNorte, "Calle 85", 6);
        agregarEstacion(autopistaNorte, "Héroes - Colmena Seguros", 22);
        agregarEstacion(autopistaNorte, "Terminal", 31);
        rutas.add(autopistaNorte);

        //Troncal:Américas
        Ruta americas = new Ruta("Américas");
        agregarEstacion(americas, "Portal Américas", 20);
        agregarEstacion(americas, "Patio Bonito", 9);
        agregarEstacion(americas, "Biblioteca Tintal", 32);
        agregarEstacion(americas, "Transversal 86", 15);
        agregarEstacion(americas, "Banderas", 26);
        agregarEstacion(americas, "Mandalay", 11);
        agregarEstacion(americas, "AV. Américas - AV. Boyacá", 23);
        agregarEstacion(americas, "Marsella", 7);
        agregarEstacion(americas, "Pradera - Plaza Central", 18);
        agregarEstacion(americas, "Distrito Grafiti", 30);
        agregarEstacion(americas, "Puente Aranda", 14);
        agregarEstacion(americas, "Carrera 43 - Comapan", 27);
        agregarEstacion(americas, "CDS - Carrera 32", 5);
        agregarEstacion(americas, "Ricaurte - CL 13", 21);
        agregarEstacion(americas, "San Facon Carrera 22", 34);
        agregarEstacion(americas, "Zona Industrial", 12);
        agregarEstacion(americas, "De La Sabana", 28);
        rutas.add(americas);

        //Troncal:NQS Central
        Ruta nqsCentral = new Ruta("NQS Central");
        agregarEstacion(nqsCentral, "La Castellana", 16);
        agregarEstacion(nqsCentral, "Calle 75 - Zona M", 29);
        agregarEstacion(nqsCentral, "AV. Chile", 8);
        agregarEstacion(nqsCentral, "7 de Agosto", 22);
        agregarEstacion(nqsCentral, "Movistar Arena", 35);
        agregarEstacion(nqsCentral, "Campín - UAN", 13);
        agregarEstacion(nqsCentral, "Universidad Nacional", 25);
        agregarEstacion(nqsCentral, "AV. ElDorado", 10);
        agregarEstacion(nqsCentral, "CAD", 31);
        agregarEstacion(nqsCentral, "Paloquemao", 18);
        agregarEstacion(nqsCentral, "Ricaurte - NQS", 7);
        agregarEstacion(nqsCentral, "Tygua - San José", 24);
        agregarEstacion(nqsCentral, "Guatoque - Veraguas", 33);
        rutas.add(nqsCentral);

        //Troncal:Calle 80
        Ruta calle80 = new Ruta("Calle 80");
        agregarEstacion(calle80, "Portal 80", 19);
        agregarEstacion(calle80, "Quirigua", 6);
        agregarEstacion(calle80, "Carrera 90", 28);
        agregarEstacion(calle80, "AV. Cali", 14);
        agregarEstacion(calle80, "Granja - Kr 77", 33);
        agregarEstacion(calle80, "Minuto de Dios", 9);
        agregarEstacion(calle80, "AV. Boyacá", 23);
        agregarEstacion(calle80, "Ferias", 17);
        agregarEstacion(calle80, "AV. 68", 31);
        agregarEstacion(calle80, "Carrera 53", 11);
        agregarEstacion(calle80, "Carrera 47", 26);
        agregarEstacion(calle80, "Escuela Militar", 8);
        agregarEstacion(calle80, "Polo- FINCOMERCIO", 20);
        rutas.add(calle80);

        // Troncal:Suba
        Ruta suba = new Ruta("Suba");
        agregarEstacion(suba, "Portal Suba", 15);
        agregarEstacion(suba, "La Campiña", 30);
        agregarEstacion(suba, "Suba - TV. 91", 7);
        agregarEstacion(suba, "21 Ángeles", 22);
        agregarEstacion(suba, "Gratamira", 11);
        agregarEstacion(suba, "Suba - AV. Boyacá", 27);
        agregarEstacion(suba, "Niza - Calle 127", 16);
        agregarEstacion(suba, "Humedal Córdoba", 34);
        agregarEstacion(suba, "Suba - Calle 116", 9);
        agregarEstacion(suba, "Puentelargo", 21);
        agregarEstacion(suba, "Suba - Calle 100", 13);
        agregarEstacion(suba, "Suba - Calle 95", 28);
        agregarEstacion(suba, "Rionegro", 6);
        agregarEstacion(suba, "San Martín", 19);
        rutas.add(suba);
    }

    // Helper para agregar estacion a ruta y al TreeMap de tiempos
    private void agregarEstacion(Ruta ruta, String nombre, int tiempoEspera) {
        Estacion estacion = new Estacion(nombre, tiempoEspera);
        ruta.agregarEstacion(estacion);
        tiemposEspera.put(nombre, tiempoEspera);
    }

    //Punto 1: Tiempo de espera dado el nombre de la estacion

    public void consultarTiempoEspera(String nombreEstacion) {
        Integer tiempo = tiemposEspera.get(nombreEstacion);
        if (tiempo != null) {
            System.out.println("Estación: " + nombreEstacion);
            System.out.println("Tiempo de espera: " + tiempo + " minutos");
        } else {
            System.out.println("Estación no encontrada: " + nombreEstacion);
        }
    }


    //Punto 2: Nombres de rutas ordenadas alfabeticamente

    public void listarRutasAlfabeticamente() {
        System.out.println("Rutas del sistema TransMilenio (orden alfabético):");
        int i = 1;
        for (Ruta ruta : rutas) {
            System.out.println(i++ + ". " + ruta.getNombre() + " - " + ruta.getNumeroEstaciones() + " estaciones");
        }
    }


    // Punto 4: Rutas que conectan dos estaciones sin transbordo
    // ordenadas por numero de paradas (asc) y alfabeticamente por nombre

    public void rutasSinTransbordo(String estacionOrigen, String estacionDestino) {
        List<Ruta> rutasConectadas = new ArrayList<>();

        for (Ruta ruta : rutas) {
            if (ruta.contieneEstacion(estacionOrigen) && ruta.contieneEstacion(estacionDestino)) {
                rutasConectadas.add(ruta);
            }
        }

        if (rutasConectadas.isEmpty()) {
            System.out.println("No hay rutas directas entre: " + estacionOrigen + " y " + estacionDestino);
            return;
        }

        // Ordenar: primero por numero de estaciones (asc), luego alfabeticamente
        rutasConectadas.sort(
                Comparator.comparingInt(Ruta::getNumeroEstaciones)
                        .thenComparing(Ruta::getNombre, String.CASE_INSENSITIVE_ORDER)
        );

        System.out.println("Rutas sin transbordo entre \"" + estacionOrigen + "\" y \"" + estacionDestino + "\":");
        int i = 1;
        for (Ruta ruta : rutasConectadas) {
            System.out.println(i++ + ". " + ruta.getNombre() + " (" + ruta.getNumeroEstaciones() + " paradas)");
        }
    }

    // Getters
    public TreeMap<String, Integer> getTiemposEspera() {
        return tiemposEspera;
    }

    public TreeSet<Ruta> getRutas() {
        return rutas;
    }
}
