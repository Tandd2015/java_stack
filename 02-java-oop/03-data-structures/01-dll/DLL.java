public class DLL {
    public Node head;
    public Node tail;

    public DLL() {
        this.head = null;
        this.tail = null;
    }

    public void push(Node newNode) {
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
            return;
        }
        Node lastNode = this.tail;
        lastNode.next = newNode;
        newNode.previous = lastNode;
        this.tail = newNode;
    }

    public void printValuesForward() {
        Node current = this.head;
        while(current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public void printValuesBackward() {
        Node current = this.tail;
        while(current != null) {
            System.out.println(current.value);
            current = current.previous;
        }
    }

    public Node pop() {
        Node popNode = this.tail;
        this.tail = popNode.previous;
        this.tail.next = null;
        return popNode;
    }

    public boolean contains(int val) {
        boolean isContained = false;
        Node checkNode = this.head;
        while(checkNode != null) {
            if(checkNode.value == val) {
                isContained = true;
                System.out.println(isContained);
                return isContained;
            }
            checkNode = checkNode.next;
        }
        System.out.println(isContained);
        return isContained;
    }

    public int size() {
        int nodeCounter = 0;
        Node checkNode = this.head;
        while(checkNode != null){
            nodeCounter++;
            checkNode = checkNode.next;
        }
        System.out.println(nodeCounter);
        return nodeCounter;
    }
}
