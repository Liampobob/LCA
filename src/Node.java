public class Node {
    int name;
    Node left;
    Node right;

    public Node(int name, Node left, Node right){
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public Node(int name){
        this.name = name;
        this.left = null;
        this.right = null;
    }
}
