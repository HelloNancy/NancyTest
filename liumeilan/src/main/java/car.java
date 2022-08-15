public class car {
    //成员变量,定于car这个类的属性
    String color;
    int speed;
    int seat=5;
    //成员方法
    public void run(){
        System.out.println("车可以跑");
    }
    public static void main(String[] args) {
        car c =new car();//创建对象,创建了一辆车c，后面想用这辆车，就需要使用c来访问
        c.run();//调用方法
        c.color="黑色";
        c.speed=120;
        System.out.println(c.color);
        System.out.println(c.speed);
        System.out.println(c.seat);
        car c2=new car();
        c2.color="红色";
        c2.speed=150;
        System.out.println(c2.color);
        System.out.println(c2.speed);
        System.out.println(c2.seat);
    }
}
