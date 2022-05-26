package teste;

import java.util.Random;

import model.Jogo;

public class Main {

	public static void main(String[] args) {
		Jogo jogo1 = new Jogo();
		Random gerador = new Random();
		
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
		
		// System.out.println(jogo1.getV1(), jogo1.getV2(), jogo1.getV3(), jogo1.getV4(), jogo1.getV5(), jogo1.getV6(), jogo1.getV7(), jogo1.getV8(), jogo1.getV9(), jogo1.getV10());
		System.out.print(jogo1.getV1());
	}

}
