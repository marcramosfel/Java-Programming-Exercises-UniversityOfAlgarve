package aula2.veiculos;

public class Carro{
	/*VARIAVEIS DE INSTÂNCIA*/
	public String marca;
	public String modelo;
	public double potencia;
	public double nivelCombustivel;
	public double velocidade;
	public String matricula;
	/*METODOS DE INSTÂNCIA*/
	
	public void acelerar(double pressaoPedal){
		velocidade+= velocidade*pressaoPedal;
		nivelCombustivel-= nivelCombustivel*pressaoPedal*0.1;
	}
	public void travar(double pressaoPedal){
		velocidade-=velocidade*pressaoPedal;
	}
	
	public double getCombustivel(){
		return nivelCombustivel;
	}
	/*METODOS E VARIAVEIS DE INSTANCIA NAO SAO ESTATICOS*/
	
	@Override
	public String toString(){
		return "O carro com a matricula " + matricula+ " da marca " +marca + " " + modelo +" com "+potencia+" cavalos, vai à velocidade de "
		+velocidade+ " km/h com "+ nivelCombustivel+" litros de combustivel no depósito";
	}
	
	public boolean equals(Carro carro){
		return this.matricula.equals(carro.matricula);
	}
	
	/*
	@Override
	public boolean equals (Object obj){
		Carro carro = (Carro) obj;
		return this.matricula.equals(carro.matricula);
	} Vamos percceber isto quando falarmos em herança*/
}