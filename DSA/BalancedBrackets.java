package DSA;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String a = "{[(])}";
        Stack<Character> stack = new Stack<Character>();
        boolean value = true;

        for (int i = 0; i < a.length(); i++) {
            char temp = a.charAt(i);
            if (temp == '[' || temp == '(' || temp == '{') {
                stack.push(temp);
            } else if (temp == ']' || temp == ')' || temp == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Stack is empty");
                    value = false;
                }
                char top = stack.pop();
                if ((temp == ')' && top != '(') ||
                        (temp == ']' && top != '[') ||
                        (temp == '}' && top != '{')) {
                    value = false;
                }
            }
        }
        if (value) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
