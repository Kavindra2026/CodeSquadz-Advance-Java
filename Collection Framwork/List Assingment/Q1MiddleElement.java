public class Q1MiddleElement {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }

    Node head;

    Node findMiddle() {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;

    }

    public static void main(String[] args) {
        Q1MiddleElement list = new Q1MiddleElement();
        list.head = list.new Node(10);
        list.head.next = list.new Node(20);
        list.head.next.next = list.new Node(30);
        list.head.next.next.next = list.new Node(40);

        Node middle = list.findMiddle();
        System.out.println("Middle = " + middle.data);

    }

}
