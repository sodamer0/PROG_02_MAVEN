package SoundWave.modelo.artistas;

import SoundWave.modelo.contenido.Cancion;

import java.util.ArrayList;
import java.util.Date;

public class Artista {

  private String id;
  private String nombreArtistico;
  private String nombreReal;
  private String paisOrigen;
  private ArrayList<Cancion> discografia;
  private ArrayList<Album> albumes;
  private int oyentesMensuales;
  private boolean verificado;
  private String biografia;

  public Artista() {

  }

  public Artista(String id, String nombreArtistico, String nombreReal, String paisOrigen, ArrayList<Cancion> discografia, ArrayList<Album> albumes, int oyentesMensuales, boolean verificado, String biografia) {
    this.id = id;
    this.nombreArtistico = nombreArtistico;
    this.nombreReal = nombreReal;
    this.paisOrigen = paisOrigen;
    this.discografia = discografia;
    this.albumes = albumes;
    this.oyentesMensuales = oyentesMensuales;
    this.verificado = verificado;
    this.biografia = biografia;
  }

  public void publicarCancion(Cancion cancion) {

  }

  public Album crearAlbum (String titulo, Date fecha) {
    return;
  }

  public ArrayList<Cancion> obtenerTopCanciones(int Cantidad) {
    return;
  }

  public double calcularPromedioReproduccines() {
    return;
  }

  public void eliminarEpisodio(String idEpisodio) {

  }


}
