package SoundWave.modelo.usuario;

import SoundWave.modelo.contenido.Contenido;

import java.util.ArrayList;

public class UsuarioPremium {

  private boolean descargasOffline;
  private int maxDescargas;
  private ArrayList<Contenido> descargados;
  private String calidadAudio;


  public UsuarioPremium() {
  }

  public UsuarioPremium(boolean descargasOffline, int maxDescargas, ArrayList<Contenido> descargados, String calidadAudio) {
    this.descargasOffline = descargasOffline;
    this.maxDescargas = maxDescargas;
    this.descargados = descargados;
    this.calidadAudio = calidadAudio;
  }

  public void reproducir(Contenido contenido) {

  }

  public void descargar(Contenido contenido) {

  }

  public boolean verificarEspacioDescarga() {
    return false;
  }

}

