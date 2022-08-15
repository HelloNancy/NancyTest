import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);//创建扫描器
       System.out.println("输入a和b");
       int a= sc.nextInt();//获取整数
        int b= sc.nextInt();
        System.out.println("a+b="+(a+b));
        double d=sc.nextDouble();//获取小数
        System.out.println(d);
        String st =sc.nextLine();//获取字符串
        System.out.println(st);


    }
}
