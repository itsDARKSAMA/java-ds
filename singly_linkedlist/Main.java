package singly_linkedlist;

public class Main {
    public static void main(String[] args) {

        LinkedList cityList = new LinkedList();
        Node gaza = new Node("Gaza");
        Node khan = new Node("Khan Younes");
        Node rafah = new Node("Rafah");
        Node wosta = new Node("Wosta");
        cityList.insertHead(gaza);
        cityList.insertLast(khan);
        cityList.insertLast(rafah);
        cityList.insertAfter(gaza,wosta);
//        cityList.removeHead();
        cityList.displayList();
        System.out.println("is Empty ? :"+cityList.isEmpty());
    }
}
