import java.util.Scanner;

public class excs3_switch_while {
    public static void main(String[] args) throws Exception {

        // 3- SWITCH  - WHILE:
        // El archivo sonoro!
        // Usando una variable byte, preguntas cuál de los sonidos quieres escuchar. Cuando eligen un número, aparece la onomatopeya de ese sonido. Luego le preguntas: quieres escuchar otro? Y sigue hasta que diga no.
        // Ejemplo: elige 1- cohete, y suena ziuuum!, elige 3- moto, y suena brrrmmm!
        // Puedes probar la opción do...while para asegurar de que pregunta al menos una vez

        Scanner teclado = new Scanner(System.in);
        String repetir = "";

        do{
            System.out.println("Elige número correspondiente al animal que quieres escuchar:");
            System.out.println("1 - Vaca");
            System.out.println("2 - Avión");
            System.out.println("3 - Moto");
            System.out.println("4 - Gato");
            byte eleccion = teclado.nextByte();
            
            switch (eleccion) {
                case 1:
                System.out.println("MUUUUU");
                break;
    
                case 2:
                System.out.println("FIUUUMMM");
                break;
    
                case 3:
                System.out.println("BRUUUMMM");
                break;
    
                case 4:
                System.out.println("MIAAAAUU");
                break;
    
                default:
                System.out.println("Heeey avioneto, selecciona una de las opciones del 1 al 4.");
                break;
            }
            
            teclado.nextLine();
            System.out.println("¿Quieres escuchar otro?");
            repetir = teclado.nextLine();

        } while (repetir.equalsIgnoreCase("si"));

        System.out.println("\nHasta la próxima!");
        teclado.close();

    }
}
