package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/8 0:35
 */
//https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
// 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
//n<=39
class Seventh {
    public static void main(String[] args) {
        System.out.println(fab(6));
        System.out.println(f(6));
    }

    //递归
    public static int fab(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fab(n - 1) + fab(n - 2);
    }

    //非递归
    static int f(int n) {
        if (n < 0) {
            return -1;
        }
        int behindOfOne = 1;
        int behindOfTwo = 1;
        int current = 0;

        if (n == 0 || n == 1) {
            return 1;
        } else if (n == 2) {
            return behindOfOne + behindOfTwo;
        } else {
            for (int i = 2; i < n; i++) {
                current = behindOfOne + behindOfTwo;
                behindOfOne = behindOfTwo;
                behindOfTwo = current;
            }
            return current;
        }
    }
}
