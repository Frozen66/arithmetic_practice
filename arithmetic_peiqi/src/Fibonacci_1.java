import java.util.Scanner;

/*
* Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，
* 在Fibonacci数列中的数我们称为Fibonacci数。
* 给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，
* 现在给你一个数N求最少需要多少步可以变为Fibonacci数。
* throws IOException
* BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
* String input = null;
* while ((input = bf.readLine()) != null) {
* int n = Integer.valueOf(input);
* 这一段不是太懂，缓冲，彷佛不加也可以运行出来！！！只是速率提高了！！！
*
* */
public class Fibonacci_1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int a=0,b=1,c;
        while(true){

            c=a+b;
            a=b;
            b=c;
            if(c>n)
                break;
        }
        /*注意要考虑到距离相等的时候！！！*/
        if((b-n)>=(n-a)){
            System.out.println(n-a);
        }
        if((b-n)<(n-a)){
            System.out.println(b-n);
        }
        /*
        * 简化 为三目表达式
        * System.out.println((b-n):(n-a)?(n-a):(b-n))
        * */
    }
}
