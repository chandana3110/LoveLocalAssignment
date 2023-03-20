import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;

    TreeNode(int t) {
        val = t;
    }
}
public class easy2SortedArrayToBST {
    public static void main(String [] args){
        // input test cases
        int [] nums = new int []{10,-3,0,5,9};
        List<Integer> result = levelOrderTraversal(sortedArrayToBST(nums));
        System.out.println(result);
    }
    public static TreeNode sortedArrayToBST(int [] nums){
        if(nums == null || nums.length == 0){
            return null;
        }
        return heightBalancedBST(nums,0,nums.length-1);
    }
    public static TreeNode heightBalancedBST(int []nums , int left , int right){
        if(left > right){
            return null;
        }
        int mid = left + (right-left)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left= heightBalancedBST(nums, left, mid-1);
        root.right= heightBalancedBST(nums, mid+1, right);
        return root;
    }
    public static ArrayList<Integer> levelOrderTraversal(TreeNode root){
        ArrayList<Integer> al = new ArrayList<>();
        if(root==null){
            return al;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                al.add(node.val);
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
        }
        return al;
    }
}
