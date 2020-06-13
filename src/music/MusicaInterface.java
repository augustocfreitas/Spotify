package music;

import artista.Artista;

public interface MusicaInterface {
	public void adiconarArtistas(Artista artista);
	public void removerArtista(Artista artista);
	int getDuracao();

}
