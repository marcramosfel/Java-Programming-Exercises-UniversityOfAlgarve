package exame;

import org.w3c.dom.ls.LSOutput;

public class RobotMaster {
    private int tanks = 0;

    public static void main(String[] args) {
        RobotMaster ice = new RobotMaster();
        RobotMaster cut = new RobotMaster();

        if (++ice.tanks == 1 && ice.thisReturnsTrue()){
            System.out.print("Blue ");
        }
        if(cut.tanks++ == 0 || ice.thisReturnsFalse()){
            System.out.print(cut.tanks%2 == 0 ? "Bomber":"Rock");
        }
        System.out.println(ice.tanks + cut.tanks);

    }

    private boolean thisReturnsTrue() {
        System.out.print("The ");
        return true;
    }

    private boolean thisReturnsFalse() {
        this.tanks++;
        return false;
    }
}
