import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*Crear un arraylist con al menos 5 discos, con los datos: Artista, título, año, duración (pueden ser otros).
        - Mostrar todos los discos, con todos los datos
        - Mostrar uno determinado: por ejemplo el año del tercer disco (esto lo podría pedir el cliente, o no)
        - Cambiar ese mismo año (esto lo podría pedir el cliente, o no) y mostrar ese cambio. A ver si lo encontráis!
        - Etc hacer pruebas
        EXTRA: buscador con contains() o con equals(). Que el usuario escriba nombre de artista y me diga si está, y en qué posición está.
        NIVEL 2
        Que todos estos datos los entre el cliente: usuario entra Artista, título, año y duración (no hace falta hacer un CRUD entero).*/

        ArrayList<Discos> vinilos = new ArrayList<>();

        Discos disco1 = new Discos("The Beattles", "Sgt. Pepper's Lonely Hearts Club Band", 1967, 39);
        Discos disco2 = new Discos("Michael Jackson", "Thriller", 1982, 42);
        Discos disco3 = new Discos("Nirvana", "Nevermind", 1991, 45);
        Discos disco4 = new Discos("Pink Floyd", "The Dark Side of the Moon", 1973, 43);
        Discos disco5 = new Discos("Queen", "A Night at the Opera", 1975, 43);

        vinilos.add(disco1);
        vinilos.add(disco2);
        vinilos.add(disco3);
        vinilos.add(disco4);
        vinilos.add(disco5);

        System.out.println("=====================================================================");
        System.out.println("Mostrar todos los discos con los datos:");
        for(int i = 0; vinilos.size()>i; i++){
            System.out.println(vinilos.get(i));
        }

        System.out.println("=====================================================================");
        System.out.println("Mostrar el año del tercer disco:");
        System.out.println(vinilos.get(2).getAnio());

        System.out.println("=====================================================================");
        System.out.println("Cambiar ése año y mostrar el nuevo:");
        vinilos.get(2).setAnio(1996);
        System.out.println(vinilos.get(2).getAnio());

        System.out.println("=====================================================================");
        System.out.println("Indica con los números 1-4 qué quieres buscar:");
        System.out.println("1.- Artista");
        System.out.println("2.- Título");
        System.out.println("3.- Año (temporalmente fuera de servicio)");
        System.out.println("4.- Duración (temporalmente fuera de servicio)");
        
        Scanner teclado = new Scanner(System.in);
        int dato1 = teclado.nextInt();
        teclado.nextLine();

        String dato2;
        int dato3;
        String resultado = "No encontrado";
        switch (dato1) {
            case 1:
            System.out.println("Qué artista buscas?");
            dato2 = teclado.nextLine();
            for (int i = 0; vinilos.size()>i; i++){
                if (vinilos.get(i).getArtista().equals(dato2)) {
                    resultado = "¡Encontrado! Se trata del album " + vinilos.get(i).getTitulo() + " de "  + vinilos.get(i).getArtista() + " el cual salió en "  + vinilos.get(i).getAnio() + " y tiene una duración de "  + vinilos.get(i).getDuracion() + " minutos aproximadamente.";
                }
            }
            break;
            case 2:
            System.out.println("Qué título buscas?");
            dato2 = teclado.nextLine();
            for (int i = 0; vinilos.size()>i; i++){
                if (vinilos.get(i).getTitulo().equals(dato2)) {
                    resultado = "¡Encontrado! Se trata del album " + vinilos.get(i).getTitulo() + " de "  + vinilos.get(i).getArtista() + " el cual salió en "  + vinilos.get(i).getAnio() + " y tiene una duración de "  + vinilos.get(i).getDuracion() + " minutos aproximadamente.";
                }
            }
                break;
            case 3:
            System.out.println("Qué año buscas?");
            dato3 = teclado.nextInt();
            for (int i = 0; vinilos.size()>i; i++){
                if (vinilos.get(i).getAnio() == dato3) {
                    resultado = "¡Encontrado! Se trata del album " + vinilos.get(i).getTitulo() + " de "  + vinilos.get(i).getArtista() + " el cual salió en "  + vinilos.get(i).getAnio() + " y tiene una duración de "  + vinilos.get(i).getDuracion() + " minutos aproximadamente.";
                }
            }

                break;
            case 4:
            System.out.println("Qué duración buscas?");
            dato3 = teclado.nextInt();
            for (int i = 0; vinilos.size()>i; i++){
                if (vinilos.get(i).getDuracion() == dato3) {
                    resultado = "¡Encontrado! Se trata del album " + vinilos.get(i).getTitulo() + " de "  + vinilos.get(i).getArtista() + " el cual salió en "  + vinilos.get(i).getAnio() + " y tiene una duración de "  + vinilos.get(i).getDuracion() + " minutos aproximadamente.";
                }
            }

                break;
            default:
                break;
        }

        System.out.println("=====================================================================");
        System.out.println("Resultado:");
        System.out.println(resultado);


        System.out.println("=====================================================================");
        System.out.println("--------------------------Borramos el Array--------------------------");
        System.out.println("Ahora que todos esos datos los pueda introducir el usuario.");
        vinilos.clear();
        
        String continuar;
        String artistaUser;
        String tituloUser;
        int anioUser;
        int duracionUser;

        do{

            System.out.println("Introduce el nombre del artista: ");
            artistaUser = teclado.nextLine();
            System.out.println("Introduce el nombre del álbum: ");
            tituloUser = teclado.nextLine();
            System.out.println("Introduce el año de salida del álbum: ");
            anioUser = teclado.nextInt();
            System.out.println("Introduce la duración aproximada del álbum: ");
            duracionUser = teclado.nextInt();

            vinilos.add(new Discos(artistaUser, tituloUser, anioUser, duracionUser));
            
            teclado.nextLine();


            System.out.println("Quieres añadir otro artista (s/n)?");
            continuar = teclado.nextLine().toLowerCase();
            

        } while (!continuar.equals("n"));

        System.out.println("=====================================================================");
        System.out.println("Mostrar nuevamente todos los discos introducidos por usuario con los datos:");
        for(int i = 0; vinilos.size()>i; i++){
            System.out.println(vinilos.get(i));
        }



        teclado.close();



    }
}
