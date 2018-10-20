import java.util.Scanner;
/*
*有一片1000*1000的草地，小易初始站在(1,1)(最左上角的位置)。
* 小易在每一秒会横向或者纵向移动到相邻的草地上吃草(小易不会走出边界)。
* 大反派超超想去捕捉可爱的小易，他手里有n个陷阱。第i个陷阱被安置在横坐标为xi ，
* 纵坐标为yi 的位置上，小易一旦走入一个陷阱，将会被超超捕捉。
* 你为了去解救小易，需要知道小易最少多少秒可能会走入一个陷阱，从而提前解救小易。
*
* 因为一开始是在（1，1）开始的所以需要减2  即是最短的距离，时间；横纵走的最短时间！！！
* 输入
* 3
* 4 6 8
* 1 2 1
* 输出
* 3
* */
public class PersonRescue {

    public static void main(String[] args) {

        Scanner n=new Scanner(System.in);
        int min=10000;
        int num=n.nextInt();
        /*定义两个一维数组分别表示陷阱的横纵坐标*/
        int [] row=new int[num];
        int [] column=new int[num];
        for (int i=0;i<num;i++)
        {
            row[i]=n.nextInt();
        }
        for (int j=0;j<num;j++)
        {
            column[j]=n.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            int b=row[i]+column[i]-2;
           if(b<min)
               min=b;
        }
        System.out.println(min);
    }
}
