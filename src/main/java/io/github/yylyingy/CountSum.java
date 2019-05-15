package io.github.yylyingy;

import java.util.HashMap;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/15 21:35
 */

//计算数组里面有多少对数之和等于指定的数，数组元素可以相同，组成过一对的index不能再次组对
class CountSum {
    public static void main(String[] args) {
//        int[] items = {1, 5, 1, 1, 99, 1, 99, 99,99};
//        {1,1,99}
//        {1,1,99,99}
        int[] items ={5,8,1,9,10,99,2,3,98,98};
        System.out.println(countSum(items, 100));

    }

    static int countSum(int[] items, int sum) {
        //key item元素，value 元素的出现的次数
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < items.length; i++) {
            int tmp = sum - items[i];
            if (hashMap.containsKey(tmp)) {
                hashMap.replace(tmp, hashMap.get(tmp) + 1);
            } else {
                //这里所有不同元素都会被put进来
                hashMap.put(tmp, 1);
            }
            //只有一个数时继续
            if (i == 0) {
                continue;
            }
            Integer integer = hashMap.get(items[i]);
            if ((integer) != null) {
                    //删除一对相加等于sum的两个数
                    removeOrMinus(hashMap,items[i],integer);
                    removeOrMinus(hashMap,sum - items[i],integer);
                    count++;
            }
        }
        return count;
    }


    static void removeOrMinus(HashMap<Integer, Integer> hashMap, Integer key, Integer value) {
        if (value != null) {
            if (!value.equals(1)) {
                hashMap.replace(key, value - 1);
            } else {
                hashMap.remove(key);
            }
        }
    }
}
