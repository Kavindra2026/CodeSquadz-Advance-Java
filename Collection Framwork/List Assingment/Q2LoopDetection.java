public class Q2LoopDetection {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    Node detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }

        }

        return null;
    }

    Node findLoopStart() {
        Node meet = detectLoop();
        if ((meet == null)) {
            return null;
        }
        Node p1 = head;
        Node p2 = meet;

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;

        }
        return p1;

    }

    public static void main(String[] args) {
        Q2LoopDetection list = new Q2LoopDetection();
        list.head = list.new Node(10);
        list.head.next = list.new Node(20);
        list.head.next.next = list.new Node(30);
        list.head.next.next.next = list.new Node(40);
        list.head.next.next.next.next = list.new Node(50);
        list.head.next.next.next.next.next = list.new Node(60);

        // Create Loop
        list.head.next.next.next.next.next.next = list.head.next.next.next; // 60-> 30
        Node meet = list.detectLoop();

        if (meet != null) {
            System.out.println("Loop Detected");
            Node start = list.findLoopStart();
            System.out.println("Loop starts at Node :" + start.data);
        } else {
            System.out.println("No loop found");
        }

    }
}