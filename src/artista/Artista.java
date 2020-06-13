package artista;

import java.util.List;
import java.util.stream.Collectors;

import aplicacao.Storage;
import music.Musica;

public class Artista extends Storage<Musica> implements ArtistaInterface{

	String nomeDoArtista;
	
	public String getNomeDoArtista() {
		return nomeDoArtista;
	}

	public void setNomeDoArtista(String nomeDoArtista) {
		this.nomeDoArtista = nomeDoArtista;
	}

	@Override
	public List<String> getMusica() {
		return super.getItems().stream().map(musica -> musica.getTituloMusica()).collect(Collectors.toList());
		
	}

	
}
