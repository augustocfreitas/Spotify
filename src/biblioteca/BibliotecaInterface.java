package biblioteca;

import java.util.List;
import play.PlayList;

public interface BibliotecaInterface {
	public void armazenarPlaylist(PlayList playlist);
	public void removerPlaylist(PlayList playlist);
	public List<String> getListaMusica();
}
