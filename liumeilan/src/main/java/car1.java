public class car1 {
    String color;
    int speed;
    int seat;
    public void fly(String color){
        System.out.println(this.color+"颜色的车会飞"+color+"颜色的云彩里");
    }

    public static void main(String[] args) {
        car1 che=new car1();
        che.color="黑色";
        che.fly("蓝色");

    }
}
