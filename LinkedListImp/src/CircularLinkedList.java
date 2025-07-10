public class CircularLinkedList<T> {
    private class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> tail;

    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (tail == null) {
            tail = newNode;
            newNode.next = newNode;
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        if (tail == null) return;

        Node<T> current = tail.next;
        do {
            System.out.print(current.data + " -> ");
            current = current.next;
        } while (current != tail.next);

        System.out.println("(back to start)");
    }
}
