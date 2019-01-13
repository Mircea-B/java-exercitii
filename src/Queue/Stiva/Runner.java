package Queue.Stiva;

public class Runner {

    public static void main(String[] args) {
        Queue stack = new Queue();

        stack.pushElement(3);
        stack.pushElement(88);
        stack.popElement();
        stack.pushElement(15);
        stack.pushElement(15);

        stack.popElement();
        stack.pushElement(15);
        stack.popElement();
stack.printElements();

    }

}
