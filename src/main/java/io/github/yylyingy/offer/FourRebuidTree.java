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
        int []pre = {1,2,4,7,3,5,6,8};
        int []in =  {4,7,2,   1  ,5,3,8,6};
//        int []pre ={4,1,2,3};
//        int []in = {1,2,3,4};
        TreeNode treeNode = buildTree(pre,in);
        System.out.println();
    }
    public static TreeNode buildTree(int [] pre,int [] in) {
        return buildTree(0,in.length - 1,0,in.length -1,pre,in);
    }
   public static TreeNode buildTree(int startPre,int endPre,int startIn,int endIn, int [] pre,int [] in) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        //前序遍历中，第一个节点为root
       if (startPre >= in.length) {
           return null;
       }
        TreeNode root = new TreeNode(pre[startPre]);
        //相等时root的左右子节点都为空不用再遍历
        if (startPre == endPre||startIn==endIn) {
            return root;
        }
        //根据前序遍历找出的根节点算出该根节点在中序遍历中的index；
        int rootInIn = startIn;
        for (int i = startIn;i <= endIn && i < in.length;i ++) {
            if (root.val == in[i]) {
                //根节点在中序遍历中的位置
                rootInIn = i;
            }
        }
        //root根节点的左子树所有节点个数
        int leftTreeNodeCount = rootInIn - startIn;
        //在前序遍历数组中，currentStartPreIndex 到currentEndPreIndex之间的节点个数就是当前root的左子树节点个数
        int currentStartPreIndex = startPre + 1;
        int currentEndPreIndex   = startPre + leftTreeNodeCount;
                                                                        //中序遍历中左子树几点范围个数为rootInIn - 1 - startIn
        root.left = buildTree(currentStartPreIndex,currentEndPreIndex,startIn,rootInIn - 1,pre,in);
        //                              前序遍历当前root的右子树范围         中序遍历当前root的右子树范围
        root.right = buildTree(currentEndPreIndex + 1,endPre,rootInIn + 1,endIn,pre,in);
        return root;
   }



    public static class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode(int x) { val = x; }
   }

}
