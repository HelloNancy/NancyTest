import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个三位数");
        int a = sc.nextInt();
        if (a > 100 && a < 999) {
            //获取每位数
            int bai = a / 100;
            int shi = a % 100 / 10;
            int ge = a % 100 % 10;
            int sum = bai * bai * bai + shi * shi * shi + ge * ge * ge;
            if (a == sum) {
                System.out.println("是水仙花数");

            } else {
                System.out.println("不是的");
            }
        } else {
            System.out.println("不是水仙花数");
        }
    }
}
