import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class task2 {

    public static void main(String[] args) {
        
     MyLinkedList testLinkedList = new MyLinkedList();
     testLinkedList.enqueue(0);
     testLinkedList.enqueue(1);
     testLinkedList.enqueue(2);
     System.out.print("Проверка добавления элементов в очередь: ");
     System.out.println(testLinkedList.linkedListMain);
     System.out.print("Проверка возврата первого элемента из очереди и его удаление: ");
     System.out.println(testLinkedList.dequeue());
     System.out.println(testLinkedList.linkedListMain);
     System.out.print("Проверка возврата первого элемента из очереди и его не удаление: ");
     System.out.println(testLinkedList.first());
     System.out.println(testLinkedList.linkedListMain);

    }

}

