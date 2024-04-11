import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        List l = new List();
        l.addAtRear(0);
        l.addAtRear(2);
        l.addAtRear(3);
        l.addAtRear(4);
        l.addAtRear(2);
        l.addAtRear(5);
        l.addAtRear(6);
        System.out.println(l);





//        FileWriter fw = new FileWriter("test.txt");
//        PrintWriter pw = new PrintWriter(fw);
//
//        pw.println("Hello");
//        pw.println("Bro");
//
//        pw.close();
//
//        FileReader fr = new FileReader("test.txt");
//        BufferedReader br = new BufferedReader(fr);
//
//        String line;
//
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//
//        br.close();
    }
}
