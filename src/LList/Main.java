package LList;

public class Main {
    public static void main(String[] args) {
        LList myLinkedList = new LList(2);

        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);

        System.out.println(myLinkedList.remove(1).value);

        System.out.println();
        myLinkedList.printList();

    }
}
