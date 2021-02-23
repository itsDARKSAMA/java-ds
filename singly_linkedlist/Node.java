package singly_linkedlist;

public class Node {

    // node map
    private Node next;
    private String cityName;
    public Node(String cityName){this.cityName = cityName;}
    public void setCityName(String cityName){this.cityName = cityName;}
    public String getCityName(){return cityName;}
    public Node getNext(){return next;}
    public void setNext(Node next){this.next=next;}

}

