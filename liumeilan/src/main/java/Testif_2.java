import java.util.Scanner;
public class Testif_2 {
    public static void main(String[] args) {
        System.out.println("你存了多少钱");
        //创建扫描器
        Scanner sc=new Scanner(System.in);
        //获取用户输入
        double money= sc.nextDouble();
        if(money>1000){
            System.out.println("可以去玩手机了");
        } else {
            System.out.println("需要攒钱了");
        }
    }
}
