import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
*哈希表的关键思想是使用哈希函数map keys to buckets。更具体，y = x％5
* 1.当我们插入一个新密钥时，哈希函数将决定应该分配密钥的哪个桶，密钥将存储在相应的桶中;
* 2.当我们想要搜索密钥时，哈希表将使用  same 哈希函数来查找相应的桶并仅在特定桶中搜索。
* 哈希函数将取决于（x键值）the range of key values和（y桶的索引）the number of buckets。
* */

/*
* java.lang包中的String类和java.util.regex包中的Pattern，
* Matcher类中都有matches()方法，都与正则表达式有关。
* */
public class Matches {
    public static  void main(String[] args){
        /*
        * 正则表达式matchs()方法
        * 1.String类的方法：
        * */
        boolean b ="ab".matches("[a-z]");
        System.out.println(b);
        /*
        * 2.Pattern类中的方法：
        * */
        boolean a= Pattern.matches("[a-z]{3}","abc");
        System.out.println(a);
        /*
        *3.Matcher类中的方法：
        *经常在验证邮箱的时候可以用到哦！
        * */
        Pattern p=Pattern.compile("[a-z]{3}");
        Matcher m=p.matcher("abc");
        boolean c=m.matches();
        System.out.println(c);
        /*
        * Text.matches("1[35]\\d{9}")
        *意思是匹配到以13或者15开头的11为电话号码；[]表示匹配到是3或者5；\\d{9}表示匹配数字9次
        *. 小数点可以匹配除了换行符（\n）以外的任意一个字符
        * String patter = "([0-1][0-9]|[2][0-3])(:)([0-5][0-9])"   24制小时时间，如13:16
        * https://blog.csdn.net/zhouhuakang/article/details/51397539(正则表达式)
        * 以下是输入一个电话号码检验是不是对的！
        *
        * */
        Scanner text=new Scanner(System.in);
        String no=text.next();
        /*Pattern q=Pattern.compile(".*(.)(\\1).*");*/
        /*
        * 这个是用来判断有没有a字符的!!!!(".*(a).*")
        * 这个用来判断是否含有相同的aa！！！   (".*(a)(\\1).*")
        * */
        Pattern q=Pattern.compile(".*(a)(\\1).*");
       /* Pattern q=Pattern.compile("1[35]\\d{9}");*/
        Matcher m1=q.matcher(no);
        boolean d=m1.matches();
        System.out.println(d);

    }
}
