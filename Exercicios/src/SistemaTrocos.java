import java.util.*;

public class SistemaTrocos {
    private static final double[] MOEDAS = {2.00, 1.00, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

    public static double retorna_diferenca(){
        Scanner scan = new Scanner( System.in );
//   System.out.println("Found Double value :" + scan.nextDouble());
        System.out.print("Valor do produto:");
        double price = scan.nextDouble();
//        System.out.println(price);
        System.out.print("Valor inserido:");
        double value = scan.nextDouble();
//        System.out.println(value);

        System.out.print("Troco:");
        double troco = Math.round((value - price) * 100.0) / 100.0;
        System.out.println(troco);

        return troco;
    }

    public static double[] adicionar_moeda(double[] array_trocos, double moeda) {
        for (int i = 0; i < array_trocos.length; i++) {
            if (array_trocos[i] == 0.0) {
                array_trocos[i] = moeda;
                return array_trocos;
            }
        }
        double[] novo_array = new double[array_trocos.length + 1];
//        double[] novo_array = new double[array_trocos.length * 2];
        System.arraycopy(array_trocos, 0, novo_array, 0, array_trocos.length);
        for (int j = 0; j < novo_array.length; j++) {
            if (novo_array[j] == 0.0) {
                novo_array[j] = moeda;
                return novo_array;
            }
        }
        return array_trocos;
    }
    
    private static void writeOutput(double[] arr){
        if (arr[0]==-0.1) {
            System.out.println("Não há troco");
        }else if(arr[0]==-0.2){
            System.out.println("Valor pago não suficiente");
        }else{
            System.out.println("\nMoedas:");
            int contador=1;
            for(int i=0;i < arr.length&&arr[i]!=0.0;++i){
                double moeda = arr[i];

                if(i == arr.length-1){ //confere se esta na ultima posicao, dessa forma nao precisa conferir a proxima
                    if (arr[i]<1){
                        double anchor = arr[i]*100;
                        System.out.println(contador+" moeda(s) de "+((int)anchor)+" centimo(s)");
                    }else{
                        System.out.println(contador+" moeda(s) de "+((int) arr[i])+" euro(s)");
                    }
//                    System.out.println("deu print porque chegou na posicao final do array");
                    break;
                }else if (arr[i+1]==moeda){
//                    System.out.println(contador);
                    contador++;
                } else if (arr[i+1]!=moeda){
                    if (arr[i]<1){
                        double anchor = arr[i]*100;
                        System.out.println(contador+" moeda(s) de "+((int)anchor)+" centimo(s)");
                    }else{
                        System.out.println(contador+" moeda(s) de "+((int) arr[i])+" euro(s)");
                    }

                    contador = 1;

                }
//                [2.0, 2.0, 1.0]
//                System.out.println(arr[i]+"€");
            }
        }
    }

    public static double[] array_troco() {
        double troco = SistemaTrocos.retorna_diferenca();
        if (troco==0.0){
            double[] array_trocos = new double[1];
            array_trocos[0]=-0.1;//mensagem de nao há troco;
            return array_trocos;
        }else if(troco<0.0 ){
            double[] array_trocos = new double[1];
            array_trocos[0]=-0.2;//mensagem de nao é possivel realizar pagamento;
            return array_trocos;
        }
        double[] array_trocos = new double[1];
        while (troco != 0){
            System.out.println("\nArray:");
            for(int i = 0; i<MOEDAS.length; i++){
                if (troco-MOEDAS[i]>=0) {
                    troco = Math.round((troco-MOEDAS[i])*100.0)/100.0;
//                    System.out.println(troco);
                    array_trocos = adicionar_moeda(array_trocos, MOEDAS[i]);
//                    System.out.println(i);
                    System.out.println(Arrays.toString(array_trocos));
                    --i;
                }
            }
        }

        return array_trocos;
    }

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(SistemaTrocos.array_troco()));
        do {
            writeOutput(SistemaTrocos.array_troco());
            System.out.println();
            System.out.println("################ NOVO TROCO ################");
        }while (true);
    }

}
