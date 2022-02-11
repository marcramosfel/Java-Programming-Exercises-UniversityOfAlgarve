package aula9.Bucket.src.demo;

import java.util.Iterator;

import aula9.Bucket.src.aula7.animais.Animal;
import aula9.Bucket.src.aula7.animaisEstimacao.Cao;
import aula9.Bucket.src.aula7.animaisEstimacao.Hamster;
import aula9.Bucket.src.aula7.animaisQuinta.Avestruz;
import aula9.Bucket.src.aula7.animaisQuinta.Ovelha;
import aula9.Bucket.src.aula7.vermes.Tenia;
import aula9.Bucket.src.balde.Balde;

public class DemoBalde {

	public static void main(String[] args) {
		Balde<String> balde1 = new Balde<>(1);
		
		balde1.add("um");
		balde1.add("dois");
		balde1.add("tres");
		balde1.add("quatro");

		//System.out.println(balde1);
		
		Balde<Animal> balde2 = new Balde<>();
		
		Cao bobi = new Cao("Bobi");
		Ovelha branca = new Ovelha("Branca");
		Avestruz clotilde = new Avestruz("Clotilde");
		Hamster thor = new Hamster ("Thor");
		Cao tripe = new Cao("Trip�",3);
		Tenia worm = new Tenia();
		
		balde2.add(bobi);
		balde2.add(branca);
		balde2.add(clotilde);
		balde2.add(thor);
		balde2.add(tripe);
		balde2.add(worm);
		
		//balde2.add("Uma string"); -> Erro de compila��o
		
		//System.out.println(balde2);
		
		//balde2.get(3).correr();
		
//		System.out.println("****For com Iterador*****");
//		
//		for(Iterator<String> it = balde1.iterator(); it.hasNext();) {
//			String s = it.next();
//			System.out.println(s);
//		}

		System.out.println("****For each*****");

		for(Animal s : balde2)
			System.out.println(s);
		
//		System.out.println("****For each*****");		
//		int[] arrInt = {1,2,3,4,5,6,7,8,9};
//		
//		for(int value : arrInt)
//			System.out.println(value);
		
	}

}
