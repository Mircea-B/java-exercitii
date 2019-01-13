package Stiva;

public class Stack {
    private int head;
    private int[] stack;

    public Stack() {
        this.stack = new int[3];
        this.head = 0;
    }

    public int[] getElements() {
        return stack;
    }


    public void printElements() {
        for (int i : stack) {
            System.out.println(i);

        }
    }

    public void pushElement(int i) {
        if(head<stack.length){
            stack[head] = i;
            head++;
        }else{
            System.out.println("aici va arunca o exceptie");
        }

    }

    public void popElement(){
        if(head>0){
            head--;
            stack[head]=0;
        }else {
            System.out.println("exception out of bounds");
        }

    }
}
