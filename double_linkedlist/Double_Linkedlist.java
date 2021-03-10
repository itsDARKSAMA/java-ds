package double_linkedlist;

public class Double_Linkedlist {
    private Node Head, Last = null;
    private int size = 0;

    public Node getHead() {
        return Head;
    }

    // getters and setters
    public Node getLast() {
        return Last;
    }

    public int getSize() {
        return size;
    }

    //Inserting
    public void insertHead(Node newNode) {
        if (getSize() == 0) {
            Head = newNode;
            Last = newNode;
        } else {
            newNode.setNext(getHead());
            getHead().setPrev(newNode);
            Head = newNode;
        }
        size ++;
    }

    public void insertLast(Node newNode) {
        if (getSize() == 0) {
            Head = newNode;
            Last = newNode;
        } else {
            getLast().setNext(newNode);
            newNode.setPrev(getLast());
            Last = newNode;
        }
        size++;
    }

    //removing
    public void removeHead() {
        if (getSize() != 0) {
            Head=getHead().getNext();
            size --;
        }
    }

    public void removeLast() {
        if (getSize() != 0) {
            Last=getLast().getPrev();
            Last.setNext(null);
            size --;
        }
    }

    //Display list
    public void displayList() {

        if (getSize() != 0) {
            Node current = getHead();
            while (current != null) {
                System.out.println(current.getCityName());
                System.out.println(current.getArea());
                current = current.getNext();
            }

        }
    }


    //isEmpty ?
    public boolean isEmpty() {
        return getSize() == 0;
    }
}
