import java.util.Scanner;

public class excs1_switch {
    public static void main(String[] args) throws Exception {

        // 1- SWITCH:
        // Preguntas estación del año. Mediante un switch, respondes una cosa u otra. Ejemplo "primavera". Respuesta: "la primavera me alteraaa".

        //Mostramos en consola los siguientes mensajes:
        System.out.println("Elige una estación del año:\n");
        System.out.println("1- primavera\n");
        System.out.println("2- verano\n");
        System.out.println("3- otoño\n");
        System.out.println("4- invierno\n");

        //Registramos las entradas
        Scanner teclado = new Scanner(System.in);

        //Registramos en la variable estacion lo que tecleamos (utilizamos byte)
        byte estacion = teclado.nextByte();

        // aquí dejaríamos de registrar las entradas.
        teclado.close();

        //Aquí empezamos con el Switch
        switch (estacion) {
            case 1:
            System.out.println("La primavera la sangre altera.");
            break;

            case 2:
            System.out.println("Con el calor del verano, todo parece más humano.");
            break;

            case 3:
            System.out.println("En otoño, la melancolía se adueña del día.");
            break;

            case 4:
            System.out.println("En invierno, el frío agudiza el ingenio.");
            break;

            default:
            System.out.println("Heeey avioneto, selecciona una de las opciones del 1 al 4.");
                break;
        }







    }
}
