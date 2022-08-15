public class car2 {
    //成员变量
    String color;
    int speed;
    int seat=5;
    //成员方法
    public void run(){
        System.out.println("车可以跑");
        System.out.println(this.color);
    }
    public static void main(String[] args) {
        car2 c=new car2();
        c.color="红色";
        c.run();
        System.out.println(c.color);
//        car2 c1=new car2();
//        c1.color="绿色";
//        c1.run();
//        System.out.println(c1);

        // println(c.color);
    }

}



