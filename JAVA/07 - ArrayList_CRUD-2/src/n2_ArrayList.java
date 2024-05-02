import java.util.ArrayList;
import java.util.Scanner;

public class n2_ArrayList {
    
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);
    ArrayList <Integer> numeros = new ArrayList<>();
    
    System.out.println("=====================================");
    System.out.println("¿Cuántos números quieres introducir?");
    
    int entradas = teclado.nextInt();
    
    for(int i= 0; i<entradas; i++){
        System.out.println("Introduce el número: ");
        numeros.add(teclado.nextInt());
    }

    System.out.println("=======================================");
    System.out.println("Qué números tengo en el array?");

    for(int i= 0; i<numeros.size(); i++){
        System.out.print(numeros.get(i) + ", ");
    }

    System.out.println();
    System.out.println("========================================");
    System.out.println("La media de los números introducidos es: ");

    float media = 0;

    for(int i= 0; i<numeros.size(); i++){
        media = media + numeros.get(i);
        if (i == (numeros.size()-1)) {
            media = media / (numeros.size());
        }
    }

    System.out.println(">>>>> " + media + " <<<<<");




    teclado.close();

    }
}
