package SoundWave.modelo.usuario;

import SoundWave.enums.TipoSuscripcion;
import SoundWave.modelo.contenido.Contenido;
import SoundWave.modelo.plataforma.Playlist;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioGratuito extends Usuario {

  private int anunciosEscuchados;
  private Date ultimoAnuncio;
  private int reproduccionesHoy;
  private int limiteReproducciones;
  private int cancionesSinAnuncio;

  public UsuarioGratuito() {
  }

  public UsuarioGratuito(Date fechaRegistro, ArrayList<Contenido> historial, ArrayList<Playlist> misPlaylists, TipoSuscripcion suscripcion, String password, String email, String nombre, String id, int cancionesSinAnuncio, int limiteReproducciones, int reproduccionesHoy, Date ultimoAnuncio, int anunciosEscuchados) {
    super(fechaRegistro, historial, misPlaylists, suscripcion, password, email, nombre, id);
    this.cancionesSinAnuncio = cancionesSinAnuncio;
    this.limiteReproducciones = limiteReproducciones;
    this.reproduccionesHoy = reproduccionesHoy;
    this.ultimoAnuncio = ultimoAnuncio;
    this.anunciosEscuchados = anunciosEscuchados;
  }

  @Override
  public void reproducir(Contenido contenido) {
    super.reproducir(contenido);
  }

  public void verAnuncio() {

  }

  public boolean puedeReproducir() {
    return false;
  }

  public void reiniciarContadorDiario() {

  }



}
