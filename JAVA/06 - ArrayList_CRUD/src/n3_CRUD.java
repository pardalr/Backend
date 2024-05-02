import java.util.ArrayList;
import java.util.Scanner;

public class n3_CRUD {
    public static void main(String[] args) throws Exception {


        /* 3- CRUD: recepción internacional... y universal!
        Te han encargado organizar la recepción oficial para el primer contacto extraterrestre, en la montaña de Montserrat.
        Solo unos pocos en el mundo pueden asistir. ¿A quién enviarías? De momento la lista sólo puede ser de cinco elegid@s.
        Pero dos de ellos, en los puestos 2 y 3, se asustan y se dan de baja, y entra entonces el personaje X (darle nombre) en el puesto 2.
        La persona que está en el último puesto, se pone enferma y te recomienda que pongas en su lugar al personaje Y (darle nombre). Ojo con saber qué índice es el último
        En el último momento, se añade el personaje Z (darle nombre) al puesto vacante (puesto 3).
        Ves mostrando a cada paso cómo va quedando la lista actualizada: los medios están muy interesados en seguir la noticia al minuto!
        */

        ArrayList<String> recepcion = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        System.out.println("================================================================================");
        System.out.println("Los primeros 5 en inscribirse serán los que recibirán a los extra-terre-colegas:");
        
        for(int i = 0; i<5; i++){
            System.out.println("=========================================");
            System.out.println("Introduce tu nombre: (" + (i+1) + "/5)");
            recepcion.add(i, teclado.nextLine());
        }

        System.out.println("======================================================================");

        System.out.println("¡Información actualizada! La lista de los recibidores es la siguiente:");

        for(int i = 0; i<5; i++){
            System.out.println((i+1) + " - " + recepcion.get(i));
        }


        System.out.println("============================================================");
        System.out.println("Vamos a recibir a los extra-terre-colegas, aunque " + recepcion.get(1));
        System.out.println("y " + recepcion.get(2) + ", se han dado de baja, el primero en inscribirse");
        System.out.println("se queda con la plaza de " + recepcion.get(1));
        System.out.println("============================================================");

        recepcion.set(1, null);
        recepcion.set(2, null);

        System.out.println("¡Información actualizada! La lista de los recibidores es la siguiente:");

        for(int i = 0; i<5; i++){
            System.out.println((i+1) + " - " + recepcion.get(i));
        }
        System.out.println("======================================================================");



        System.out.println("Introduce tu nombre:");
        recepcion.set(1, teclado.nextLine());

        System.out.println("======================================================================");
        System.out.println("¡Información actualizada! La lista de los recibidores es la siguiente:");

        for(int i = 0; i<5; i++){
            System.out.println((i+1) + " - " + recepcion.get(i));
        }
        System.out.println("======================================================================");
        int ultimo = recepcion.size()-1;
        System.out.println("Lamentablemente " + recepcion.get(ultimo) + " se ha enfermado y no puede");
        System.out.println("asistir. " + recepcion.get(ultimo) + " a quién nos recomiendas poner en");
        System.out.println("tu lugar? Escríbenos su nombre para registrarlo: ");
        recepcion.set(ultimo, teclado.nextLine());

        System.out.println("======================================================================");
        System.out.println("¡Perfecto! La lista queda de la siguiente manera: ");

        for(int i = 0; i<5; i++){
            System.out.println((i+1) + " - " + recepcion.get(i));
        }

        System.out.println("==========================================================");
        System.out.println("Para finalizar nos queda una vacante libre. El primero en ");
        System.out.println("inscribirse, se queda la plaza. Introduce tu nombre: ");
        recepcion.set(2, teclado.nextLine());
        System.out.println("Perfecto " + recepcion.get(2) + ", bienvenido!");
        System.out.println("=======================================================");
        System.out.println("Actualizamos una última vez la lista. La lista definitiva:");
        
        for(int i = 0; i<5; i++){
            System.out.println((i+1) + " - " + recepcion.get(i));
        }

        System.out.println("=======================================================");









        teclado.close();


    }
}
