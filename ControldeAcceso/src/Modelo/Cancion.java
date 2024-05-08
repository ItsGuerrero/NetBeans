package Modelo;

public class Cancion {
    //Atributos
    private String titulo;
    private String album;
    private String artista;
    private String duracion;
    //Constructor

    public Cancion(String titulo, String album, String artista, String duracion) {
        this.titulo = titulo;
        this.album = album;
        this.artista = artista;
        this.duracion = duracion;
    }
   
    //Metodos
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    //ToString

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", album=" + album + ", artista=" + artista + ", duracion=" + duracion + '}';
    }
    
    
}
