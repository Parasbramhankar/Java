package CollectionFramework.Stack;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();
        stack.push("MCA");
        stack.push("BE");
        stack.push("BSC");
        stack.push("BCOM");
        stack.push("BBA");
        stack.add("Paras");

        /*System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());*/
        stack.remove("BE");

        for (String str:stack) {
            System.out.println(str);
        }
        String str=stack.pop();
        System.out.println(str);


    }
}
