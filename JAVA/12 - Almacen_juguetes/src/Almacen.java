public class Almacen {

// Tienes una almacén de juguetes en la que cada juguete contiene estas características: nombre, precio y dimensiones (ancho, alto, profundidad)
    
    private String nombre;
    private double precio;
    private int ancho;
    private int alto;
    private int profundidad;

    //Método constructor
    public Almacen(String nombre, double precio, int ancho, int alto, int profundidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    //Método constructor vacío
    public Almacen() {
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return this.alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundidad() {
        return this.profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }


    //toString()

    @Override
    public String toString() {
        return getNombre() +
            " de " + getPrecio() + " euros" +
            " y medidas " + getAncho() + "x" +
            getAlto() + "x" +
            getProfundidad() + "cm";

    }

    }
