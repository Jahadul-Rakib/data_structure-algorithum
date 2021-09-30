package linked_list;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addData(10);
        linkedList.addData(12);
        linkedList.addData(13);
        linkedList.addData(109);

        System.out.println(Arrays.toString(linkedList.getNodes()));
        System.out.println(linkedList.isContain(10));
    }
}
