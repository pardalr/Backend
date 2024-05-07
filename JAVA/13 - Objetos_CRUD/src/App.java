import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        /*
        Tienes un carrito de la compra donde puedas añadir, leer, modificar, borrar y BUSCAR elementos.
        Crear menú con opciones. Si opción = ‘salir’ u opción 0, se acaba el programa.
        Se propone que sean objetos Comida: nombre, origen, peso, precio.
        Se aconseja en este caso realizar un switch dentro de un while. El switch sobre las opciones del menú del tipo:
            1 - Añadir comida (implica añadir por teclado todas las características del objeto)
            2 - Mostrar lista completa
            3 - Mostrar un producto específico por nombre (implica opción buscar)
            4 - Modificar por nombre. ¿Cuál quieres modificar? (implica opción buscar)
            5 - Borrar elemento por nombre (implica opción buscar)
            0 - Salir
        Para buscar, se aconseja el método equalsIgnoreCase().
        +EXTRA: posibilidad de mover un elemento a otro lugar de la lista, sin borrar el que había
        +EXTRA: calcular precio final del producto según su peso y precio/Kg
         */

        ArrayList<Carrito> comida = new ArrayList<>();
        String userComida;
        String userOrigen;
        float userPeso;
        float userPrecio;

        // comida.add(new Carrito());
        int opcion = 100;
        
        Scanner teclado = new Scanner(System.in);


        while (opcion != 0) {
            System.out.println("=============================================================================");
            System.out.println("Selecciona una opción del menú escribiendo el número correspondiente:");
            System.out.println("1 - Añadir comida.");
            System.out.println("2 - Mostrar lista completa.");
            System.out.println("3 - Mostrar un producto específico por nombre.");
            System.out.println("4 - Modificar por nombre. ¿Cuál quieres modificar?");
            System.out.println("5 - Borrar elemento por nombre.");
            System.out.println("0 - Salir.");
            System.out.println("=============================================================================");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 0:
                System.out.println("=======");
                System.out.println("¡Adiós!");
                System.out.println("=======");
                break;

                case 1:
                System.out.println("==================================");
                System.out.println("Introduce el nombre de la comida: ");
                teclado.nextLine();
                userComida = teclado.nextLine();
                System.out.println("==================================");
                System.out.println("Ahora introduce el origen:");
                userOrigen = teclado.nextLine();
                System.out.println("==================================");
                System.out.println("Ahora introduce el peso:");
                userPeso = teclado.nextFloat();
                System.out.println("==================================");
                System.out.println("Ahora introduce el precio:");
                userPrecio = teclado.nextFloat();

                comida.add(new Carrito(userComida, userOrigen, userPeso, userPrecio));
                break;

                case 2:
                System.out.println("==================================================================");
                for (int i = 0; comida.size() > i; i++){
                    System.out.println(comida.get(i));
                }
                break;

                case 3:
                System.out.println("==================================================================");
                System.out.println("Introduce el nombre del producto que quieres buscar:");
                Boolean encontrado = false;
                teclado.nextLine();
                userComida = teclado.nextLine();
                for(int i = 0; comida.size() > i; i++){
                    if (comida.get(i).getNombre().equalsIgnoreCase(userComida)){
                        System.out.println(comida.get(i));
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("¡Comida no encontrada!");
                }
                break;

                case 4:
                System.out.println("==================================================================");
                System.out.println("Introduce el nombre del producto que quieres modificar:");
                encontrado = false;
                String userNuevoComida;
                teclado.nextLine();
                userComida = teclado.nextLine();
                for(int i = 0; comida.size() > i; i++){
                    if (comida.get(i).getNombre().equalsIgnoreCase(userComida)){
                        System.out.println("==================================================================");
                        System.out.println("Introduce el nuevo nombre: ");
                        userNuevoComida = teclado.nextLine();
                        comida.get(i).setNombre(userNuevoComida);
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado!");
                }
                break;

                case 5:
                System.out.println("==================================================================");
                System.out.println("Introduce el nombre del producto que quieres eliminar: ");
                encontrado = false;
                teclado.nextLine();
                userComida = teclado.nextLine();
                for(int i = 0; comida.size() > i; i++){
                    if (comida.get(i).getNombre().equalsIgnoreCase(userComida)){
                        comida.remove(i);
                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado!");
                }

                break;
                
                default:
                System.out.println("Elige una de las opciones correctas.");
                break;
            }
        }






















    teclado.close();

    }
}
