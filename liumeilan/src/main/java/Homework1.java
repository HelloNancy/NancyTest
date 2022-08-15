import java.util.Random;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(100);//范围【0，99】的随机数
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
            System.out.println("输入一个数字a");
            int a = sc.nextInt();

            //判断
            if (a > n) {
                System.out.println("猜大了，继续");
            } else if (a < n) {
                System.out.println("猜小了，继续");
            } else {
                System.out.println("猜对了");
                flag=false;
            }
        }
    }

}
