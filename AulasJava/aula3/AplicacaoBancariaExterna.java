package aula3;

public class AplicacaoBancariaExterna{
	private AplicacaoBancariaExterna(){}
	public static void main(String[] args){
		ContaPoupanca conta1 = new ContaPoupanca();
		conta1.setTaxaJuro(0.15);
		conta1.deposito(1000);
		ContaPoupanca conta2 = new ContaPoupanca();
		conta2.deposito(1000);
		conta2.setTaxaJuro(0.20);

		System.out.println("Render juro com a taxa de conta1: "+ ContaPoupanca.getTaxaJuro());
		conta1.renderJuro();
		conta1.mostrarSaldo();
		System.out.println("Render juro com a taxa de conta2: "+ ContaPoupanca.getTaxaJuro());
		conta2.renderJuro();
		conta2.mostrarSaldo();

	}
}