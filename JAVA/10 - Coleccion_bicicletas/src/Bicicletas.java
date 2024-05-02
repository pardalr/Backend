public class Bicicletas {
    
// - Primero probar instanciar una o dos bicicletas sueltas
// - Luego, probar a crear un arraylist  de bicicletas
// - Y recorrer ese arraylist  para mostrarlo con bucle for y/o for-each
// - También se puede mostrar una sola propiedad (o varias) de las bicicletas. Ej: mostrar solo marca y
// velocidad máxima de todas las bicicletas.
// - Tema booleanos, probad a ponerlo como texto. Ej: “sí incluye cambio de marchas” (modificar el toString() )
// - Probar métodos set desde el main()
// +EXTRA: crear o cambiar o leer desde el scanner de usuario (con o sin bucle)
//======================================================================================================================

// Tienes una colección de bicicletas y vas registrando los últimos modelos que compraste en WallaPop.
// - Debes crear una clase Bicicleta con características como: Marca, Modelo, Velocidad Máxima, Si
// tiene marchas o no … (estas características puedes cambiarlas según tu gusto)

private String marca;
private String modelo;
private int velMax;
private boolean marchas;

    // - Recordar que debe haber también un método constructor y un toString()
    // Crear el método contructor
    public Bicicletas(String marca, String modelo, int velMax, boolean marchas) {
        this.marca = marca;
        this.modelo = modelo;
        this.velMax = velMax;
        this.marchas = marchas;
    }

    // Crear método constructor vacío
    public Bicicletas() {
    }

    // Crear GETTERS y SETTERS

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelMax() {
        return this.velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public boolean isMarchas() {
        return this.marchas;
    }

    public boolean getMarchas() {
        return this.marchas;
    }

    public void setMarchas(boolean marchas) {
        this.marchas = marchas;
    }


    // Crear toString

    @Override
    public String toString() {
        String marchas;
        if (isMarchas()) {
            marchas = " y tiene marchas";
        } else {
            marchas = " y no tiene marchas";
        }


        return " marca = " + getMarca() + "" +
            ", modelo = " + getModelo() + "" +
            ", velMax = " + getVelMax() + " km/h" +
            marchas;
    }

    // - Puedes añadir métodos: tocar el claxon, pedalear, parar, girar, cambiar marchas, …
    // Métodos EXTRA

    public void claxon(boolean claxon){
        if(claxon){
            System.out.println("¡Piiiiiiiiiiiiiiiiiip!");
        } else {
            System.out.println("...");
        }
    }

    public String tieneMarchas(boolean marchas){
        if (marchas) {
            return " y tiene marchas";
        } else {
            return " y no tiene marchas";
        }
    }



















}
