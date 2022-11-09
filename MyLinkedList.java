// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
import java.util.LinkedList;

public class MyLinkedList {
    public static LinkedList<Integer> linkedListMain = new LinkedList<Integer>();

    public static void enqueue(int value) {
        // enqueue() - помещает элемент в конец очереди,
        linkedListMain.add(value);
    }

    public static Integer dequeue() {
        // dequeue() - возвращает первый элемент из очереди и удаляет его,
        int temp = linkedListMain.get(0);
        linkedListMain.remove(0);
        return temp;
    }
    public static Integer first() {
        // first() - возвращает первый элемент из очереди, не удаляя.
        return linkedListMain.get(0);
    }
    public static void print(int value) {
        System.out.println(linkedListMain);
    }
}
