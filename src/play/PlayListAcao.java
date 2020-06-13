package play;

import music.Musica;

public interface PlayListAcao{
	public void adicionarMusica(Musica musica);
	public void removerMusica(Musica musica);
	public int getDuracao();
}
