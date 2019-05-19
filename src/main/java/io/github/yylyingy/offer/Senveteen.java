package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/19 23:48
 */
//https://www.nowcoder.com/practice/6e196c44c7004d15b1610b9afca8bd88?tpId=13&tqId=11170&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//    输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
class Senveteen {
    public static void main(String[] args) {

    }

    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
		if(root1 == null || root2 == null) {
			return false;
		}
		return traserve(root1,root2);
    }
	
	public static boolean traserve(TreeNode root1,TreeNode root2) {
		boolean result = false;
		if(root1.val == root2.val) {
			result =  isSubTree(root1,root2);
			if(result) {
				return true;
			}
		}
		if(root1.left != null) {
			return traserve(root1.left,root2);
		}
		if(root1.right != null) {
            return traserve(root1.right,root2);
		}
		return result;
	}
	
	public static boolean isSubTree(TreeNode root1,TreeNode root2) {
        if(root2==null) return true;
        if(root1==null && root2!=null) return false;
        if(root1.val==root2.val){
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }else{
            return false;
        }
			
	}

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
