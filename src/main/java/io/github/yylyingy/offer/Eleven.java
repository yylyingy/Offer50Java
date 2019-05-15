package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/11 1:38
 */
//https://www.nowcoder.com/practice/8ee967e43c2c4ec193b040ea7fbb10b8?tpId=13&tqId=11164&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
class Eleven {
    public static void main(String[] args) {
        System.out.println(-1 >>> 2);
        System.out.println(NumberOf1(-1));
    }

    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            //如果最右边的数为1，则与0000 0000 0000 0001想与后等于一
            if ((n & 1) == 1) {
                count++;
            }
            //算术右移一位,抹除最右边一位
            n = n >>> 1;
        }
        return count;
    }

}
