package play;

import aplicacao.Storage;
import music.Musica;

public class PlayList extends Storage<Musica> implements PlayListAcao{

	@Override
	public void adicionarMusica(Musica musica) {
		super.add(musica);
		
	}

	@Override
	public void removerMusica(Musica musica) {
		super.remove(musica);
		
	}

	@Override
	public int getDuracao() {
		return super.getItems().stream().mapToInt(musica -> getDuracao()).sum();
		
	}
	
	
	
	
}
