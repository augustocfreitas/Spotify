package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import aplicacao.Storage;
import music.Musica;
import play.PlayList;

public class Biblioteca extends Storage<PlayList> implements BibliotecaInterface{

	public List<Musica> musicas = new ArrayList<Musica>();
	
	@Override
	public void armazenarPlaylist(PlayList playlist) {
		super.add(playlist);
		
	}

	@Override
	public void removerPlaylist(PlayList playlist) {
		super.remove(playlist);
		
	}

	@Override
	public List<String> getListaMusica() {
		return musicas.stream().map(musicas -> musicas.getTituloMusica()).collect(Collectors.toList());
	}
	
	

}
