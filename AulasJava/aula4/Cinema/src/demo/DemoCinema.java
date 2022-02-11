package aula4.Cinema.src.demo;

import aula4.Cinema.src.cinema.*;
public class DemoCinema {
	public static void main(String[] args) {

		
		/*Inst�nciar Actores*/
		Actor zezinho = new Actor("Zezinho","1234567890","17/10/1937");
		Actor huguinho = new Actor("Huguinho","1234567890","17/10/1937");
		Actor luisinho = new Actor("Luisinho","1234567890","17/10/1937");
		Actor donale = new Actor("Donald","999999999","09/06/1934");
		Actor tioPatinhas = new Actor("Tio Patinhas","$$$$$$$$$$$$$","01/12/1947");
		Actor micke = new Actor("Rato Mickey","88888888888","18/11/1928");
		Actor pateta= new Actor("Pateta","#&$%&$","25/05/1932");
		
		Agencia disner = new Agencia ("Walt Disney");
		disner.addActor(zezinho);
		zezinho.setAgencia(disner);
		disner.addActor(huguinho);
		disner.addActor(luisinho);
		disner.addActor(tioPatinhas);
		disner.addActor(micke);
		disner.addActor(pateta);
		
		Actor bugs = new Actor("Bugs Bunny","11111111111","27/07/1940");
		Actor daffy = new Actor("Daffy Duck","2222222222","17/04/1937");
		Actor porky = new Actor("Porky Pig","33333333333","02/03/1935");
		Actor tweety = new Actor("Tweety Bird","44444444","01/01/1947");
		
		Agencia wb = new Agencia("Warner Bros");
		wb.addActor(bugs);
		wb.addActor(daffy);
		wb.addActor(porky);
		wb.addActor(tweety);

		/*Criar Filmes*/
		
		Filme camelo = new Filme("O meu camelo eras tu",1992,120,Filme.Escala.PESSIMO);
		camelo.addActor(huguinho);
		camelo.addActor(zezinho);
		camelo.addActor(luisinho);
		camelo.addActor(bugs);
		Filme regresso = new Filme("O regresso dos que nunca foram",2009,120,Filme.Escala.MUITO_BOM);
		regresso.addActor(zezinho);
		regresso.addActor(luisinho);
		regresso.addActor(tioPatinhas);
		regresso.addActor(tweety);
		regresso.addActor(porky);
		regresso.addActor(pateta);
		regresso.addActor(micke);
		Filme fuga = new Filme("A fuga dos chatos para a India",2010,120,Filme.Escala.MAU);
		fuga.addActor(zezinho);
		fuga.addActor(luisinho);
		fuga.addActor(tioPatinhas);
		fuga.addActor(tweety);
		fuga.addActor(porky);
		fuga.addActor(pateta);
		fuga.addActor(micke);
		fuga.addActor(bugs);

		
		/*Instanciar cinemas*/
		
		Cinema nos = new Cinema("NOS Lusomundo");
		nos.addFilme(fuga);
		nos.addFilme(regresso);
		Cinema castelo = new Cinema("Castelo Lopes");
		castelo.addFilme(fuga);
		castelo.addFilme(regresso);
		castelo.addFilme(camelo);
		/*Mostrar Cartazes*/
		nos.mostrarCartaz();
		castelo.mostrarCartaz();
		/*Mostrar Carteiras de agencias*/
		//disner.mostrarCarteira();
		//wb.mostrarCarteira();
		
		

	}
}
