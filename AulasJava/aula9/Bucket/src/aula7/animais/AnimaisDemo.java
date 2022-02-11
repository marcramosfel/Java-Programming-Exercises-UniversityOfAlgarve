package aula9.Bucket.src.aula7.animais;

import aula9.Bucket.src.aula7.animaisEstimacao.*;
import aula9.Bucket.src.aula7.animaisQuinta.*;
import aula9.Bucket.src.aula7.vermes.*;
public class AnimaisDemo {

	public static void main(String[] args) {
		// Esta inst�ncia � do tipo C�o e � do tipo Animal e � tamb�m do tipo Object
		Cao bobi = new Cao("Bobi");
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
		System.out.println("\n"+worm);
		worm.correr();

		System.out.println("\n***GUARDADO EM VARIAVEL DO TIPO ANIMAL***");
		Animal cao1=new Cao("Cao1");		
		
		System.out.println("\n"+cao1);
		cao1.correr();
		
		Animal[] animais = {bobi,branca,clotilde, thor, tripe, worm, cao1};
		
		for(int i=0;i<animais.length;++i) {
			animais[i].correr();
			System.out.println(animais[i]);
			
			if(animais[i] instanceof Avestruz) {
				System.out.println("****INSTANCIA DE AVESTRUZ***");
				Avestruz temp = (Avestruz) animais[i];
				temp.voar();
			}
		}
		
		Avestruz idx2 = (Avestruz) animais[2];
		
		System.out.println(idx2);
		idx2.voar();
		System.out.println("\n***POLIMORFISMO COM OBJECT***");

		
		Object[] objectos= {bobi,branca,clotilde, thor, tripe, worm, cao1,
							"String qualquer", new Object()};
		
		for(int i=0;i<objectos.length;++i)
			System.out.println(objectos[i]);
		
	}
}
