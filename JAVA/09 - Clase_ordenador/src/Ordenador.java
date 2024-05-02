public class Ordenador {

// Trabajas para una tienda de informática y te encargan crear una base de datos para los nuevos ordenadores que van llegando.
// Necesitas crear el objeto Ordenador, con sus atributos correspondientes: marca, modelo, memoria RAM, capacidad del disco duro, precio ... etc (cantidad y tipo de  atributos a tu gusto, pero poner al menos 3).

private String marca;
private String modelo;
private int RAM;
private int discoDuro;
private double precio;

public Ordenador(String marca, String modelo, int RAM, int discoDuro, double precio) {
    this.marca = marca;
    this.modelo = modelo;
    this.RAM = RAM;
    this.discoDuro = discoDuro;
    this.precio = precio;
}

// Debes añadir el método constructor, los getters y setters y el toString(). Recuerda no hacer copiar y pegar, ni buscar ningún método de generación de código automático. Hay que pensar y practicar, al menos por hoy!

//GETTERS:==============================================================================================================
public String getMarca(){
    return this.marca;
}

public String getModelo(){
    return this.modelo;
}

public int getRAM(){
    return this.RAM;
}

public int getDiscoDuro(){
    return this.discoDuro;
}

public double getPrecio(){
    return this.precio;
}
//======================================================================================================================

//SETTERS:==============================================================================================================
public void setMarca(String marca) {
    this.marca = marca;
}

public void setModelo(String modelo){
    this.modelo = modelo;
}

public void setRAM(int RAM){
    this.RAM = RAM;
}

public void setDiscoDuro(int discoDuro){
    this.discoDuro = discoDuro;
}

public void setPrecio(double precio){
    this.precio = precio;
}
//======================================================================================================================

//toString()============================================================================================================
@Override
public String toString(){
    return "Este " + getMarca() + " " + getModelo() + ", tiene " + getRAM() + " GB de RAM, con un disco duro de " +
    getDiscoDuro() + " GB y tiene un precio de " + getPrecio() + " euros.";
}

// Siéntete libre de modificar el toString a tu gusto.
// Una vez definida la clase del ordenador, crea al menos 3 instancias y prueba a imprimir los objetos en dos maneras:

// 1. Todas sus características
// 2. Imprime solo características sueltas como la marca y el precio del ordenador elegido.
// 3. Probar a cambiar una propiedad y volver a mostrarla




}
