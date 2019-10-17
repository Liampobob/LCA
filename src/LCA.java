import java.util.ArrayList;
import java.util.List;

public class LCA {
    public static int lowestCommonAncestor(Node head, int a, int b) {
        List<Integer> path1 = new ArrayList<>();
        List<Integer> path2 = new ArrayList<>();

        if (!findNodePath(head, a, path1) || !findNodePath(head, b, path2)) {
            return Integer.MIN_VALUE;
        }
        int i = 0;
        while(i < path1.size() && i < path2.size()) {

            if (!path1.get(i).equals(path2.get(i))) { break; }

            i++;
        }

        return path1.get(i - 1);
    }

    private static boolean findNodePath(Node root, int n, List<Integer> path) {
        if (root == null) { return false; }

        path.add(root.name);

        if (root.name == n) { return true; }

        if (findNodePath(root.left, n, path)) { return true; }

        if (findNodePath(root.right, n, path)) { return true; }

        path.remove(path.size() - 1);

        return false;
    }
}