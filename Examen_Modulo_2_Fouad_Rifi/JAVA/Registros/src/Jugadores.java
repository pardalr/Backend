// Jugadores.java
public class Jugadores {
    private String nombre;
    private int edad;
    private String sexo;
    private int posicionTorneo;

    // Constructor
    public Jugadores(String nombre, int edad, String sexo, int posicionTorneo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.posicionTorneo = posicionTorneo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getPosicionTorneo() {
        return posicionTorneo;
    }

    // Método celebrarVictoria
    public void celebrarVictoria() {
        System.out.println(nombre + ": Yujuuuuu, soy rico, por fin puedo comprarme la carta de Pokemon que me faltaba!");
    }

    // Método toString para mostrar información del jugador
    @Override
    public String toString() {
        return "Jugador/a: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo + ", Posición en el Torneo: " + posicionTorneo;
    }
}
