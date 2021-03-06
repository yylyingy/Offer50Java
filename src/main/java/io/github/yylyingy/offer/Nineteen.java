package io.github.yylyingy.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/20 23:12
 */
//https://www.nowcoder.com/practice/9b4c81a02cd34f76be2659fa0d54342a?tpId=13&tqId=11172&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//    输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入
//    如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
//    则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
class Nineteen {
    public static void main(String[] args) {
        int [][] ints = {
                {1  ,2 ,3 ,4},
                {5  ,6 ,7 ,8},
                {9 ,10,11,12},
                {13,14,15,16}
        };
        List<Integer> list = printMatrix(ints);
        System.out.println(list);
    }

    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;

        // 输入的二维数组非法，返回空的数组
        if (row == 0 || col == 0)  return res;

        // 定义四个关键变量，表示左上和右下的打印范围
        int left = 0, top = 0, right = col - 1, bottom = row - 1;
        while (left <= right && top <= bottom)
        {
            // left to right
            for (int i = left; i <= right; ++i)  res.add(matrix[top][i]);
            // top to bottom
            for (int i = top + 1; i <= bottom; ++i)  res.add(matrix[i][right]);
            // right to left
            if (top != bottom)
                for (int i = right - 1; i >= left; --i)  res.add(matrix[bottom][i]);
            // bottom to top
            if (left != right)
                for (int i = bottom - 1; i > top; --i)  res.add(matrix[i][left]);
            left++;top++;right--;bottom--;
        }
        return res;

    }
}