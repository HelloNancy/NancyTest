public class Testconvert {
    public static void main(String[] args) {
        int a=10;
        long b =a; // int转成long，
        System.out.println(b);
        long c=10000;
        int i=(int)c;//long转成int
        System.out.println(i);
        byte by=10;
        byte bz=20;
        int bs=by+bz;//byte先转成int然后再计算
        System.out.println(bs);

        short s1=1;
        short s2=(short)(s1+1);//把s1+1强制转成short；s1+1，计算的结果是int类型，把int复制给short，会报错
        System.out.println(s2);
    }
}
