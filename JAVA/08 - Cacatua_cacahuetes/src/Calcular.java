import java.util.Scanner;

public class Calcular {

    public static void main(String[] args) throws Exception{
    // 2-  CALCULAR
    //     Con switch, preguntar la operación, y con switch envíalo a una función diferente
    //     ( ‘sumar’, ‘restar’, ‘multiplicar’ y ‘dividir’ )que retorne el resultado a la opción del switch y se
    //     muestre en terminal.
    //     +EXTRA: Opcional: colocar todo el programa en un bucle que siga funcionando mientras que el usuario no
    //     escriba “s” (salir).
    //     +EXTRA: usar char y (+, -, *,/)

    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce la operación que desea realizar (sumar, restar multiplicar o dividir): ");
    String operacion = teclado.nextLine();
    operacion = operacion.toLowerCase();
    System.out.println("Introduce el primer número que desea " + operacion);
    int num1 = teclado.nextInt();

    System.out.println("Introduce el segundo número que desea " + operacion);
    int num2 = teclado.nextInt();
    
    double resultado = 0;

        switch (operacion){
            case "sumar":
                resultado = sumar(num1, num2);
            case "restar":
                resultado = restar(num1, num2);
                break;
            case "multiplicar":
                resultado = multiplicar(num1, num2);
                break;
            case "dividir":
                resultado = dividir(num1, num2);
                break;
            default:
                System.out.println("Escribe correctamente la operación que quieres realizar.");
                break;

        }

        System.out.println("El resultado de la operación es: " + resultado);


        teclado.close();






    }

    public static double sumar(int num1, int num2){
        return num1 + num2;
    }

    public static double restar(int num1, int num2){
        return num1 - num2;
    }

    public static double multiplicar(int num1, int num2){
        return num1 * num2;
    }

    public static double dividir(int num1, int num2){
        return (double) num1 / num2;
    }




}
