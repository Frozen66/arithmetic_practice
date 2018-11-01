import java.util.Scanner;

public class plalindrome_hw {
    /*
    * java中substring()方法
    * substring(int beginIndex) 返回从起始位置（beginIndex）至字符串末尾的字符串
    * 返回从起始位置（beginIndex）到目标位置（endIndex）之间的字符串，但不包含目标位置（endIndex）的字符
    * */
    public static void main(String[] args){
        Scanner text=new Scanner(System.in);
        String a=text.nextLine();
        String b=text.nextLine();
        int n=0;
        int i=a.length();
        for(int j=0;j<=i;j++){
            /*length()从零开始,substring是从0开始索引A = “aba”，B = “b”。2个*/
            String str=a.substring(0,j)+b+a.substring(j);
            String str2=new StringBuffer(str).reverse().toString();/*回文正着反着是相同的*/
     /*
     * 可拼接的字符串对象，因为String对象是不可以改变的，
     * 所以如果需要创建动态拼接的字符串，使用StringBuffer效率较高，最后使用toString()方法转换成String
     * 其余的和string一样功能只是新建的时候需要：
     * StringBuffer ab=new StringBuffer();
     *
     * */
     if(str.equals(str2)){/*equals比较的是str1和str2的值，而==比较的是str1和str2这两个引用在java中的内存地址。*/
         n++;
     }
        }
        System.out.println(n);
        String s="hahah";
        System.out.println(s.length());

    }
}
