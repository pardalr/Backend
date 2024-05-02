import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Bicicletas> coleccion = new ArrayList<>();



        Bicicletas b1 = new Bicicletas("Specialized Tarmac", "SL7", 50, true);
        Bicicletas b2 = new Bicicletas("Trek Domane", "AL 2", 35, false);
        Bicicletas b3 = new Bicicletas("Cannondale SuperSix", "EVO", 45, true);
        Bicicletas b4 = new Bicicletas("Giant Defy", "Advanced Pro 1", 40, true);
        Bicicletas b5 = new Bicicletas("Bianchi", "Aria", 45, true);

        System.out.println(b1.toString());
        // Método EXTRA: b1.tieneMarchas(b1.getMarchas());

        // Añadir los elementos dentro del ArrayList.
        coleccion.add(b1);
        coleccion.add(b2);
        coleccion.add(b3);
        coleccion.add(b4);
        coleccion.add(b5);

        // System.out.println(b1.getMarca()); ASÍ NO FUNCIONA
        // System.out.println(coleccion.get(4).getMarca()); ASÍ SÍ FUNCIONA

        for(Bicicletas x: coleccion){
            System.out.println(x);
        }

        // for(Bicicletas x: coleccion){
        //     System.out.println(x.getMarca());
        // }

        for(int i=0; i<coleccion.size(); i++){
            System.out.println("La marca es " + coleccion.get(i).getMarca() + " " + coleccion.get(i).getModelo());
        }


        // Utilizar el método Set, para modificar:
        Bicicletas b6 = new Bicicletas("Terreneitor", "2000", 70, true);
        coleccion.set(0, b6);

        System.out.println(coleccion);

        // Utilizar el método add, para añadir:
        coleccion.add(b1);
        System.out.println(coleccion);








    }
}
