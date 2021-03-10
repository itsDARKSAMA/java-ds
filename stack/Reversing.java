package stack;

import java.util.Scanner;

public class Reversing {

    Stacks revStack = new Stacks();
    Scanner input = new Scanner(System.in);
    String output = "";

    public String Rev(){
        System.out.println("Please enter a word : ");
        String inWord = input.nextLine();

        for (int i = 0; i < inWord.length(); i++) {
            char inChar = inWord.charAt(i);
            revStack.Push(inChar);
        }

        while (!revStack.isEmpty()){
            char newChar = (char) revStack.Pop();
            output += newChar;
        }

        return output;
    }

}
