public class MyStackLinkedList {
    private Node head;
    private int size;

    public MyStackLinkedList() {
        this.size = 0;
        this.head = null;
    }

    public void push(Node node) {
        node.next = this.head;
        this.head = node;
        this.size++;
    }

    public Node pop() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        Node node = this.head;
        this.head = node.next;
        this.size--;
        return node;
    }

    public Node peek() {
        if (this.isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return this.head;
    }

    public boolean isEmpty() { return (this.size == 0); }

    public void print() {
        System.out.println("Stack: ");
        Node node = this.head;
        while (node != null) {
            node.printData();
            node = node.next;
        }
    }
}
