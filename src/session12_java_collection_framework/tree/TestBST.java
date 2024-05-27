package session12_java_collection_framework.tree;

public class TestBST {
    public static void main(String[] args) {
        //create a BST
        BST<Integer> tree = new BST<>();
        tree.insert(60);
        tree.insert(55);
        tree.insert(45);
        tree.insert(57);
        tree.insert(59);
        tree.insert(100);
        tree.insert(67);
        tree.insert(101);
        tree.insert(107);
        //traverse tree
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println("Postorder (sorted): ");
        tree.postorder();
        System.out.println("The number of nodes is: " + tree.getSize());
        System.out.println("Preorder (sorted): ");
        tree.preorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
