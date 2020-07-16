public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null){
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        Node runner = head;
        if(head == null) {
            System.out.println("The Singly Linked List Value Matching Input");
        }
        if(head.next == null){
            head = null;
        }
        while(runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    }

    public void printValues() {
        // gaurd statement
        if(head == null) {
            System.out.println("The Singly Linked List is Empty");
            return; // causes error ?? Twice Compile in terminal ask jason?
        }
        // always will run if gaurd statement if false
        // setting runner to be a instance of the this.head of our sll
        Node runner = head;
        while(runner.next != null) {
            System.out.println("This is the printValues Method and runner.next was not null so.....");
            String runnerProgress = String.format("Current Node Value: %s , Next Node Value: %s", runner.value, runner.next.value);
            System.out.println(runnerProgress);
            runner = runner.next;
        }
        System.out.println("This is the printValues Method and runner.next is null so.....");
        String runnerProgress = String.format("Current Node Value: %s , Next Node Value: null", runner.value);
        System.out.println(runnerProgress);
    }

    public String find(int value){
        Node runner = this.head;
        while(runner != null) {
            if(runner.value == value){
                String anwserA = String.format("Success: Current Node Value: %s , Next Node Value: %s", runner.value, runner.next.value);
                System.out.println(anwserA);
                return anwserA;
            }
            runner = runner.next;
        }
        String anwserB = String.format("Failure: Current Node Value: %s..... Does not match any Nodes within the SLL", value);
        System.out.println(anwserB);
        return anwserB;
    }
}