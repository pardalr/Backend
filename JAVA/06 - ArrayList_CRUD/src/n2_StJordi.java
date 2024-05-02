import java.util.ArrayList;
import java.util.Scanner;

public class n2_StJordi {
    public static void main(String[] args) throws Exception {


        /* 2- Preguntar al usuario elementos típicos de la fiesta de Sant Jordi.
        Para acabar, escribir 'salir'. Al final, mostrar todos los elementos introducidos por el usuario. */

        ArrayList<String> stJordi = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("Introduce elementos típicos de St Jordi: ");

        while (!teclado.hasNext("salir")) {
            stJordi.add(teclado.nextLine());
            System.out.println("Añade alguna más (o escribe 'salir' para terminar:)");
        }

        teclado.close();

        System.out.println("=============================================");
        System.out.println("Aquí se muestran los elementos del ArrayList:");

        for(int i = 0; i<stJordi.size(); i++){
            System.out.println(stJordi.get(i));
        }





    }
}
