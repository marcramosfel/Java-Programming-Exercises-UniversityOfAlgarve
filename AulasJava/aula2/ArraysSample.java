package aula2;

public class ArraysSample
{
    public static void main(final String[] array) {
        int[] arrInt = new int[10];
        String[] arrString = new String[10];
        for (int i = 0; i < arrInt.length; ++i) {
            System.out.print(arrInt[i]+",");
        }
        System.out.println();
        for (int j = 0; j < arrString.length; ++j) {
            System.out.print(arrString[j]+",");
        }
        int n = 10;
        while (n-- > 0);
		
		// Arrays multidimensionais
		
		int[][] arrayMulti = new int[2][2];
		
		arrayMulti[0][0] = 1;
		arrayMulti[0][1] = 2;
		arrayMulti[1][0] = 3;
		arrayMulti[1][1] = 4;
		
		System.out.println();

		for(int i =0; i<arrayMulti.length;++i){
			System.out.print("[");
			for(int j=0; j<arrayMulti[i].length;++j)
				System.out.print(arrayMulti[i][j]+",");
			System.out.println("]");
		}

		String[][] arrayStringMulti = new String[2][3];
		
		arrayStringMulti[0][0] = "um";
		arrayStringMulti[0][1] = "dois";
		arrayStringMulti[0][2] = "tres";
		arrayStringMulti[1][0] = "quatro";
		arrayStringMulti[1][1] = "cinco";
		arrayStringMulti[1][2] = "seis";

				
		for(int i =0; i<arrayStringMulti.length;++i){
			System.out.print("[");
			for(int j=0; j<arrayStringMulti[i].length;++j)
				System.out.print(arrayStringMulti[i][j]+",");
			System.out.println("]");
		}
    }
}