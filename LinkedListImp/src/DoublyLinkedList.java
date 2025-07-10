public class DoublyLinkedList<T> {
    private class Node<T> {
        T data;
        Node<T> prev, next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> head;

    public void insertAtEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    public void delete(T data) {
        Node<T> current = head;

        while (current != null && !current.data.equals(data)) {
            current = current.next;
        }

        if (current == null) return;

        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            head = current.next;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
    }

    public void displayForward() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " <-> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
