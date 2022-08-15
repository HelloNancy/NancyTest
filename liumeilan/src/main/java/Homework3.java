import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入脚的总数");
        int total= sc.nextInt();
        for(int a=0;a<=total/2;a++){//鸡的数量
            int b=total-a*2;//求兔子的脚
            if(b%4==0){
                System.out.println("有鸡"+a+"只，有兔子"+b/4);
            }



        }

    }

}

