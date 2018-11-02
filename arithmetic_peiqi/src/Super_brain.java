import java.util.Scanner;
import java.util.regex.Pattern;

/*
* n和m是两座城市，之间有好多火车站点，每个站点都有特别颜色的旗帜
* 如果由m向n运行的话途中车站相同，但方向不同
* 现在要求小明陆续说出的车站序列（说两次）的颜色是什么方向的
* 输入：
* 第一行为一个由小写拉丁字母构成的非空字符串，长度不超过10^5，表示N到M之间车站的颜色。
* 第二行为小B在第一次睡醒时看到的颜色序列
* 第三行为小B在第二次睡醒时看到的颜色序列。
* 输出：
* forward - 由N到M方向；
* backward -由M到N方向
* both - 两种方向都有可能；
* invalid - 不可能看到这样的颜色序列；
*
* */
public class Super_brain {
    public static void main(String[] args){
        Scanner text =new Scanner(System.in);
        String all=text.nextLine();
        String str1=text.nextLine();
        String str2=text.nextLine();
        String pattern=".*"+str1+".*"+str2;
        boolean m= Pattern.matches(pattern,all);
        String allReverse=new StringBuffer(all).reverse().toString();
        boolean m2=Pattern.matches(pattern,allReverse);
        if (m&m2){
            System.out.println("both");
        }
        if (!m&!m2){
            System.out.println("invalid");
        }
        if (m&&!(m&m2)){
            System.out.println("forward");
        }
        if(m2&&!(m&m2)){
            System.out.println("backward");
        }

    }


}
