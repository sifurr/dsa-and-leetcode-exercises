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

    public Node removeLast(){
        if (length == 0){
            return null;
        }
        Node temp = head;
        Node pre = head;
        while (temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        // if there is only one node then after decrementing we check again
        if (length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length==0){
            head = newNode;
            tail = newNode;
        }
        newNode.next= head;
        head = newNode;
        length++;
    }

    public Node removeFirst(){
        if (length==0){
            return null;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length==0){
            head=tail=null;
        }

        return temp;
    }

    public Node get(int index){
        if (index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp == null){
            return false;
        }
        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value){
        if (index < 0 || index > length){
            return false;
        }
        Node newNode = new Node(value);
        if (index == 0){
            prepend(value);
            return true;
        }
        if (index == length){
            append(value);
            return true;
        }
        Node previousNode = get(index - 1);
        Node nextNode = get(index);
        newNode.next = nextNode;
        previousNode.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index > length){
            return null;
        }
        if (index == 0){
            removeFirst();
        }
        if(index == length){
            removeLast();
        }
        Node previousNode = get(index - 1);
        Node temp = previousNode.next;
        previousNode.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next; // temp.next is pointing another Node
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println(length);
    }
}
