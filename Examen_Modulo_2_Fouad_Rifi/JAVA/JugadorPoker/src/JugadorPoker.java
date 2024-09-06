/*
En Java: POO, crear clase (atributos y métodos).
- Crear clase para jugador de poker, con los atributos nombre, edad, sexo y posición en el torneo-
- Crear métodos standard de java correspondientes.
- Añadir además el método celebrarVictoria(), que suelta alguna frase divertida.
*/

public class JugadorPoker {
    // Atributos
    private String nombre;
    private int edad;
    private String sexo;
    private int posicionTorneo;

    // Constructor
    public JugadorPoker(String nombre, int edad, String sexo, int posicionTorneo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.posicionTorneo = posicionTorneo;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPosicionTorneo() {
        return posicionTorneo;
    }

    public void setPosicionTorneo(int posicionTorneo) {
        this.posicionTorneo = posicionTorneo;
    }

    // Método celebrarVictoria
    public void celebrarVictoria() {
        System.out.println(nombre + " ha ganado el torneo! Albert le va a poner un 10 en el examen de módulo");
    }

    // Método toString para mostrar la información del jugador
    @Override
    public String toString() {
        return "Presentamos a nuestro Jugador Poker: Nombre: " + nombre + ", Edad: " + edad + " Sexo: " + sexo + ", Posición en el Torneo: " + posicionTorneo + ".";
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        JugadorPoker jugador = new JugadorPoker("Carlos", 28, "Masculino", 1);
        System.out.println(jugador);
        jugador.celebrarVictoria();
    }
}
