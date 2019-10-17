import static junit.framework.TestCase.assertEquals;

public class LCATest {

    Node head = new Node(1,
            new Node(2,
                    new Node (4,
                            new Node(6), null), null),
            new Node(3, new Node(5, new Node(7), new Node(8)), null));

    @org.junit.Test
    public void testLowestCommonAncestor() {
        assertEquals(5, LCA.lowestCommonAncestor(head, 7, 8));
        assertEquals(1, LCA.lowestCommonAncestor(head, 2, 3));
        assertEquals(7, LCA.lowestCommonAncestor(head, 7, 7));


        //edge cases
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 12, 6));
        assertEquals(Integer.MIN_VALUE, LCA.lowestCommonAncestor(head, 6, 0));
    }
}
