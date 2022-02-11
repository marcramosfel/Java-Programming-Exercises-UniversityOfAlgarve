package aula3;

public class DemoContaPoupanca{
	private DemoContaPoupanca(){}
	public static void main(String[] args){
		ContaPoupanca conta1 = new ContaPoupanca();
		ContaPoupanca.setTaxaJuro(0.15);
		conta1.deposito(1000);
		
		System.out.println("Render juro com a taxa de: "+ conta1.getTaxaJuro());
		conta1.renderJuro();
		conta1.mostrarSaldo();
		
		ContaPoupanca conta2 = new ContaPoupanca();
		conta2.deposito(500);
		
		System.out.println("Render juro com a taxa de: "+ conta2.getTaxaJuro());
		conta2.renderJuro();
		conta2.mostrarSaldo();
		
	}
}