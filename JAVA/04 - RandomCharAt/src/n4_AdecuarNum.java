import java.util.Scanner;

public class n4_AdecuarNum {
    public static void main(String[] args) throws Exception {
        
        // 4- Pides un numero de telefono y le quitas, si hay, los espacios, los guiones y los puntos:  456-453-78 quedaria como 45645378

        Scanner teclado = new Scanner(System.in);
        String numUser;
        String numConvert = "";
        System.out.println("Escribe un número de tlf: ");

        
        numUser = teclado.nextLine();
        
        for (int i = 0; i<numUser.length(); i++){
            
            if (Character.isDigit(numUser.charAt(i))) {
                numConvert += numUser.charAt(i);
            }
        }
        
        System.out.println(numConvert);


        teclado.close();
}

}
