import java.util.Stack;

public class ExampleStack {
    public static void main(String[] args) {
        Stack<String> at = new Stack<>();
        at.push("Aku");
        at.push("Anak");
        at.push("Indonesia");

        System.out.println("Next : " + at.peek());
        at.push("Raya");
        System.out.println(at.pop());
        at.push(" : ");

        int count = searchStack(at, "Aku");
        while (count != -1 && count > 1){
            at.pop();
            count--;
        }

        System.out.println(at.pop());
        System.out.println(at.empty());
    }

    public static int searchStack(Stack<String> stack, String item) {
        Stack<String> tempStack = new Stack<>();
        int count = 0;

        while (!stack.empty()) {
            String current = stack.pop();
            tempStack.push(current);
            count++;

            if (current.equals(item)) {
                while (!tempStack.empty()) {
                    stack.push(tempStack.pop());
                }

                return count;
            }
        }

        while (!tempStack.empty()) {
            stack.push(tempStack.pop());
        }

        return -1;
    }
}
