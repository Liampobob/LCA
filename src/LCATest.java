import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LCATest {

    @org.junit.Test
    public void testBinaryLowestCommonAncestor() {
        Node head = new Node(1, new ArrayList<Node>());
        head.nodes.add(new Node(2, new ArrayList<Node>()));
        head.nodes.get(0).nodes.add(new Node(4, new ArrayList<Node>()));
        head.nodes.get(0).nodes.get(0).nodes.add(new Node(8, null));
        head.nodes.add(new Node(3, new ArrayList<Node>()));
        head.nodes.get(1).nodes.add(new Node(5, new ArrayList<Node>()));
        head.nodes.get(1).nodes.get(0).nodes.add(new Node(7, null));
        head.nodes.get(1).nodes.get(0).nodes.add(new Node(8, null));

        assertEquals(1, LCA.lowestCommonAncestor(head, 2, 3));
        assertEquals(1, LCA.lowestCommonAncestor(head, 5, 4));
        assertEquals(1, LCA.lowestCommonAncestor(head, 8, 6));
        assertEquals(2, LCA.lowestCommonAncestor(head, 2, 4));
        assertEquals(5, LCA.lowestCommonAncestor(head, 7, 8));
        assertEquals(7, LCA.lowestCommonAncestor(head, 7, 7));

    }

    @org.junit.Test
    public void testEdgeCasesBinaryLowestCommonAncestor(){
        Node head = new Node(1, new ArrayList<Node>());
        head.nodes.add(new Node(2, new ArrayList<Node>()));
        head.nodes.get(0).nodes.add(new Node(4, new ArrayList<Node>()));
        head.nodes.get(0).nodes.get(0).nodes.add(new Node(8, null));
        head.nodes.add(new Node(3, new ArrayList<Node>()));
        head.nodes.get(1).nodes.add(new Node(5, new ArrayList<Node>()));
        head.nodes.get(1).nodes.get(0).nodes.add(new Node(7, null));
        head.nodes.get(1).nodes.get(0).nodes.add(new Node(8, null));

        //edge cases
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 12, 6));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, 0));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(null, 1, 2));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, Integer.MIN_VALUE));
    }
}
