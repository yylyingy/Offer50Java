package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/12 0:21
 */
//https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//    给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
class Twelve {
    public static void main(String[] args) {
        System.out.println(Power(2,-3));
    }

    public static double Power(double base, int exponent) {
        double result = 1;
        int pow = exponent;
        if (exponent < 0) {
            pow = exponent * -1;
        }
        for (int i = 0;i < pow;i ++) {
            result = base * result;
        }
        //一个数的负次幂=1除以这个数的正次幂
        if (exponent < 0) {
            result = 1 / result;
        }
        return result;
    }
}
