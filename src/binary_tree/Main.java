package binary_tree;

public class Main {
    public static void main(String[] args) {
        Tree tree =  new Tree();
        tree.insert(10);
        tree.insert(11);
        tree.insert(12);
        tree.insert(13);
        tree.insert(14);
        tree.insert(15);

        System.out.println(tree);
        boolean b = tree.find(14);
        System.out.println(b);
    }
}
