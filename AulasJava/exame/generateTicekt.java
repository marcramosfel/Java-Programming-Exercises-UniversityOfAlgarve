package exame;

public class generateTicekt {
    public static int generateTicketNumber(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            System.out.println(generateTicketNumber(0,9));
        }
    }
}
