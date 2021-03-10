package myproject;

public class Node {
    private String cityName;
    private double area;
    private Node Next;
    private Node Prev;

    public Node(String cityName, double area) {
        this.cityName = cityName;
        this.area = area;
    }

    // getters and setters
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setNext(Node Next) {
        this.Next = Next;
    }

    public Node getNext() {
        return Next;
    }

    public void setPrev(Node Prev) {
        this.Prev = Prev;
    }

    public Node getPrev() {
        return Prev;
    }

    @Override
    public String toString() {
        return cityName + ":" + area;
    }

}
