package sq;

public class Tester {

    public static void main(String[] args){


        Stack<Integer> test = new Stack<Integer>();

        test.push(7);
        test.push(6);
        test.push(5);
        test.push(4);
        test.push(3);
        test.push(2);
        test.push(1);

        System.out.println("This is from top to bottom");
        Client.printStack(test);

        Client.flipStack(test);

        System.out.println("This is the stack flipped");
        Client.printStack(test);
    }
}
