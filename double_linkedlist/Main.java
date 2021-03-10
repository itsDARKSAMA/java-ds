package double_linkedlist;

public class Main {
    public static void main(String[] args) {

        Double_Linkedlist cityList = new Double_Linkedlist();
        Node gz = new Node("Gaza",74);
        Node ws = new Node("Wosta",56);
        Node kh = new Node("Khan Yunis",54);
        Node rf = new Node("Rafah",55);

        //inserting
        cityList.insertHead(gz);
        cityList.insertLast(kh);
        cityList.insertLast(rf);
        cityList.displayList();
        cityList.removeLast();
        cityList.displayList();
//        System.out.println(cityList.getLast().getCityName());

    }
}
