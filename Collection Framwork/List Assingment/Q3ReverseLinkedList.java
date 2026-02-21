public class Q3ReverseLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    // REVERSE FUNCTION
    void reverse() {
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; // store next
            curr.next = prev; // reverse link
            prev = curr; // move prev
            curr = next; // move curr
        }

        head = prev; // new head
    }

    public static void main(String[] args) {

        Q3ReverseLinkedList list = new Q3ReverseLinkedList();

        // DIRECT NODE CREATION
        list.head = list.new Node(10);
        list.head.next = list.new Node(20);
        list.head.next.next = list.new Node(30);
        list.head.next.next.next = list.new Node(40);

        Node temp = list.head;

        // REVERSE
        list.reverse();

        System.out.println("Reversed:");

        // DIRECT PRINT
        temp = list.head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
