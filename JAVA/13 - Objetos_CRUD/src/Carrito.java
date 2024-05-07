public class Carrito {
    
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

private String nombre;
private String origen;
private double peso;
private double precio;


    //Método constructor
    public Carrito(String nombre, String origen, double peso, double precio) {
        this.nombre = nombre;
        this.origen = origen;
        this.peso = peso;
        this.precio = precio;
    }

    //Método constructor vacío
    public Carrito() {
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //toString
    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
            ", origen: " + getOrigen() +
            ", peso: " + getPeso() + " kg" +
            ", precio: " + getPrecio() + " euros.";
    }






































}
