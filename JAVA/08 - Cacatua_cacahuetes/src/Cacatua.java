import java.util.Scanner;

public class Cacatua {
    public static void main(String[] args) throws Exception{

        /*3- CACATÚA CACAHUETES!
        Tienes una cacatúa que todo el rato te pide comer cacahuetes, diciendo “cacatúa cacahuetes!”.
        El programa te pregunta qué comida le das.
        Mientras NO sean cacahuetes, sigue diciendo “cacatúa cacahuetes!”
        Pero si le das cacahuetes, llama al método ‘dormirse’ y se calla, y en vez del mensaje anterior,
        vemos ‘zzZzzzz…’ (aquí acaba el programa)
        *EXTRA: realizar no solo el método 'dormirse()', sino también el de 'pideComida()*/

        Scanner teclado = new Scanner(System.in);
        String comida = "";

        do {
            System.out.println("+Cacatúa: ¡Cacatúa cacahuetes!");
            System.out.println("-¿Qué comida le das a la cacatúa?");
            comida = teclado.nextLine().toLowerCase();

            if (comida.equals("cacahuetes")) {
                dormirse();
            }
        
        } while (!comida.equals("cacahuetes"));


        teclado.close();
        
    }

    public static void dormirse(){
        System.out.println("+Cacatúa: ZZZZZzzzzz...");
    }
    

}
