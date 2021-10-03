package binary_tree;

public class Tree {
    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", leftChild=" + leftChild +
                    ", rightChild=" + rightChild +
                    '}';
        }
    }

    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
        } else {
            var current = root;
            while (true) {
                if (value < current.value) {
                    if (current.leftChild == null) {
                        current.leftChild = new Node(value);
                        break;
                    }
                    current = current.leftChild;
                } else {
                    if (current.rightChild == null) {
                        current.rightChild = new Node(value);
                        break;
                    }
                    current = current.rightChild;
                }
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }
}
