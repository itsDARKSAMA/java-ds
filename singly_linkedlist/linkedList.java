package singly_linkedlist;

public class linkedList {

    Node head, last = null;
    private int size = 0;

    // getters and setters

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int Size() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }


    // insert Head
    public void insertHead(Node newNode) {
        if (size == 0) {
            setHead(newNode);
            setLast(newNode);
        } else {
            newNode.setNext(head);
            setHead(newNode);
        }
        setSize(size += 1);
    }


    // insert Last
    public void insertLast(Node newNode) {
        if (size == 0) {
            setHead(newNode);
            setLast(newNode);
        } else {
            getLast().setNext(newNode);
            setLast(newNode);
        }
        setSize(size += 1);
    }

    //insert after
    public void insertAfter(Node currentNode, Node newNode) {

        if (currentNode != null) {
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            size += 1;
        }

    }

    //remove Head
    public void removeHead() {
        if (Size() != 0) {
            setHead(getHead().getNext());
            setSize(size -= 1);
        }
    }

    //Display list
    public void displayList() {

        if (Size() != 0) {
            Node current = head;
            while (current != null) {
                System.out.println(current.getCityName());
                current = current.getNext();
            }
            System.out.println("---------\nMap Size : " + Size());
        }
    }

    //is Empty ?
    public boolean isEmpty() {

        if (Size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
