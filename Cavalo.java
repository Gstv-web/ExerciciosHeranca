package br.com.generation.heranca;

public class Cavalo extends Animal {
	
	public void correr() {
		System.out.println("O cavalo est� correndo...");
	}
	
	public void emitirSom(String nome) {
		System.out.println(nome + " est� relinchando. Doidera!");
	}
}
