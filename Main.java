Apublic class Main {
    public static void main(String[] args) {
        System.out.println("Stack - java \n");

        MyStackLinkedList stack = new MyStackLinkedList();

        stack.push(new Node(2));
        stack.push(new Node(7));
        stack.push(new Node(5));

        stack.print();
        System.out.println(" ");
        System.out.println(" ");

        Node node = stack.peek();
        if (node != null) {
            System.out.println("Peek");
            node.printData();
            System.out.println("****");
        }

        Node node2 = stack.pop();
        if (node != null) {
            System.out.println("pop");
            node.printData();
        }

        System.out.println("");
        stack.print();
    }
}
