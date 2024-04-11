import java.util.EmptyStackException;

public class Stack {
    private Node top;

    class Node {
        int info;
        Node link;
        Node(int i, Node n) {
            info = i;
            link = n;
        }
    }

    public void push(int i) {
        top = new Node(i, top);
    }

    public String toString() {
        if (top == null)
            return "Empty";
        String l = "";
        for (Node n = top; n != null; n = n.link) {
            l += n.info + "//";
        }
        return l.substring(0, l.length()-2);
    }

    public int peek() {
        if (top == null) throw new EmptyStackException();
        return top.info;
    }

    public int pop() {
        if (top == null) throw new EmptyStackException();
        int i = top.info;
        top = top.link;
        return i;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
