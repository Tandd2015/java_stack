public class DLLTest {
    public static void main(String[] arg) {

        DLL dll = new DLL();

        Node n1 = new Node(3);
        Node n2 = new Node(6);
        Node n3 = new Node(9);
        Node n4 = new Node(12);
        Node n5 = new Node(15);
        Node n6 = new Node(18);

        dll.push(n1);
        dll.push(n2);
        dll.push(n3);
        dll.push(n4);
        dll.push(n5);
        dll.push(n6);

        dll.printValuesForward();
        dll.size();
        dll.pop();
        dll.size();
        dll.printValuesBackward();

        dll.contains(3);
        dll.contains(7);
    }
}