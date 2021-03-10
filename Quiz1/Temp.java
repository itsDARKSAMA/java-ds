package myproject;

public class Temp {

    public static void main(String[] args) {
        Stacks myStack = new Stacks();
        Node gz = new Node("Gaza", 74);
        Node ws = new Node("Wosta", 56);
        Node kh = new Node("Khan Yunis", 54);
        Node rf = new Node("Rafah", 55);

        myStack.Push(gz);
        myStack.Push(kh);
        myStack.Pop();
        myStack.Pop();
        myStack.Pop();
        myStack.Push(ws);
        myStack.Push(kh);
        myStack.Push(rf);
        System.out.println(myStack.Pop());
    }
}
