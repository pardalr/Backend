import java.util.Scanner;

public class Saludar {
    public static void main(String[] args) throws Exception {

        // 1- SALUDAR!
        // Pides saludo y nombre (ejemplo: ‘Hola’ y ‘Andrés’)
        // Y te responde ‘Hola Andrés’.
        // Realizar la función de saludar, de tres maneras diferentes:

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un saludo; ");
        String saludo = teclado.nextLine();
        System.out.println("Ahora introduce un nombre: ");
        String nombre = teclado.nextLine();

        // 1.1- Llamas a la función, sin parámetros, y sin return, y te hace el programa (resultado ejemplo: ‘Hola
        // Andrés’).
        saludar1_1();


        // 1.2 -- Llamas a la función, con parámetros (saludo y nombre), y sin return, y muestra el resultado
        // DENTRO de la función (resultado ejemplo: ‘Hola Andrés’).
        saludar1_2(saludo, nombre);
        
        // 1.3- Llamas a la función, con parámetros (saludo y nombre), y con return, y muestra el resultado
        // FUERA de ese método, y dentro del main() (resultado ejemplo: ‘Hola Andrés’).
        System.out.println(saludar1_3(saludo, nombre));

        teclado.close();
    
    }


    public static void saludar1_1(){
        System.out.println("\n 1: Hey Pepito!");
    }


    public static void saludar1_2(String saludo, String nombre){
        System.out.println("\n 2: " + saludo + " " + nombre + "!!");
    }

    public static String saludar1_3(String saludo, String nombre){
        return "\n 3: " + saludo + " " + nombre + "!!!";
    }


}


