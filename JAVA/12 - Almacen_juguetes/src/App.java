import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        // Existe el método calcularVolumen(), que es para los envíos, y que en un futuro se aplicará a otros productos que no sean juguetes (por lo tanto, no pertenece a la clase juguetes)
        // Desde la clase principal, debes instanciar diversos juguetes, incluyéndole los tres valores de dimensión. Al final, deben imprimirse todas las propiedades del juguete, incluyendo las del envío (volumen)
        // ¿Cómo imprimirías todos los juguetes con salto de linea entre ellos? Cómo guardarías aparte este método de visualizar todo el arraylist de juguetes para poder llamarlo cuando quieras, sin repetir código?
        // + EXTRA: añadir precio envío según volumen y sumárselo al precio del juguete (tramos de precio según volumen).
        // ++ EXTRA DIFICIL: poner el método calcular volumen en una clase llamada Dimensión (ancho, alto, profundidad). En la clase del juguete, dejar solo nombre, precio y dimensión (tipo de dato: Dimension).

        ArrayList<Almacen> almacen = new ArrayList<>();

        Almacen estante1 = new Almacen("Peluche", 12, 60, 100, 10);
        Almacen estante2 = new Almacen("Coche", 30, 12, 20, 10);
        Almacen estante3 = new Almacen("Cocina", 70, 100, 100, 60);
        Almacen estante4 = new Almacen("Monopoly", 50, 40, 40, 1);

        almacen.add(estante1);
        almacen.add(estante2);
        almacen.add(estante3);
        almacen.add(estante4);

        // int ancho;
        // int alto;
        // int profundidad;
        int calculVolum;
        
        System.out.println("==========================================================================================");
        for (int i = 0; almacen.size()>i; i++){
            Envio volumen = new Envio(almacen.get(i).getAncho(), almacen.get(i).getAlto(), almacen.get(i).getProfundidad());
            calculVolum = volumen.calculoVolumen(almacen.get(i).getAncho(), almacen.get(i).getAlto(), almacen.get(i).getProfundidad());
            
            System.out.println(almacen.get(i) + " y un volumen de " + calculVolum + " cm3.");
        }
        System.out.println("==========================================================================================");
        








    }
    }
