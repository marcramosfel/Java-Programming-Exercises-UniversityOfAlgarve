package aula2.animais;

public class Cao{
	
	public String nome;
	public String raca;
	public int idadeReal;
	
	public int getIdadeNatural(){
		/*if(this.idadeReal<=2){
			return this.idadeReal*11;
		}
		return 22 + 5 *(this.idadeReal+3);*/
		
		return this.idadeReal<=2 ? this.idadeReal*11 : (22 + 5 *(this.idadeReal+3));
	}
	public void writeOutput(){
		System.out.println(this);
	}
	@Override
	public String toString(){
		System.out.println("!!!!!!!!!!!!!!!!!!!! FUI CHAMADO IMPLICITAMENTE!!!!!!!!!!!!!!");

		return "Nome:" + this.nome +"\n"+"Raca"+this.raca+"\n"+"Idade real:"+this.idadeReal+"\n"+
		"Idade Natural:"+this.getIdadeNatural()+"\n";
	}
}