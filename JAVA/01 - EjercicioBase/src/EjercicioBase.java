import java.util.Scanner;

public class EjercicioBase {
    //Clase principal con el nombre del archivo

    //Va a buscar el método Main
    public static void main(String[] args) throws Exception {
        //Aquí va el código principal

        //Scanner (entrada de datos). Hay que importarlo, queda a la escucha de la entrada del teclado.
        Scanner teclado = new Scanner(System.in); //Se genera un objeto escucha.

        System.out.println("Cuál es tu nombre?"); //Salida de información.
        String nombre = teclado.nextLine(); //Entrada de información, se guarda el valor del objeto escucha en la variable nombre.

        System.out.println("Cuál es tu apellido?"); //Salida de información.
        String apellido = teclado.nextLine(); //Entrada de información, se guarda el valor del objeto escucha en la variable apellido.

        System.out.println("Qué edad tienes?");
        byte edad = teclado.nextByte();

        teclado.close();

        System.out.println("Entonces, te llamas " + nombre + " "+ apellido + " y tienes " + edad + " años.");


    }
}
