package exame;

public class ServingPlate extends Plate {
    public ServingPlate(String food) {
        super(food);
    }

    public static void main(String[] args) {
        Plate plate = new ServingPlate("fish");
        System.out.println(plate.getFood());
//        System.out.println(plate.food);

    }
}
