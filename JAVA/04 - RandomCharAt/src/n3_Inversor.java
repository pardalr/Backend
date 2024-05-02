import java.util.Scanner;

public class n3_Inversor {
    public static void main(String[] args) throws Exception {
        
        // 3- Se introduce una frase y se devuelve  el texto a la inversa. Ejemplo: olpmejE

        Scanner teclado = new Scanner(System.in);
        String fraseInvertir;
        System.out.println("Escribe una frase: ");

        fraseInvertir = teclado.nextLine();

        for(int i = fraseInvertir.length() - 1; i >= 0; i--){
            System.out.print(fraseInvertir.charAt(i));
        }
        


        teclado.close();
}

}
