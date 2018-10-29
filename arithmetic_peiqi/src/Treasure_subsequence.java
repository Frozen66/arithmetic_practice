import java.util.Scanner;


/*
* 藏宝盒，藏宝盒上有一个机关，机关每次会显示两个字符串 s 和 t，
* 根据古老的传说，牛牛需要每次都回答 t 是否是 s 的子序列。
* 注意，子序列不要求在原字符串中是连续的，
* 例如串 abc，它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种。
*每个测试用例包含两行长度不超过 10 的不包含空格的可见 ASCII 字符串。
* 输入：   x.nowcoder.com
*         ooo
* 输出：   Yes
* */
public class Treasure_subsequence {
    public  static void main (String[] args ){
        Scanner text=new Scanner(System.in);
        while(text.hasNext()){
        char[] a=text.next().toCharArray();
        char[] b=text.next().toCharArray();
        /*
        * toCharArray()作用：将字符串转换为字符数组。
        * String a = "abcd"; char[] b = a.toCharArray(); 这个b保存的信息就是['a','b','c','d']。
        * */

        int i=0,j=0;
        while(i<a.length&&j<b.length){

                if(a[i]==b[j]) {

                    i++;
                    j++;
                }
                else
                    i++;
                /*
                *二者相同时，则需要第二个字符串下标和第一个字符串下标同时加一
                 *  不相同时，在第一个下标下边加1 ，，仿照kmp算法匹配
                * */

        }
        if (j==b.length){
            System.out.println("yes!");
        }
        else System.out.println("no!");}
    }
}
