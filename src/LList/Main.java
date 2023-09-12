package LList;

public class Main {
    public static void main(String[] args) {
        LList myLinkedList = new LList(2);
        myLinkedList.append(3);


        myLinkedList.prepend(1);
        myLinkedList.getHead();


        myLinkedList.printList();

    }
}
