package br.com.generation.heranca;

public class TestaAnimal {

	public static void main(String[] args) {

		Cachorro doguinho = new Cachorro();
		
		doguinho.setNome("Totó");
		System.out.print("O nome do cachorro é " + doguinho.getNome());
		doguinho.setIdade(8);
		System.out.print("\n" + doguinho.getNome() + " tem " + doguinho.getIdade() + " anos.\n");
		doguinho.emitirSom(doguinho.getNome());
		doguinho.correr(doguinho.getNome());
		
		Cavalo equino = new Cavalo();
		
		equino.setNome("Cavalo de Fogo");
		System.out.println("\nO nome do cavalo é " + equino.getNome());
		equino.setIdade(16);
		System.out.println(equino.getNome() + " tem " + equino.getIdade() + " anos.");
		equino.emitirSom(equino.getNome());
		equino.correr();
		
		Preguica sloth = new Preguica();
		
		sloth.setNome("Lerdinha");
		System.out.println("\nO nome da preguiça é " + sloth.getNome());
		sloth.setIdade(11);
		System.out.println(sloth.getNome() + " tem " + sloth.getIdade() + " anos.");
		sloth.emitirSom(sloth.getNome());
		sloth.subirArvore();
		
		
		
		
	}

}
