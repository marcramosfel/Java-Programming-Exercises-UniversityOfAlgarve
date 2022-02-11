package aula8.Excecoes.src.excecoes;

public class DividoPorZeroException extends Exception{
	private int nrOvos;
	public DividoPorZeroException(int nrOvos) {
		super("Nao ha cestos!");
		this.nrOvos=nrOvos;
	}
	
	public int getNrOvos() {
		return this.nrOvos;
	}
}
