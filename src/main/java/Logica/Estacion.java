package Logica;

public class Estacion {
    private String nombre;
    private int tiempoEspera;

    public Estacion(String nombre, int tiempoEspera) {
        this.nombre = nombre;
        this.tiempoEspera = tiempoEspera;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    @Override
    public String toString() {
        return nombre + " (Espera: " + tiempoEspera + " min)";
    }
}