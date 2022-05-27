package teste;

import java.util.Random;

import model.Jogo;

public class Main {

	public static void main(String[] args) {
		Jogo jogo1 = new Jogo();
		Random gerador = new Random();
		
		jogo1.setDescricao("jogoTeste");	
		jogo1.setV1(gerador.nextInt(30));
		jogo1.setV2(gerador.nextInt(30));
		jogo1.setV3(gerador.nextInt(30));
		jogo1.setV4(gerador.nextInt(30));
		jogo1.setV5(gerador.nextInt(30));
		jogo1.setV6(gerador.nextInt(30));
		jogo1.setV7(gerador.nextInt(30));
		jogo1.setV8(gerador.nextInt(30));
		jogo1.setV9(gerador.nextInt(30));
		jogo1.setV10(gerador.nextInt(30));
		
		jogo1.mostrarPares();
		System.out.println(jogo1.mostrarPares());
		System.out.println(jogo1.getV1());
		System.out.println(jogo1.getV2());
	}

}
