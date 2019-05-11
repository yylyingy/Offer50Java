package io.github.yylyingy;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/12 0:38
 */

class PowerOfTwo {
    public static void main(String[] args) {

    }

    /**
     * 二进制下2的幂只有一位为1
     * @param val
     * @return
     */
    public boolean isPowerOfTwo(int val) {
        if(val <=0) {
            return false;
        }
        return (val & 1) == 0;
    }
}
