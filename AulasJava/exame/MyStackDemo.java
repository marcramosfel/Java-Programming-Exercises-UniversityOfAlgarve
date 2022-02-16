package exame;

public class MyStackDemo {
    public static void main(String[] args) {
        MyStack<String> stackString = new MyStack<>();

        stackString.push("Um");
        stackString.push("Dois");
        stackString.push("Tres");
        stackString.push("Quatro");

        System.out.println("Elements in the stack: " + stackString.size());
        System.out.println("Pop: " + stackString.pop());
        System.out.println("Elements in the stack: " + stackString.size());

        for(String curr: stackString){
            System.out.print(curr);
        }
        System.out.println("Elements in the stack: " + stackString.size());



    }

}
