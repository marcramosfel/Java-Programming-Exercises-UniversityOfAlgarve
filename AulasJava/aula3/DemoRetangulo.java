package aula3;

public class DemoRetangulo{
	public static void main(String[] args){
		Retangulo rect = new Retangulo(3,2);
		
		//rect.setDimensoes(3,2);
		
		rect.setAltura(3000);
		rect.writeOutput(); 
		
		Retangulo rect2= new Retangulo();
		
		rect2.setAltura(3);
		rect2.setLargura(3);
		
		rect2.writeOutput();
		rect2.toString();
	}
}