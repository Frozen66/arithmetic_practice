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
     /*   String no=text.next();
        *//*Pattern q=Pattern.compile(".*(.)(\\1).*");*//*
        *//*
        * 这个是用来判断有没有a字符的!!!!(".*(a).*")
        * 这个用来判断是否含有相同的aa！！！   (".*(a)(\\1).*")
        * *//*
        Pattern q=Pattern.compile(".*(a)(\\1).*");
       *//* Pattern q=Pattern.compile("1[35]\\d{9}");*//*
        Matcher m1=q.matcher(no);
        boolean d=m1.matches();
        System.out.println(d);

        Pattern i=Pattern.compile("[0-9]{3}");
        String ni=text.next();
        Matcher m2=i.matcher(ni);
        boolean d1=m2.matches();
        System.out.println(d1);*/



        /*
        * \b 字符边界匹配，字符串最后是以空格结尾nerver （可以匹配到）而verb就不可以！！
        * \B 与上述正好相反。
        * \w 匹配任何字类字符，包括下划线。与"[A-Za-z0-9_]"等效
        * \W 与任何非单词字符匹配。与"[^A-Za-z0-9_]"等效。
        * ^ 正则开始符号
        * runoo+b，可以匹配 runoob、runooob、runoooooob 等，+ 号代表前面的字符必须至少出现一次（1次或多次）。
        * runoo*b，可以匹配 runob、runoob、runoooooob 等，* 号代表字符可以不出现，也可以出现一次或者多次（0次、或1次、或多次）。
        * colou?r 可以匹配 color 或者 colour，? 问号代表前面的字符最多只可以出现一次（0次、或1次）。
        * */

        Pattern pattern=Pattern.compile(".*(.)(.)(\\1)(\\2).*");/*表示ABAB这种的重复的！！但如果说是ABCABC呢！*/
        String say=text.next();
        Matcher M=pattern.matcher(say);
        boolean result=M.matches();
        System.out.println(result);

        /*那么这两种有什么区别呢？底下这个比较方便还好理解*/
       /*boolean result2= say.matches("[0-9]{3}");
       System.out.println(result2);*/
        boolean result2= say.matches(".*(.).*(.)(.*\\1)(.*\\2).*");/*适合ABCABC  三个及三个以上的*/
        System.out.println(result2);




    }
}
