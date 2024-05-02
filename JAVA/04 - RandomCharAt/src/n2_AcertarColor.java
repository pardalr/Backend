import java.util.Scanner;

public class n2_AcertarColor {
    public static void main(String[] args) throws Exception {
        
        // 2- Tienes un color preseleccionado, por ejemplo el rojo, y le preguntas al usuario un color a ver si lo acierta (solo le preguntas una vez)

        Scanner teclado = new Scanner(System.in);
        String colorPredeterminado = "verde";
        String colorUser;
        boolean validar = false;
        System.out.println("Adivina el color que estoy pensando: ");


        do{
            colorUser = teclado.nextLine().toLowerCase();

            if (colorPredeterminado.equals(colorUser)) {
                System.out.println("Acertaste! Es el " + colorPredeterminado);
                validar = true;
            } else {
                System.out.println("Prueba otra vez!");
            }

        } while (!validar);

        teclado.close();
}

}
