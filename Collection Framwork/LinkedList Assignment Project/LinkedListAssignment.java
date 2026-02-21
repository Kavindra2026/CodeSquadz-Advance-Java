import java.io.*;

// Nodes
class Node {
    Integer data;
    Node next;
}

// Iterator Interface
interface MyIterator {
    boolean hasNext();
    Integer next();
}

// MyLinkedList Class
class MyLinkedList implements MyIterator {
    Node start = null;
    Node hsnxt, nxt;

    public MyIterator myiterator() {
        nxt = hsnxt = this.start;
        return this;
    }

    public boolean hasNext() {
        boolean flag = false;
        if (this.hsnxt != null) {
            flag = true;
            this.hsnxt = this.hsnxt.next;
        }
        return flag;
    }

    public Integer next() {
        Integer o = nxt.data;
        nxt = nxt.next;
        return o;
    }

    public boolean isEmpty() {
        boolean flag = false;
        if (start == null)
            flag = true;
        return flag;
    }

    // Adding at first index
    public void addFirst(Integer o) {
        Node d = new Node();
        d.data = o;
        if (start == null) {
            start = d;
            d.next = null;
        } else {
            d.next = start;
            start = d;
        }
    }

    // Adding element at last index
    public void addLast(Integer o) {
        Node d = new Node();
        d.data = o;
        d.next = null;
        if (start == null) {
            start = d;
        } else {
            Node var = start;
            while (var.next != null) {
                var = var.next;
            }
            var.next = d;
        }
    }

    // Getting first element
    public Integer getFirst() {
        return start.data;
    }

    // Getting last element
    public Integer getLast() {
        Node var = start;
        while (var.next != null) {
            var = var.next;
        }
        return var.data;
    }

    // Deleting first element
    public Integer removeFirst() {
        Integer o = null;
        if (start != null) {
            o = start.data;
            start = start.next;
        }
        return o;
    }

    // Deleting last element
    public Integer removeLast() {
        Integer o = null;
        Node var = start;
        if (var.next == null) {
            start = null;
        } else if (var != null) {
            while ((var.next).next != null) {
                var = var.next;
            }
            o = var.next.data;
            if (var.next == start) {
                start = null;
            }
            var.next = null;
        }
        return o;
    }

    // Sorting (Ascending) - Note: PDF uses name 'shot'
    public void shot() {
        Node p = start;
        Node k;
        Integer temp;
        while (p != null) {
            k = p.next;
            while (k != null) {
                if (p.data > k.data) {
                    // Swap data values
                    temp = p.data;
                    p.data = k.data;
                    k.data = temp;
                }
                k = k.next;
            }
            p = p.next;
        }
    }

    // Sorting (Descending) - Note: PDF uses name 'dec'
    public void dec() {
        Node p = start;
        Node k;
        Integer temp;
        while (p != null) {
            k = p.next;
            while (k != null) {
                if (p.data < k.data) {
                    // Swap data values
                    temp = p.data;
                    p.data = k.data;
                    k.data = temp;
                }
                k = k.next;
            }
            p = p.next;
        }
    }

    // Reverse
    public void rev() {
        Node p = start;
        Node pre = null;
        Node temp;
        while (p != null) {
            temp = p.next;
            p.next = pre;
            pre = p;
            p = temp;
        }
        start = pre;
    }

    // Search - Note: PDF uses name 'serch'
    public boolean serch(int x) {
        Node p = start;
        boolean flag = false;
        while (p != null) {
            if (p.data == x) {
                flag = true;
                break;
            }
            p = p.next;
        }
        return flag;
    }

    // Search and Replace - Note: PDF uses name 'serchreplace'
    public boolean serchreplace(int x, int y) {
        boolean flag = false;
        Node p = start;
        while (p != null) {
            if (p.data == x) {
                p.data = y;
                flag = true;
                break;
            }
            p = p.next;
        }
        return flag;
    }
}

// Main Class
class MyListAsign {
    MyLinkedList elmnt = new MyLinkedList();

