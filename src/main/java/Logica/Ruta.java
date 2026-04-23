package Logica;

import java.util.ArrayList;
import java.util.List;

public class Ruta {
    private String nombre;
    private List<Estacion> estaciones;

    public Ruta(String nombre) {
        this.nombre = nombre;
        this.estaciones = new ArrayList<>();
    }

    public void agregarEstacion(Estacion estacion) {
        estaciones.add(estacion);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Estacion> getEstaciones() {
        return estaciones;
    }

    public int getNumeroEstaciones() {
        return estaciones.size();
    }

    // Verifica si la ruta contiene una estacion por nombre
    public boolean contieneEstacion(String nombreEstacion) {
        for (Estacion e : estaciones) {
            if (e.getNombre().equalsIgnoreCase(nombreEstacion)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return nombre + " (" + estaciones.size() + " estaciones)";
    }
}