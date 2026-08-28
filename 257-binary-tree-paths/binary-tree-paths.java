class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        Stack<String> pathStack = new Stack<>();
        stack.push(root);
        pathStack.push(String.valueOf(root.val));
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            String path = pathStack.pop();
            if (node.left == null && node.right == null) {
                res.add(path);
            }
            if (node.right != null) {
                stack.push(node.right);
                pathStack.push(path + "->" + node.right.val);
            }
            if (node.left != null) {
                stack.push(node.left);
                pathStack.push(path + "->" + node.left.val);
            }
        }
        return res;
    }
}
