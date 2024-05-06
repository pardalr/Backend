public class Discos {

    private String artista;
    private String titulo;
    private int anio;
    private int duracion;


    // Método constructor
    public Discos(String artista, String titulo, int anio, int duracion) {
        this.artista = artista;
        this.titulo = titulo;
        this.anio = anio;
        this.duracion = duracion;
    }
    
    // Método constructor vacío

    public Discos() {
    }

    // GETTERS Y SETTERS


    public String getArtista() {
        return this.artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // toString()


    @Override
    public String toString() {
        return "ARTISTA: " + getArtista() +
            ", TÍTULO: " + getTitulo() +
            ", AÑO: " + getAnio() +
            ", DURACIÓN APROX: " + getDuracion() + " min.";
    }




































    
}
