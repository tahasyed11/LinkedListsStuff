public class DLL {

    private Node first;

    class Node {
        int info;
        Node link;
        Node(int i, Node n) {
            info = i;
            link = n;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertAtFront(int i) {
        Node n = new Node(i, first);
        if (first == null) {
            first = n.link = n;
        } else {
            Node last = first;
            while (last.link != first) {
                last = last.link;
            }
            last.link = n;
            first = n;
        }
    }

    public void insertAtEnd(int i) {
        Node n = new Node(i, first);
        if (first == null) {
            first = n.link = n;
        } else {
            Node last = first;
            while (last.link != first) {
                last = last.link;
            }
            last.link = n;
        }
    }



    public void printList() {
        Node n = first;
        do {
            System.out.println(n.info);
            n = n.link;
        } while (n != first);
        System.out.println("--------------- Next: " + n.info);
    }
}
