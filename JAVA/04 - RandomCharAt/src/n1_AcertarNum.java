import java.util.Scanner;

public class n1_AcertarNum {
    public static void main(String[] args) throws Exception {
        
        // 1 - El usuario tiene que acertar un número del 1 al 5, generado aleatoriamente. Le vas preguntando hasta que acierte.
        // Al final, decir en cuantos intentos lo ha conseguido.

        int numAleatorio;
        int numUser;
        int intentos = 0;
        boolean acertar = false;

        Scanner teclado = new Scanner(System.in);

        numAleatorio = (int)(Math.random() * 5 + 1);

        while (!acertar) {
            System.out.println("Número aleatorio del 1 al 5, a ver si aciertas!");
            numUser = teclado.nextInt();
            intentos++;
            if (numAleatorio == numUser) {
                System.out.println("Has acertado, el número era el " + numAleatorio);
                System.out.println("(Lo has conseguido en " + intentos + " intentos)");
                acertar = true;
            } else {
                System.out.println("Lástima, vuelve a intentarlo: ");
            }
        }

        teclado.close();





    }
}
