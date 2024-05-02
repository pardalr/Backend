import java.util.Scanner;

public class MathRandom {
    
    public static void main(String[] args) throws Exception {

        /*3- Premio vacaciones en Ibiza: tienes un listado de nombres de personas en un array. Aleatoriamente, seleccionar el ganador y mostrarlo. Entonces preguntar: "otra vez? (S/N)", y si es que sí, volver a generar nuevo ganador y mostrarlo. Seguir preguntando hasta que el usuario diga que no. */

        int aleatorio = 0;
        String[] nombres = {
            "Juan", "María", "Carlos", "Luis", "Ana",
            "Pedro", "Laura", "Sofía", "Diego", "Elena",
            "Pablo", "Carmen", "José", "Lucía", "Miguel",
            "Isabel", "Fernando", "Sara", "Alejandro", "Raquel"
        };
        String respuesta = "";

        Scanner teclado = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("Resultado del premio Vacaciones en Ibiza: ");


        do {
            aleatorio = (int) (Math.random() * nombres.length); // Genera números aleatorios entre el 0 y el valor máx del array
            System.out.println(aleatorio);
            System.out.println("El ganador es " + nombres[aleatorio]);
            System.out.println("Otra vez?");
            respuesta = teclado.nextLine();
            respuesta = respuesta.toLowerCase();
        } while (respuesta.equals("s"));

        teclado.close();

        System.out.println("Gracias por participar, vuelva pronto!");




    }

}
