package aula3;

import java.util.*;
public class StringSort{
	public static void main(String[] args){
		
		// 1. receber uma string
		Scanner keyboard = new Scanner(System.in);
		String[] arrStr = new String[5];
		int count = 0;
		System.out.println("Inserir texto:");
		//3. detectar fim do input
		
		while(keyboard.hasNextLine()){
			//2. guardar string num array
			String input = keyboard.nextLine();
			if(input.equals("")){
				break;
			}
			//2.1. se o array encher "alocar" um array maior
			if(count==arrStr.length){
				arrStr=StringSort.increaseSize(arrStr);
			}
			arrStr[count++] = input;			
		}
		

/*		String input = "UMA STRING";
		for(Scanner keyboard= new Scanner(System.in); 
				keyboard.hasNextLine()&& ! input.equals(""); 
				arrStr[count++] = input){
			if(count==arrStr.length){
				arrStr=StringSort.increaseSize(arrStr);
			}
			input = keyboard.nextLine();
		}*/
		
		//4. ordenar o array;
		StringSort.sort(arrStr);
		//5. mostrar no output
		StringSort.writeOutput(arrStr);
	}
	private static String[] increaseSize(String[] arr){ // tipos referência são passados por referência
			String[] newArrStr = new String[arr.length*2];
			for(int i =0; i<arr.length;++i){
				newArrStr[i]= arr[i];
			}
			return newArrStr;

	}
	private static void sort(String[] arr){
		
		for(int i=0;i<arr.length&&arr[i]!=null;i++){
			for(int j=i+1;j<arr.length&&arr[j]!=null;j++){
				if(arr[i].compareTo(arr[j])>0){
					String tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	private static void writeOutput(String[] arr){
		System.out.println("Mensagens:");
		for(int i=0;i<arr.length&&arr[i]!=null;++i){
			System.out.print(arr[i]+ ',');
		}
	}
}