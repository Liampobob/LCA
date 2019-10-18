import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class LCATest {

    @org.junit.Test
    public void testBinaryLowestCommonAncestor() {
        Node head = new Node(1);
        head.add(new Node(2));
        head.get(0).add(new Node(4));
        head.get(0).get(0).add(new Node(6));
        head.add(new Node(3));
        head.get(1).add(new Node(5));
        head.get(1).get(0).add(new Node(7));
        head.get(1).get(0).add(new Node(8));

        assertEquals(1, LCA.lowestCommonAncestor(head, 2, 3));
        assertEquals(1, LCA.lowestCommonAncestor(head, 5, 4));
        assertEquals(1, LCA.lowestCommonAncestor(head, 8, 6));
        assertEquals(2, LCA.lowestCommonAncestor(head, 2, 4));
        assertEquals(5, LCA.lowestCommonAncestor(head, 7, 8));
        assertEquals(7, LCA.lowestCommonAncestor(head, 7, 7));

    }

    @org.junit.Test
    public void testEdgeCasesBinaryLowestCommonAncestor(){
        Node head = new Node(1);
        head.add(new Node(2));
        head.get(0).add(new Node(4));
        head.get(0).get(0).add(new Node(6));
        head.add(new Node(3));
        head.get(1).add(new Node(5));
        head.get(1).get(0).add(new Node(7));
        head.get(1).get(0).add(new Node(8));
        //edge cases
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 12, 6));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, 0));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(null, 1, 2));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, Integer.MIN_VALUE));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, Integer.MAX_VALUE));

    }

    @org.junit.Test
    public void testDirectedLowestCommonAncestor() {
        Node head = new Node(1);
        head.add(new Node(2));
        head.get(0).add(new Node(4));
        head.get(0).get(0).add(new Node(6));
        head.add(new Node(3));
        head.get(1).add(new Node(5));
        head.get(1).get(0).add(new Node(7));
        head.get(1).get(0).add(new Node(8));
        head.add(new Node(9));
        head.get(2).add(new Node(10));
        head.get(2).get(0).add(new Node(12));
        head.get(2).get(0).add(new Node(11));

        assertEquals(1, LCA.lowestCommonAncestor(head, 2, 3));
        assertEquals(1, LCA.lowestCommonAncestor(head, 6, 11));
        assertEquals(1, LCA.lowestCommonAncestor(head, 8, 9));
        assertEquals(2, LCA.lowestCommonAncestor(head, 2, 4));
        assertEquals(5, LCA.lowestCommonAncestor(head, 7, 8));
        assertEquals(7, LCA.lowestCommonAncestor(head, 7, 7));

    }

    @org.junit.Test
    public void testEdgeCasesDirectedLowestCommonAncestor(){
        Node head = new Node(1);
        head.add(new Node(2));
        head.get(0).add(new Node(4));
        head.get(0).get(0).add(new Node(6));
        head.add(new Node(3));
        head.get(1).add(new Node(5));
        head.get(1).get(0).add(new Node(7));
        head.get(1).get(0).add(new Node(8));
        head.add(new Node(9));
        head.get(2).add(new Node(10));
        head.get(2).get(0).add(new Node(12));
        head.get(2).get(0).add(new Node(11));

        //edge cases
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 15, 6));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, 0));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(null, 1, 2));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, Integer.MIN_VALUE));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, Integer.MAX_VALUE));

    }
}
