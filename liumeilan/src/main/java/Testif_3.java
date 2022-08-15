import java.util.Scanner;

public class Testif_3 {
    public static void main(String[] args) {
        System.out.println("你存了多少钱");
        //创建扫描器
        Scanner sc=new Scanner(System.in);
        //获取用户输入
        double money = sc.nextDouble();
        if (money>5000){
            System.out.println("可以去旅游");
        } else if (money>3000){
            System.out.println("你可以换新手机");
        } else if (money>500){
            System.out.println("你要去挣钱了");
        }

    }
}
