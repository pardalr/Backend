import java.util.Scanner;

public class CondicionalesJAVA {
    public static void main(String[] args) throws Exception {

        /*1- EJERCICIO CONDICIONALES JAVA
            Preguntas la edad, y según la respuesta, le contestas:
            estás en primaria/ secundaria/ universidad/ trabajando
            +EXTRA: que si pone menos de 6 o más 120, dar un mensaje de error. */

        // Scanner teclado = new Scanner(System.in);
        // System.out.println("Cuántos años tienes?");
        // int años = teclado.nextInt();
        // teclado.close();

        // if (años >= 6 && años < 13) {
        //     System.out.println("Estás en primaria");
        // } else if (años >= 13 && años < 19) {
        //     System.out.println("Estás en secundaria");
        // } else if (años >= 19 && años < 24) {
        //     System.out.println("Estás en la universidad");
        // } else if (años >= 24 && años < 121) {
        //     System.out.println("Estás trabajando");
        // } else {
        //     System.out.println("Error");
        // }

        //--------------------------------------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------------------------------------
        /*2- BUCLE EN JAVA:
            Contar del 20 al 10 en orden descendiente, y dar el cuadrado de cada número. i-- resta un número*/

        // for (int i = 20; i>=10; i--){
        //     System.out.println(i + " = " + Math.pow(i, 2));
        // }

        /*3- MEDIA EDADES DE TUS PADRES
            Se pregunta al usuario el nombre y edad de su madre, y lo mismo de su padre.
            Al final, mostrar frase del tipo “Tu madre se llama Berta y tiene 55 años, y
            tu padre se llama Roberto y tiene 57 años, y la media de us edades es 56”

            OJO, tener en cuenta los decimales!
            Cuando os salga el error que tiene que salir después del nextInt( ) , me avisáis */

            Scanner teclado = new Scanner(System.in);
            System.out.println("Cuál es el nombre de tu Madre?");
            String nombreMadre = teclado.nextLine();
            System.out.println("Qué edad tiene?");
            int edadMadre = teclado.nextInt();
            teclado.nextLine();

            System.out.println("Cuál es el nombre de tu Padre?");
            String nombrePadre = teclado.nextLine();
            System.out.println("Qué edad tiene?");
            int edadPadre = teclado.nextInt();
            teclado.close();

            float media = (float)(edadMadre + edadPadre)/2;

            System.out.println("Tu madre se llama " + nombreMadre + " y tiene " + edadMadre + " años, y tu padre se llama " + nombrePadre + " y tiene " + edadPadre + " años, y la media de sus edades es " + media);







    }
}
