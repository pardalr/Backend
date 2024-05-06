public class Envio {
    
    private int ancho;
    private int alto;
    private int profundidad;
    // private int volumen;


    //Método constructor
    public Envio(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
        // this.volumen = volumen;
    }


    //GETTERS Y SETTERS
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

    // public int getVolumen(){
    //     return this.volumen;
    // }

    // public void setVolumen(int volumen){
    //     this.volumen = volumen;
    // }



    //toString()


    @Override
    public String toString() {
        return "Ancho = " + getAncho() +
            " - Alto = " + getAlto() +
            " - Profundidad = " + getProfundidad();
            // " - Volumen = " + getVolumen();
    }

    public int calculoVolumen(int ancho, int alto, int profundidad){
        return ancho * alto * profundidad;
    }

























}
