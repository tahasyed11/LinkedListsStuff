public class Queue {
    private Node front;
    private Node rear;

    class Node {
        int info;
        Node link;
        Node(int i, Node l) {
            info = i;
            link = l;
        }
    }

    public void enqueue(int i) {
        if (front == null) {
            rear = front = new Node(i, null);
        } else {
            rear = rear.link = new Node(i, null);
        }
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int peek() {
        if (front == null) {
            System.out.println("D:");
            return -1000;
        }
        return front.info;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("D:");
            return -1000;
        }
        int i = front.info;
        front = front.link;
        if (front == null)
            rear = null;
        return i;
    }

}
