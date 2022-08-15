import java.util.Scanner;

public class Testif_1 {
    public static void main(String[] args) {
        System.out.println("你存了多少钱");
        Scanner sc=new Scanner(System.in);
        //获取用户输入
        double money= sc.nextDouble();
        //计划存的钱
        double plan=10000;
        //如果存的钱大于计划，则打印完成计划
        if(money>plan) {
            System.out.println("完成计划");
        }
        System.out.println("存钱");


    }
}
