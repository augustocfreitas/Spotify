package music;

import aplicacao.Storage;
import artista.Artista;

public class Musica extends Storage<Artista> implements MusicaInterface{
	private String tituloMusica;
	private int duracaoMusica;
	private String nomeArtista;
	
	public Musica(String tituloMusica, int duracaoMusica, String nomeArtista) {
		this.tituloMusica = tituloMusica;
		this.duracaoMusica = duracaoMusica;
		this.nomeArtista = nomeArtista;
	}
	
	public Musica() {
		super();
	}

	public String getTituloMusica() {
		return tituloMusica;
	}

	public void setTituloMusica(String tituloMusica) {
		this.tituloMusica = tituloMusica;
	}

	public double getDuracaoMusica() {
		return duracaoMusica;
	}

	public void setDuracaoMusica(int duracaoMusica) {
		this.duracaoMusica = duracaoMusica;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	@Override
	public void adiconarArtistas(Artista artista) {
		super.add(artista);
		
	}

	@Override
	public void removerArtista(Artista artista) {
		super.remove(artista);
		
	}

	@Override
	public int getDuracao() {
		return duracaoMusica;
	}

	
}