    public static void main(String... s) throws IOException {
        MyListAsign obj = new MyListAsign();
        int ch, ch1 = 0;
        String str;
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

        for (;;) {
            System.out.println("Menu of the operartion for DQ");
            System.out.println("1. ADD\n2. Delete\n3. Display\n4. Sort\n5. reverse\n6. Search\n7. search&replace \n8. Exit ");
            System.out.println("Enter your choice");
            
            try {
                ch = Integer.parseInt(sc.readLine());
            } catch (NumberFormatException e) {
                ch = 0; // Handle invalid input to prevent crash
            }

            switch (ch) {
                case 1: // Add
                    for (;;) {
                        obj.clrscr();
                        System.out.println("Select the position for adding the next element");
                        System.out.println("1. Front-end\n2. Rear-end\n3. Back to main menu");
                        System.out.println("Enter your choice");
                        ch1 = Integer.parseInt(sc.readLine());

                        switch (ch1) {
                            case 1:
                                System.out.println("Enter your int Data to insert");
                                str = sc.readLine();
                                obj.elmnt.addFirst(Integer.parseInt(str));
                                break;
                            case 2:
                                System.out.println("Enter your int Data to insert");
                                str = sc.readLine();
                                obj.elmnt.addLast(Integer.parseInt(str));
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("You have enter wrong choice");
                        }
                        if (ch1 == 3) {
                            break;
                        }
                        try {
                            System.out.println("Adding the element wait.......");
                            Thread.sleep(4000);
                        } catch (Exception e) {
                        }
                        obj.clrscr();
                    }
                    break;

                case 2: // Delete
                    if (obj.elmnt.isEmpty()) {
                        System.out.println("Nothing to Delete");
                    } else {
                        for (;;) {
                            obj.clrscr();
                            if (obj.elmnt.isEmpty() == false) {
                                System.out.println("select the position to delete the element");
                                System.out.println("1. front-end\n2. Rear-end\n3. Back");
                                System.out.println("Enter your choice");
                                ch1 = Integer.parseInt(sc.readLine());

                                switch (ch1) {
                                    case 1:
                                        obj.elmnt.removeFirst();
                                        break;
                                    case 2:
                                        obj.elmnt.removeLast();
                                        break;
                                    case 3:
                                        break;
                                    default:
                                        System.out.println("you enter the wrong choice");
                                }
                            } else {
                                System.out.println("there is no element present first create ");
                                obj.clrscr();
                                break;
                            }

                            if (ch1 == 3)
                                break;
                            try {
                                System.out.println("Deleting the element wait........");
                                Thread.sleep(4000);
                            } catch (Exception e) {
                            }
                            obj.clrscr();
                        }
                    }
                    break;

                case 3: // Display
                    if (obj.elmnt.isEmpty()) {
                        System.out.println("Nothing to Display");
                    } else {
                        System.out.println("Content of the list");
                        MyIterator it = obj.elmnt.myiterator();
                        while (it.hasNext()) {
                            System.out.print(it.next());
                            System.out.print(", ");
                        }
                        System.out.println(); // Added newline for cleaner output
                    }
                    break;

                case 4: // Sort (Shorting as per PDF)
                    if (obj.elmnt.isEmpty()) {
                        System.out.println("Nothing to Shorting");
                    } else {
                        for (;;) {
                            obj.clrscr();
                            System.out.println("HOw to Short");
                            System.out.println("1. accending\n2. Decending\n3. Back to main menu");
                            System.out.println("Enter your choice");
                            ch1 = Integer.parseInt(sc.readLine());
                            switch (ch1) {
                                case 1:
                                    obj.elmnt.shot();
                                    break;
                                case 2:
                                    obj.elmnt.dec();
                                    break;
                                case 3:
                                    break;
                                default:
                                    System.out.println("you have entered wrong choice");
                            }
                            if (ch1 == 3)
                                break;
                            try {
                                System.out.println("Shorting the elements wait........");
                                Thread.sleep(4000);
                            } catch (Exception e) {
                            }
                            obj.clrscr();
                        }
                    }
                    break;

                case 5: // Reverse
                    if (obj.elmnt.isEmpty()) {
                        System.out.println("Nothing to Reverse");
                    } else {
                        obj.elmnt.rev();
                    }
                    break;

                case 6: // Search
                    if (obj.elmnt.isEmpty()) {
                        System.out.println("Nothing to Search");
                    } else {
                        System.out.println("Enter data to search");
                        ch1 = Integer.parseInt(sc.readLine());
                        if (obj.elmnt.serch(ch1)) {
                            System.out.println("data Is Available");
                            System.out.println("Content of the list");
                            MyIterator it = obj.elmnt.myiterator();
                            while (it.hasNext()) {
                                System.out.print(it.next());
                                System.out.print(", ");
                            }
                            System.out.println();
                        } else {
                            System.out.println("data Is Not Available");
                        }
                    }
                    break;

                case 7: // Search and Replace
                    if (obj.elmnt.isEmpty()) {
                        System.out.println("Nothing to Search");
                    } else {
                        System.out.println("Enter data to search");
                        ch = Integer.parseInt(sc.readLine());
                        System.out.println("Enter new data");
                        ch1 = Integer.parseInt(sc.readLine());
                        if (obj.elmnt.serchreplace(ch, ch1)) {
                            System.out.println("New linklist data Is:");
                            System.out.println("Content of the list");
                            MyIterator it = obj.elmnt.myiterator();
                            while (it.hasNext()) {
                                System.out.print(it.next());
                                System.out.print(",");
                            }
                            System.out.println();
                        } else {
                            System.out.println("data Is Not Available");
                        }
                    }
                    break;

                case 8: // Exit
                    System.exit(0);

                default:
                    System.out.println("you have entered wrong choice");
            }
            
            System.out.println("\nwait getting back....");
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
            }
            obj.clrscr();
        }
    }

    void clrscr() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
}