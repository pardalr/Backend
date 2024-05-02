import java.util.ArrayList;

public class n1_ArrayList {
    public static void main(String[] args) throws Exception {

        /* 1- Rellenar ArrayList y mostrar resultado:
        Crear un arraylist mediante un bucle con los números del 20 al 50. Mostrar después todo el contenido del arraylist final. */

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i<=30; i++){
            lista.add(i, i+20);
            System.out.println(lista.get(i));
        }





















    }
}
