import java.util.ArrayList;
import java.util.List;

public class Node {
    int name;
    List<Node> nodes;

    public Node(int name){
        this.name = name;
        this.nodes = new ArrayList<Node>();
    }

    public Node get(int i){
        return this.nodes.get(i);
    }

    public void add(Node n){
        this.nodes.add(n);
    }
}