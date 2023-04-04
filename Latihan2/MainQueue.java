import java.util.LinkedList;
import java.util.Queue;

public class MainQueue {
    public static void queueExample(){
        Queue<String> queue = new LinkedList<>();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PhP");
        queue.offer("HTML");     
        System.out.println("Remove:" + queue.remove());
        System.out.println("Element:" + queue.element());
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek:" + queue.peek());
    }

    public static void main(String[] args) {
        queueExample();
    }
}
