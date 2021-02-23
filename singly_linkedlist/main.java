package singly_linkedlist;

public class main {
    public static void main(String[] args) {

        linkedList cityList = new linkedList();
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
