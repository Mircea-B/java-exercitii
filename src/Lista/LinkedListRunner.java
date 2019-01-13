package Lista;

import java.util.ArrayList;

public class LinkedListRunner {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.add(4);
        list.add(6);
        list.add(67);
        list.add(63);

        System.out.println(list.hashCode());
        list.printNodes();
        System.out.println(list);


        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(5);
        arrayList.remove(0);
        arrayList.add(4);

        for(Integer i :arrayList){
            System.out.println(i);
        }
        ArrayList<String> arrayList1=new ArrayList<>();
    }
}

