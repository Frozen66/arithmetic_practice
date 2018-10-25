import java.util.HashSet;
import java.util.Scanner;

public class HashSet_kitchen {

    public static void main(String[] args){
        Scanner text =new Scanner(System.in);
        HashSet<String> peiqi=new HashSet<String>();

        /*消灭重复的字符串通过使用哈希集合   */
        while(text.hasNext()){
      /*
      * hasNext()是Scanner类的一个方法，判断是否有输入，有输入项，a .hasNext()为true，
      * 没有输入项，a .hasNext()为false。
      *
      * */

            String str = text.nextLine();
            //next（）方法才将其后输入的空格键、Tab键或Enter键等视为分隔符或结束符。
            String arr[] = str.split(" ");
            /*
            * 例如：String a[]=str.split(“,”);//定义一个字符串数组
            * 比如 111,222,333那么a[0]=111 a[1]=222 a[2]=333
            * 注意本题必须有一个空格，手动敲出来的 空格哦！！！！才有效！！！
            * */
            //nextLine（）方法的结束符只是Enter键，即nextLine（）方法返回的是Enter键之前的所有字符，它是可以得到带空格的字符串的。
           for(String a:arr){
               peiqi.add(a);
           }

           /*
           * for循环在这有两种方法可以简化也可以用！
           * for(int i=0; i<arr.length; i++){
           *      peiqi.add(arr[i]);
           * }
           * */


        }

        System.out.println(peiqi.size());

        peiqi.clear();
        /*
        * 因为hasNext()方法是一直等待输入的，我用的工具是IDEA，采用快捷键ctrl+d结束输入，所以显示^D。
        * */

    }
}
