public class Q10MiddleElement {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // middle node
    }

    public static void main(String[] args) {
        Q10MiddleElement obj = new Q10MiddleElement();
        // Create linked list manually: 10 → 20 → 30 → 40 → 50
        Node head = obj.new Node(10);
        head.next = obj.new Node(20);
        head.next.next = obj.new Node(30);
        head.next.next.next = obj.new Node(40);
        head.next.next.next.next = obj.new Node(50);
        // Find middle
        Node middle = obj.findMiddle(head);
        System.out.println("Middle = " + middle.data);
    }
}
