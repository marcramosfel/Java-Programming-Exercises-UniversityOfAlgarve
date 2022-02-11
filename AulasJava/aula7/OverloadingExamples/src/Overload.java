package aula7.OverloadingExamples.src;

public class Overload {

	
	//m�todos recebem n�meros, e retornam a sua soma, como inteiro
	
	public static int soma(int a, int b) {
		return a+b;
	}
	public static int soma(String a, String b) {
		return Integer.parseInt(a)+Integer.parseInt(b);
	}
	public static int soma(int[] a) {
		int res=0;
		for(int i=0;i<a.length;++i)
			res+=a[i];
		
		return res;
	}
	
	public static int soma(String[] arr) {
		int res=0;
		
		for(int i=0;i<arr.length;++i)
			res+= Integer.parseInt(arr[i]);
		
		return res;
	}
	
	public static double soma(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String args[]) {
		System.out.println(Overload.soma(1,2));
		System.out.println(Overload.soma("1","2"));
		int[] arrInt = new int[2];
		arrInt[0]=1;
		arrInt[1]=2;
		System.out.println(Overload.soma(arrInt));
		String[] arrString= new String[2];
		arrString[0]="1";
		arrString[1]="2";
		System.out.println(Overload.soma(arrString));
		System.out.println(Overload.soma(1,1,1));
	}
}
