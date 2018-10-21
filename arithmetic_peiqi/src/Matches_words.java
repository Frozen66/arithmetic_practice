import java.util.Scanner;
/*
*
* 1.单词每个字母都是大写字母
2.单词没有连续相等的字母
3.单词没有形如“xyxy”(这里的x，y指的都是字母，并且可以相同)这样的子序列，子序列可能不连续。
* */
public class Matches_words {
    public static void main(String[] args){
        Scanner text=new Scanner(System.in);
        String t=text.next();
        if(isAllUp(t) && isEqual(t) && isT(t))
            System.out.println("Likes");
        else
            System.out.println("Dislikes");

    }
    public static boolean isAllUp(String s){
        return s.matches("[A-Z]+");
    }
    public static boolean isEqual(String s){
        return !s.matches(".*(.)(\\1).*");
        /*
        * 和第一个字母相同的！！！
        * */
    }
    public static boolean isT(String s){
        return !s.matches(".*(.).*(.)(.*\\1)(.*\\2).*");
    }
}
