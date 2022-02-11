package aula3;

public class ContaPoupanca{
	private double saldo;
	private static double staticTaxaJuro;

	public static void setTaxaJuro(double taxaJuro){
		staticTaxaJuro = taxaJuro;
	}
	public static double getTaxaJuro(){
		return staticTaxaJuro;
	}
	public void deposito(double montante){
		this.saldo+=montante;
	}
	public double levantar(double montante){
		if(montante>this.saldo)
			return 0;
		
		this.saldo-=montante;
		
		return montante;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public void renderJuro(){
		this.saldo+= this.saldo*staticTaxaJuro;
	}
	public void mostrarSaldo(){
		System.out.println(this);
	}
	@Override
	public String toString(){return "SALDO: " + this.saldo;}
}