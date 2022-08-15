import java.util.Scanner;

public class Homework2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入鸡的数量 ");
        int a= sc.nextInt();

        System.out.println("输入兔的数量 ");
        int b= sc.nextInt();
        int sum=2*a+4*b;
        System.out.println("一共有"+sum+"个脚");

    }

}
