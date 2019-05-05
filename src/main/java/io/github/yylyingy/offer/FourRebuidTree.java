package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/4/29 13:48
 */
//https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tqId=11157&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
    //输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
class FourRebuidTree {
    public static void main(String[] args) {
//        前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}
//        int []pre = {1,2,4,7,3,5,6,8};
//        int []in =  {4,7,2,   1  ,5,3,8,6};
        int []pre ={4,1,2,3};
        int []in = {1,2,3,4};
        TreeNode treeNode = buildTree(pre,in);
//        new FourRebuidTree().constructFromPrePost(pre,in);
        System.out.println();
    }
    public static TreeNode buildTree(int [] pre,int [] in) {
        return buildTree(0,in.length,pre,in);
    }
   public static TreeNode buildTree(int leftStart,int end,
                                    int [] pre,int [] in) {
        if (leftStart == in.length || leftStart > end) {
            return null;
        }
        TreeNode root = new TreeNode(pre[leftStart]);
        if (leftStart == end) {
            return root;
        }
//        if (leftStart == end - 1) {
//            return root;
//        }
        int rootInIn = 0;
        for (int i = 0;i < end;i ++) {
            if (root.val == in[i]) {
                rootInIn = i;
                break;
            }
        }
        root.left = buildTree(leftStart + 1,rootInIn,pre,in);
        root.right = buildTree(leftStart + 1,end     ,pre,in);
        return root;
   }




    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

}
