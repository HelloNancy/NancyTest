public class Homework5 {
    /**
     *用来比较两个数的大小，返回大的
     * @param a 第一个数
     * @param b 第二个数
     * @return 比较大的数
     */
    public static int compare(int a,int b){
    if(a>b) {
        return a;
    }else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println(compare(33,100));

    }

}



