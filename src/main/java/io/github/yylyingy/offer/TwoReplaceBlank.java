package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/4/29 13:20
 */
//https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
class TwoReplaceBlank {
    public static void main(String[] args) {
        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
    }
    public static String replaceSpace(StringBuffer str) {
        String src = "%20";
        String blank = " ";
        int srcLen = src.length();
        int index = 0;
        while (index < str.length()) {
            if (blank.equals(str.substring(index,index + 1))) {
                str.replace(index,index + 1,src);
                index += srcLen;
            } else {
                index ++;
            }
        }
        return str.toString();
    }

}
