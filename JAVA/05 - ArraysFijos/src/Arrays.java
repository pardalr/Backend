import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) throws Exception {

    /*1 - Crear un array de lo que desees, pero con el tamaño que diga el usuario. Luego añadir elementos hasta que se rellene. Luego mostrarlo.*/

        System.out.println("Introduce la longitud que desees para el array:");
        Scanner teclado = new Scanner(System.in);
        int longArray = teclado.nextInt();
        teclado.nextLine();

        String[] coches = new String[longArray];

        for (int i = 0; i<coches.length; i++) {
            System.out.println("Introduce marca coche " + (i+1) + " de " + coches.length + ":");
            coches[i] = teclado.nextLine();
        }

        teclado.close();

        System.out.println("=====================================================");
        System.out.println("Dentro del array hay las siguientes marcas de coches:\n");
        
        for(String coche : coches){
        System.out.println(coche);
        }
        

    }
}
