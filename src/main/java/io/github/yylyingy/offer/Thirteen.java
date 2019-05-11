package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/12 0:43
 */
//https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//    输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
class Thirteen {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7};
        reOrderArray(array);
        System.out.println();
    }

    public static void reOrderArray(int [] array) {
        for(int i = 0;i < array.length;i ++) {
//            int tmp = array[i];
            //奇数，
            if (array[i] % 2 != 0) {
                for (int j = i,k = i;j >= 0;j --) {
                    //偶数
                   if (array[j] % 2 == 0) {
                       //记录奇数
                       int tmp = array[k];
                       //奇偶交换，k位置赋值偶数，j位置赋值奇数，结果就是奇数向前移动，偶数向后移动，
                       //当前k所对应的奇数与k对应的偶数之间不会有奇数
                       array[k] = array[j];
                       array[j] = tmp;
                       //下一轮k索引处还为奇数
                       k = j;
                   }
                }
            }
        }
    }

}
