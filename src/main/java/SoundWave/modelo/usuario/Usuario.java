package SoundWave.modelo.usuario;

import SoundWave.enums.TipoSuscripcion;
import SoundWave.modelo.contenido.Contenido;
import SoundWave.modelo.plataforma.Playlist;

import java.util.ArrayList;
import java.util.Date;

public abstract class Usuario {

  protected String id;
  protected String nombre;
  protected String email;
  protected String password;
  protected TipoSuscripcion suscripcion;
  protected ArrayList<Playlist> misPlaylists;
  protected ArrayList<Contenido> historial;
  protected Date fechaRegistro;

  public Usuario() {
  }

  public Usuario(Date fechaRegistro, ArrayList<Contenido> historial, ArrayList<Playlist> misPlaylists, TipoSuscripcion suscripcion, String password, String email, String nombre, String id) {
    this.fechaRegistro = fechaRegistro;
    this.historial = historial;
    this.misPlaylists = misPlaylists;
    this.suscripcion = suscripcion;
    this.password = password;
    this.email = email;
    this.nombre = nombre;
    this.id = id;
  }

  public void reproducir(Contenido contenido) {

  }

  public Playlist crearPlaylist(String nombre) {
  }

  public void seguirPlaylist(Playlist playlist) {

  }

  public void darLike(Contenido contenido) {

  }

  public boolean validarEmail() {
    return false;
  }

  public boolean validarPassword() {
    return false;
  }

  public void agregarAIHistorial(Contenido contenido) {

  }
}
