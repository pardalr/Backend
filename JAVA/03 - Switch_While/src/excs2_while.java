import java.util.Scanner;

public class excs2_while {
    public static void main(String[] args) throws Exception {
        
        // 2- WHILE:
        // Una asociación benéfica te envía a pedir caridad. Preguntas "una ayudita?", y si te dicen que sí, preguntas cuánto quieren poner. Si te dicen que no, te deprimes y te vas para tu casa.
        // Al final, tienes que decir cuánta gente te ha ayudado y cuánto dinero has recaudado.

            int numPersonas = 0;
            int dineroAcumulado = 0;
            Scanner teclado = new Scanner(System.in);

            while (true) {
                System.out.println("Una ayudita, por favor?");
    
                String respuesta = teclado.nextLine().toLowerCase();
                if (respuesta.equals("si")) {
                    System.out.println("Con cuánto dinero me ayudarás?");
                    dineroAcumulado += teclado.nextInt();
                    teclado.nextLine();
                    numPersonas++;
                } else {
                    break;
                }
                
            }
            
            teclado.close();
            System.out.println("Me han ayudado " + numPersonas + " personas.");
            System.out.println("Y he recaudado " + dineroAcumulado + " Euros");
    

        }
    }

