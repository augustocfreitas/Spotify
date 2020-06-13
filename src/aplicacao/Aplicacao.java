package aplicacao;

import java.io.Console;
import java.util.Scanner;
import java.util.stream.Stream;

import artista.Artista;
import biblioteca.Biblioteca;
import music.Musica;
import play.PlayList;

public class Aplicacao {
	public static Scanner entrada = new Scanner(System.in);
	public static Biblioteca biblioteca = new Biblioteca();
	public static Musica musica = new Musica();
	public static PlayList playlist = new PlayList();
	public static Artista artista = new Artista();
	private static Storage<Musica> bancoDeMusica;
	
	
	public static void main(String[] args) {
		System.out.println("                               --------Spotify--------");
		
		int opcao = 0;
		do {
			
			System.out.println("\n                =======================================");
			System.out.println("                  |     1 - Cadastrar Musica            |");
			System.out.println("                  |     2 - Remover Musica              |");
			System.out.println("                  |     3 - Cadastra Artista            |");
			System.out.println("                  |     4 - Remover Artista             |");
			System.out.println("                  |     5 - Cadastrar PlayList          |");
			System.out.println("                  |     6 - Remover PlayList            |");
			System.out.println("                  |     7 - Ver PlayList                |");
			System.out.println("                  |     8 - Ver Duracao Media PlayList  |");
			System.out.println("                  |     9 - Imprimir Musicas            |");
			System.out.println("                  |     0 - Sair                        |");
			System.out.println("                  =======================================\n");
			
			
			
			
			System.out.println("Escolha um opcao:");
			entrada.reset();
			opcao = entrada.nextInt();
			System.out.print("\n");
			switch (opcao) {
			case 1:
				cadastrarMusica();
				break;
			case 2:
				removerMusica();
				break;
			case 3:
				cadastrarArtista();
				break;
			case 9:
				imprimirMusica();
				break;
			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (opcao != 0);
	}
	
	public static void cadastrarMusica() {
		try {

					System.out.println("--------Cadastrando uma música--------");
					System.out.println("\nDigite o nome da sua música: \n");
					musica.setTituloMusica(entrada.next());
					System.out.println("\nDigite a duração em segundos da sua música: \n");
					musica.setDuracaoMusica(entrada.nextInt());
					entrada.reset();
					System.out.println("\nDigite o nome do Artista: \n");
					musica.setNomeArtista(entrada.next());
					bancoDeMusica.add(musica);
					System.out.println("Musica Adicionada com Sucesso!");
					entrada.reset();
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void cadastrarArtista() {
		try {
			String nomeMusica,nomeDoArtista;
			System.out.println("--------Cadastrando uma Artista--------");
			System.out.println("\nDigite o nome da música para adicionar o Artista: \n");
			nomeMusica = entrada.next();
			System.out.println("\nDigite o nome da sua Artista: \n");
			nomeDoArtista = entrada.next();
			artista.setNomeDoArtista(nomeDoArtista);
			int flag = 0;
			for(int i=0;i>bancoDeMusica.getItems().size();i++) {
				if(bancoDeMusica.getItems().get(i).getNomeArtista().equalsIgnoreCase(nomeMusica) == true) {
					bancoDeMusica.getItems().get(i).adiconarArtistas(artista);
					System.out.println("Artista Adicionado com Sucesso!");
					flag=1;
				}
			}
			if(flag==0)
				System.out.println("Nao foi possivel encontrar o Artista");
			entrada.reset();
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void removerMusica() {
		try {
					
					String nomeMusica;
					System.out.println("--------Removendo uma música--------");
					System.out.println("\nDigite o nome da sua música: \n");
					nomeMusica = entrada.next();
					int flag = 0;
					for(int i=0;i>bancoDeMusica.getItems().size();i++) {
						if(bancoDeMusica.getItems().get(i).getNomeArtista().equalsIgnoreCase(nomeMusica) == true) {
							bancoDeMusica.getItems().remove(i);
							System.out.println("Musica removida com Sucesso!");
							flag=1;
						}
					}
					if(flag==0)
						System.out.println("Nao foi possivel encontrar a Musica");
					entrada.reset();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public static void imprimirMusica() {
		
		for(Musica item : bancoDeMusica.getItems()) {
			System.out.println(item.getTituloMusica());	
		}
		
		
	}
}
