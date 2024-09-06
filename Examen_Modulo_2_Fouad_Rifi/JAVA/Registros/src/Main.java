/*
Registrar jugadores y mostrar resultados con Java:
- En el main.java instanciar al menos 6 jugadores. Pueden incrustarse directamente (no hace falta pedirlas al usuario).
- Añadir estos jugadores a un arraylist de jugadores.
- Al final, imprimir la lista de jugadores inscritos.
- Y en base a la posición de cada uni, decir quién es el ganador, y que el ganador ejecute el método celebrarVictoria(). Ejemplo: Julián ha ganado el torneo y dice: "Yujuuuuu, soy rico, por fin puedo comprarme la carta de Pokemon que me faltaba!"

Hacerlos paso a paso y en diferentes arcivos.java
 */

// Main.java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista para los jugadores
        ArrayList<Jugadores> jugadores = new ArrayList<>();

        // Instanciar jugadores y añadirlos a la lista
        jugadores.add(new Jugadores("Carlos", 28, "Masculino", 2));
        jugadores.add(new Jugadores("Lucía", 25, "Femenino", 5));
        jugadores.add(new Jugadores("Julián", 30, "Masculino", 1));
        jugadores.add(new Jugadores("Sofía", 22, "Femenino", 6));
        jugadores.add(new Jugadores("Miguel", 35, "Masculino", 4));
        jugadores.add(new Jugadores("Ana", 27, "Femenino", 3));

        // Imprimir todos los jugadores inscritos
        System.out.println("============================================================================================================================");
        System.out.println("Jugadores inscritos en el torneo:");
        System.out.println("===================================");
        for (Jugadores jugador : jugadores) {
            System.out.println(jugador);
        }

        // Buscar al ganador
        for (Jugadores jugador : jugadores) {
            if (jugador.getPosicionTorneo() == 1) {
                System.out.println("\nEl ganador es: " + jugador.getNombre());
                jugador.celebrarVictoria();
            }
        }
        System.out.println("============================================================================================================================");
    }
}
