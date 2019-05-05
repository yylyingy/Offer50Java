package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>https://www.nowcoder.com/practice/abc3fe2ce8e146608e868a70efebf62e?tpId=13&tqId=11154&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
 * <br> Author:      Yangyl
 * <br> Date:        2019/4/29 13:04
 */

/**
 * 题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
class FirstTwoDimen {
    public static void main(String[] args) {
        int[][] array = {
                {1,1,2},
                {2,2,5},
                {3,3,9}
        };
        System.out.println(array.length);
        System.out.println(array[2].length);
        System.out.println(search(array,8));
    }

    static boolean search(int [][] array,int src) {
        int w = array[0].length;
        int h = array.length;
        for (int i = 0;i < w ;i ++) {
            for (int j = 0;j < h ;j ++) {
                if (array[i][j] == src) {
                    return true;
                }
            }
        }
        return false;
    }
}
