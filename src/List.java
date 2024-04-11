public class List {

    private Node head;

    class Node {
        int info;
        Node link;
        Node(int info, Node link) {
            this.info = info;
            this.link = link;
        }
    }

    public void insert(int i) {
        head = new Node(i, head);
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        for (Node n = head; n != null; n = n.link) {
            System.out.println(n.info);
        }
    }

    public int sum() {
        int sum = 0;
        for (Node n = head; n != null; n = n.link) {
            sum += n.info;
        }
        return sum;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        head = head.link;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        if (head.link == null) {
            head = null;
            return;
        }
        for (Node n = head; n != null; n = n.link) {
            if (n.link.link == null) {
                n.link = null;
                return;
            }
        }
    }

    public String toString() {
        if (head == null)
            return "Empty";
        String l = "";
        for (Node n = head; n != null; n = n.link) {
            l += n.info + "//";
        }
        return l.substring(0, l.length()-2);
    }

    public void addAtRear(int i) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            prev = curr;
            curr = curr.link;
        }
        if (prev == null) {
            head = new Node(i, null);
        } else {
            prev.link = new Node(i, null);
        }
    }

    public boolean contains(int i) {
        for (Node n = head; n != null; n = n.link) {
            if (n.info == i)
                return true;
        }
        return false;
    }

    public void deleteAll(int i) {
        Node prev = null;
        Node curr = head;
        boolean found = false;
        while (!found && curr != null) {
            if (curr.info == i) {
                found = true;
            } else {
                prev = curr;
                curr = curr.link;
            }
        }
        if (found) {
            if (prev == null) {
                head = null;
            } else {
                prev.link = curr.link;
            }
            deleteAll(i);
        }
    }

    public boolean isOrderIncreasing() {
        if (head == null) return false;
        if (head.link == null) return true;
        for (Node n = head; n.link != null; n = n.link) {
            if (n.info > n.link.info)
                return false;
        }
        return true;
    }

    public boolean isEqualTo(List l) {
        Node n1 = head;
        Node n2 = l.head;
        while (n1 != null && n2 != null) {
            if (n1.info != n2.info)
                return false;
            n1 = n1.link;
            n2 = n2.link;
        }
        if (n1 == n2)
            return true;
        return false;
    }

    public void insertN(int i) {
        Node prev = null;
        Node curr = head;
        boolean found = false;
        while (!found && curr != null) {
            if (curr.info > i)
                found = true;
            else {
                prev = curr;
                curr = curr.link;
            }
        }
        if (prev != null) {
            prev.link = new Node(i, curr);
        } else {
            head = new Node(i, head);
        }
    }
    public void deleteLast(int i) {
        Node curr = head;
        Node prev = null;
        Node savedCurr = null;
        Node savedPrev = null;
        boolean found = false;
        while (curr != null) {
            if (curr.info == i) {
                savedCurr = curr;
                savedPrev = prev;
                found = true;
            }
            prev = curr;
            curr = curr.link;
        }
        if (found) {
            if (savedPrev == null) {
                head = head.link;
            } else {
                savedPrev.link = savedCurr.link;
            }
        }
    }

}
