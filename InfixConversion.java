import java.util.Scanner;

public class InfixConversion {
    int MaxSize, tos, PostFix;
    char stack[];
    static char postfix[];

    void createStack(int size) {
        MaxSize = size;
        tos = -1;
        stack = new char[MaxSize];
        postfix = new char[MaxSize];
        PostFix = 0;
    }

    void push(char e) {
        stack[++tos] = e;
    }

    

    char pop() {
        return stack[tos--];
    }

    char peek() {
        return stack[tos];
    }

    boolean isEmpty() {
        return tos == -1;
    }
    // Return precedence of operator
    int precedence(char c) {
        return switch (c) {
            case '^' -> 3;
            case '*', '%', '/' -> 2;
            case '+', '-' -> 1;
            case '(', ')' -> 0;
            default -> -1;
        }; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter infix expression:");
        String line = in.next();
        InfixConversion obj = new InfixConversion();
        obj.createStack(line.length());

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c>='a' && c<='z') {
                postfix[obj.PostFix++] = c;
            } else if (c == '(') {
                obj.push(c);
            } else if (c == ')') {

                
                while (!obj.isEmpty() && obj.peek() != '(') {
                    postfix[obj.PostFix++] = obj.pop();
                }
                if (!obj.isEmpty() && obj.peek() != '(') {
                    System.out.println("Invalid Expression"); // invalid expression
                    return;
                } else {
                    obj.pop();
                }
            } else {
                while (!obj.isEmpty() && obj.precedence(c) <= obj.precedence(obj.peek())) {
                    postfix[obj.PostFix++] = obj.pop();
                }
                obj.push(c);
            }
        }

        while (!obj.isEmpty()) {
            postfix[obj.PostFix++] = obj.pop();
        }

        System.out.print("Postfix expression: ");
        for (int i = 0; i < obj.PostFix; i++) {
            System.out.print(postfix[i]);
        }
    }
}