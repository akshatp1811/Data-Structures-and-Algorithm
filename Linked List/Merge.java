class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Merge {

    // Method to print a linked list
    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating head1: 1 → 3 → 5
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(5);

        // Creating head2: 1 → 2 → 9 → 14
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(9);
        head2.next.next.next = new Node(14);

        // Printing both lists
        System.out.print("Linked List head1: ");
        printList(head1);

        System.out.print("Linked List head2: ");
        printList(head2);
    }
}
