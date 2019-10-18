import static junit.framework.TestCase.assertEquals;

public class NodeTest {

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
        head.add(new Node(9));
        head.get(2).add(new Node(10));
        head.get(2).get(0).add(new Node(12));
        head.get(2).get(0).add(new Node(11));

        assertEquals(1, head.name);
        assertEquals(2, head.get(0).name);
        assertEquals(3, head.get(1).name);
        assertEquals(4, head.get(0).get(0).name);
        assertEquals(5, head.get(1).get(0).name);
        assertEquals(6, head.get(0).get(0).get(0).name);
        assertEquals(7, head.get(1).get(0).get(0).name);
        assertEquals(8, head.get(1).get(0).get(1).name);
        assertEquals(9, head.get(2).name);
        assertEquals(10, head.get(2).get(0).name);
        assertEquals(11, head.get(2).get(0).get(1).name);
        assertEquals(12, head.get(2).get(0).get(0).name);


    }

}