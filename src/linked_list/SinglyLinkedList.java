package linked_list;

public class SinglyLinkedList {
    private int size = 0;
    private Node firstNode;
    private Node lastNode;

    public void addData(int v) {
        var node = new Node(v);
        if (firstNode == null)
            firstNode = lastNode = node;
        else {
            lastNode.setNextNode(node);
            lastNode = node;
        }
        size++;
    }

    public int[] getNodes() {
        int[] arr = new int[size];
        var current = firstNode;
        int index = 0;
        while (current != null) {
            arr[index] = current.getValue();
            current = current.getNextNode();
            index++;
        }
        return arr;
    }

    public boolean isContain(int data) {
        var current = firstNode;
        while (current != null) {
            if (current.getValue() == data) {
                return true;
            }
            current = current.getNextNode();

        }
        return false;
    }

    public void removeFirst() {
        if (firstNode == null)
            return;
        firstNode = firstNode.getNextNode();
    }
}
