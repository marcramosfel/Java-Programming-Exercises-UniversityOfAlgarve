package aula5.Animais.src.demo;

import aula5.Animais.src.animaisEstimacao.Cao;
import aula5.Animais.src.animaisEstimacao.Hamster;
import aula5.Animais.src.animaisQuinta.Avestruz;
import aula5.Animais.src.animaisQuinta.Ovelha;
import aula5.Animais.src.vermes.Tenia;

public class AnimaisDemo {

	public static void main(String[] args) {
		// Esta inst�ncia � do tipo C�o e � do tipo Animal e � tamb�m do tipo Object
		Cao bobi = new Cao("Bobi", 21);
		Ovelha branca = new Ovelha("Branca");
		Avestruz clotilde = new Avestruz("Clotilde");
		Hamster thor = new Hamster ("Thor");
		Cao tripe = new Cao("Trip�",3);
		Tenia worm = new Tenia();
		
		System.out.print("\n"+bobi);
		bobi.correr();
		branca.setTemLa(true);
		System.out.print("\n"+branca);
		branca.correr();
		System.out.print("\n"+clotilde);
		clotilde.correr();
		System.out.print("\n"+thor);
		thor.correr();
		System.out.println("\n"+tripe);
		tripe.correr();
		System.out.println("\n+++++++++++++++++++++++");
		System.out.println("\n"+worm);
		worm.correr();
	}

}
