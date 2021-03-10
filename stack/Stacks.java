package stack;

public class Stacks {

    Object data[] = new Object[5];

    int top = -1;

    public void Push(Object newItem) {

        if (isFull()) {
            System.out.println("Stack is full ");
        } else {
            data[++top] = newItem;
        }

    }

    public Object Pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty ");
            return null;
        } else {
            Object temp = data[top];
            data[top] = null;
            top--;
            return temp;
        }
    }

    public boolean isFull() {
        return (top == data.length - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public String toString() {
        String stack = "------------\n";
        for (int i = 0; i < top + 1; i++) {
            stack += data[i].toString() + "\n";
        }
        stack += "------------";
        return stack;
    }

}