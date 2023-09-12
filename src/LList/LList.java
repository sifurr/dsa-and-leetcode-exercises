package LList;

public class LList {
    private Node head;
    private Node tail;
    private int length;


    class Node {
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
     }

    LList(int value)
    {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node temp = new Node(value);

        if(length == 0){
            head = temp;
            tail = temp;
        }

        tail.next = temp;
        tail = temp;
        length++;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next; // temp.next is pointing another Node
        }
    }

    public void getHead() {
        System.out.println(head.value);
    }

    public void getTail() {
        System.out.println(tail.value);
    }

    public void getLength() {
        System.out.println(length);
    }
}
