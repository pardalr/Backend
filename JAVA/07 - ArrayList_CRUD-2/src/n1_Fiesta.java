import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class n1_Fiesta {
    public static void main(String[] args) throws Exception {

        ArrayList <String> casa1 = new ArrayList<>(Arrays.asList("Michael", "Juan", "Maria", "Carlos", "Laura", "Pedro", "Ana", "Sofía", "Elena", "Diego"));
        
        ArrayList <String> casa2 = new ArrayList<>();
        casa2.add("Miguel");
        casa2.add("Alejandra");
        casa2.add("Fernando");
        casa2.add("Isabel");
        casa2.add("Javier");
        casa2.add("Paula");
        casa2.add("Ricardo");
        casa2.add("Patricia");
        casa2.add("Gabriel");
        casa2.add("Carmen");

        System.out.println("======================================================");
        System.out.println("Esta es la lista de los que están en la primera casa: ");
        System.out.println("======================================================");


        for(int i = 0; i<casa1.size(); i++){
            System.out.print((i+1) + "-" + casa1.get(i) + " ");;
        }

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("Pepi me ha llamado y tendré que añadirla a ella y su novio Silvester");

        casa1.add("Pepi");
        casa1.add("Silvester");

        System.out.println("Por lo que ahora la lista queda de la siguiente manera: ");
        System.out.println("======================================================================");

        for(int i = 0; i<casa1.size(); i++){
            System.out.print((i+1) + "-" + casa1.get(i) + " ");;
        }

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("Me acabo de encontrar a Eva y quiere que la añada la tercera...");

        casa1.add(2, "Eva");

        System.out.println("Por lo que ahora la lista queda de la siguiente manera: ");
        System.out.println("======================================================================");

        for(int i = 0; i<casa1.size(); i++){
            System.out.print((i+1) + "-" + casa1.get(i) + " ");;
        }

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("Buenoooo, los de la fiesta de al lado también se quieren unir..");

        casa1.addAll(casa2);

        System.out.println("La familia crece y lista queda de la siguiente manera: ");
        System.out.println("======================================================================");

        for(int i = 0; i<casa1.size(); i++){
            System.out.print((i+1) + "-" + casa1.get(i) + " ");;
        }

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("Vamos a ordenar la lista alfabéticamente para ser más ordenados.");

        Collections.sort(casa1);

        System.out.println("La lista ordenada alfabéticamente queda de la siguiente manera: ");
        System.out.println("======================================================================");

        for(int i = 0; i<casa1.size(); i++){
            System.out.print((i+1) + "-" + casa1.get(i) + " ");;
        }

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("Vamos a ver con este nuevo orden, quién ha quedado último en la lista:");
        System.out.println("======================================================================");

        System.out.println("Anda, pues parece que te has quedado última " + casa1.get(casa1.size()-1) + " jajaja.");
        System.out.println("No pasa nada, te dejaremos entrar igualmente <3");

        System.out.println();
        System.out.println("======================================================================");
        System.out.println("A quién quieres buscar en la lista? ");
        System.out.println("======================================================================");

        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();

        ArrayList <String> casaLowerCase = new ArrayList<>();

        casaLowerCase.addAll(casa1);

        
        
        
        for(int i=0; i<casaLowerCase.size(); i++){
            String nombreLowerCase = casaLowerCase.get(i);
            casaLowerCase.set(i, nombreLowerCase.toLowerCase());
        }



        if(casaLowerCase.contains(nombre.toLowerCase())){
            System.out.println(nombre + " sí que se encuentra en la lista y está en la posición " + (casaLowerCase.indexOf(nombre.toLowerCase()) + 1));
        } else {
            System.out.println("Lástima, a " + nombre + " no está en la lista... Quizás para la próxima.");
        }

        teclado.close();



















    }
}
