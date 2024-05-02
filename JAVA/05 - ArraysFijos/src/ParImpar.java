import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) throws Exception {

        /*2 - Tienes un array de 20 números enteros: decir cuales son pares e impares.
        +EXTRA: irlos añadiendo a nuevos arrays: 'arrayPares' y 'arrayImpares', y al final mostrar los tres arrays. En este caso, deberias saber por adelantado el length de cada uno (que hay 3 pares y 5 impares), o bien hacer arrays más grandes y dejar los últimos en null.*/

        // Iniciamos lectura del teclado
        Scanner teclado = new Scanner(System.in);

        System.out.println("Define número de elementos del array:");
        
        //Registro el valor numérico en una variable int
        int elementos = teclado.nextInt();

        teclado.close();

        // Crear el array con el numero de elementos definido
        int[] numeros = new int[elementos];

        // Introducir valores del 1 al número definido por el usuario
        for (int i = 0; i<numeros.length; i++){
            numeros[i] = i+1;
        }

        int modulo = 0;
        int impar = 0;
        int par = 0;


        // Bucle para definir de cuanto serán los arrays Par e Impar, haciendo la división de elementos
        for (int i = 0; i<numeros.length; i++){
            modulo = numeros[i]%2;
            if (modulo == 0) {
                par = par + 1;
            } else {
                impar = impar + 1;
            }
        }

        System.out.println("=================================================");
        System.out.println("Tenemos " + par + " pares y " + impar + " impares");

        // Crear los arrays de Par e Impar con el número de elementos que toca
        int[] arrayImpar = new int[impar];
        int[] arrayPar = new int[par];
        int numArrayPar = 0;
        int numArrayImpar = 0;

        // Pasar los números correspondientes a los arrays correspondientes
        for (int i = 0; i<numeros.length; i++){
            modulo = numeros[i]%2;
            if (modulo == 0) {
                    arrayPar[numArrayPar] = numeros[i];
                    numArrayPar++;
            } else {
                arrayImpar[numArrayImpar] = numeros[i];
                numArrayImpar++;
        }

        }
        

        // Imprimir las variables y su contenido.

        System.out.println("================");
        System.out.println("Numeros pares:");
        for (int arrayPares : arrayPar){
            System.out.println(arrayPares);
        }

        System.out.println("================");
        System.out.println("Numeros impares:");
        for (int arrayImpares : arrayImpar){
            System.out.println(arrayImpares);
        }

        System.out.println("========================");
        System.out.println("Numeros pares e impares:");
        for (int numero : numeros){
            System.out.println(numero);
        }

    }
    
}
