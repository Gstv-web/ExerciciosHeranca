package br.com.generation.heranca;

public class Cachorro extends Animal {
	
	public void correr(String nome) {
		System.out.println(nome + " est� correndo...");
	}
	public void emitirSom(String nome) {
		System.out.println(nome + " est� latindo. Olha que beleza!");
	}
}
