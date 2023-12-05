package _5_kyu;

// You are given a node that is the beginning of a linked list. This list contains a dangling piece and a loop.
// Your objective is to determine the length of the loop.

public class LoopInspector {

    public int loopSize(Node node) {


        return 1;
    }

}

class Node {
    private Node next;

    // Конструктор для создания узла с заданным значением
    public Node() {
        this.next = null;
    }

    // Метод для получения следующего узла
    public Node getNext() {
        return this.next;
    }

    // Метод для установки следующего узла
    public void setNext(Node next) {
        this.next = next;
    }

    // Статический метод для создания цепочки узлов заданной длины с петлей
    public static Node createChain(int danglingSize, int loopSize) {
        if (danglingSize < 0 || loopSize <= 0) {
            throw new IllegalArgumentException("Invalid input parameters");
        }

        Node head = new Node();
        Node current = head;

        // Создаем узлы для длинной части без петли
        for (int i = 1; i <= danglingSize; i++) {
            current.setNext(new Node());
            current = current.getNext();
        }

        // Запоминаем начало петли
        Node loopStart = current;

        // Создаем узлы для петли
        for (int i = 1; i <= loopSize; i++) {
            current.setNext(new Node());
            current = current.getNext();
        }

        // Замыкаем петлю
        current.setNext(loopStart);

        return head.getNext(); // Возвращаем начало цепочки без фиктивного узла в начале
    }
}



