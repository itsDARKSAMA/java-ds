package myproject;

public class Stacks {

    // Object data[] = new Object[5];
    Double_Linkedlist myList = new Double_Linkedlist();

    public void Push(Node newItem) {
        myList.insertLast(newItem);
    }

    public Object Pop() {

        if (myList.isEmpty()) {
            System.out.println("Can't remote from Empty Stack");
            return null;
        } else {
            Node temp = myList.getLast();
            myList.removeLast();
            return temp;
        }
    }

    public int getTop() {
        return myList.getSize() - 1;
    }
}