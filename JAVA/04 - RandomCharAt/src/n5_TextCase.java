import java.util.Scanner;

public class n5_TextCase {
    public static void main(String[] args) throws Exception {
        //5- Se pide un texto. Decir si está compuesto solo de minúsculas, solo de mayúsculas o si combina mayúsculas y minúsculas
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un texto. Adivinaré si está en mayúsculas, minúsculas o mezclado: ");
        String texto = teclado.nextLine();
        String textoMin = texto.toLowerCase();
        String textoMay = texto.toUpperCase();
        
        if (texto.equals(textoMin)) {
            System.out.println("El texto está escrito completamente en minúsculas.");
        } else if (texto.equals(textoMay)) {
            System.out.println("El texto está escrito completamente en MAYÚSCULAS");
        } else {
            System.out.println("El texto combina MAYÚSCULAS y minúsculas.");
        }

        teclado.close();

    }

}
