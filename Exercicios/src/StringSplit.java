import java.util.Arrays;

public class StringSplit {

    public static String transforma_string(String str_parametro) {
        if (str_parametro.length()%2==0){
            return str_parametro;
        }else{
            return str_parametro + "_";
        }
    }

    public static String[] solution (String str_parametro){
        String string_nova = StringSplit.transforma_string(str_parametro);
        int tamanho = string_nova.length();
//        System.out.println(string_nova.length());
        String[] solucao = new String[tamanho/2];

        for (int i = 0; i < tamanho; i+=2){
            String dividir = string_nova.substring(i, i + 2);
            if (i == 0){
                solucao[i] = dividir;
            } else {
                solucao[i/2] = dividir;
            }
        }

            return solucao;

        }

    public static void main(String[] args) {
//        Em alternativa ao metodo Arrays.toString poderiamos utilizar o metodo writeOutput
        System.out.println("SOLUCAO:");
        writeOutput(solution("Olá"));
        writeOutput(solution(""));
        System.out.println(Arrays.toString(solution("Olá")));
        System.out.println(Arrays.toString(solution("UmaPalavraMesmoMuitoGrande")));
        System.out.println(Arrays.toString(solution("abcde")));
        System.out.println(Arrays.toString(solution("abcdefgh")));
        System.out.println(Arrays.toString(solution("umdoistresquatrocinco")));
        System.out.println(Arrays.toString(solution("Olá")));
        System.out.println(Arrays.toString(solution(" ")));
    }

    private static void writeOutput(String[] arr){
        System.out.print("[");
        for(int i=0;i<arr.length&&arr[i]!=null;++i) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + " ,");
            }
        }
        System.out.println("]");
    }
}

