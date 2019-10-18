import java.util.List;

public class Node {
    int name;
    List<Node> nodes;

    public Node(int name, List<Node> nodes){
        this.name = name;
        this.nodes = nodes;
    }
}