import java.util.ArrayList;

public class n2_String {
    
    public static void main(String[] args) throws Exception {

    String fraseAleatoria = "Los errores del pasado son la sabiduría del presente";
    int contador = 0;
    ArrayList <Integer> posiciones = new ArrayList<>();
    

    for(int i = 0; i<fraseAleatoria.length(); i++){

        Character caracter = fraseAleatoria.charAt(i);


        if (caracter == 'e') {
            contador++;
            posiciones.add(i);
        }

    }

    System.out.println("====================================================================");
    System.out.println("Se ha encontrado " + contador + " veces la letra e en las posiciones: ");
    System.out.println("====================================================================");


        System.out.print(posiciones);















    }
}
