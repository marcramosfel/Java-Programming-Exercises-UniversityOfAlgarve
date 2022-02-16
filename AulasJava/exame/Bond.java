package exame;

public class Bond {
    private static int price = 5;

    public boolean sell(){
        if(price<10){
            price++;
            return true;
        }else if(price>=10){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Bond b1 = new Bond();
        Bond b2 = new Bond();
        Bond b3 = new Bond();

        b1.sell();
        b2.sell();
        b3.sell();
        System.out.println(Bond.price);
    }
}
