package aula3.animais;
/*Para executar usar o comando "java animais.Cao" */
public class Cao{
	
	private String nome;
	private String raca;
	private int idadeReal;

	
	public static void main(String[] args){
			Cao bobi = new Cao();
			bobi.nome = "Bobi";
			bobi.raca = "Husky";
			bobi.idadeReal = 1;

			bobi.writeOutput();
	}
	
	public int getIdadeNatural(){
		return this.idadeReal<=2 ? this.idadeReal*11 : (22 + 5 *(this.idadeReal+3));
	}
	public void writeOutput(){
		System.out.println(this);
	}
	@Override
	public String toString(){		
		return "Nome:" + this.nome +"\n"+"Raca"+this.raca+"\n"+"Idade real:"+this.idadeReal+"\n"+
		"Idade Natural:"+this.getIdadeNatural()+"\n";
	}

}