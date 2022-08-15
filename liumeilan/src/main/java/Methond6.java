public class Methond6 {
    /**
     *
     * @param arr 接收的数组
     * @return  翻转后的数组
     */
    public static int[]a(int[]arr){
        //返回的是一个数组
        int[]b=new int[arr.length];
        int index=0;//b数组的下标
        for (int i=arr.length-1;i>=0;i--){
            b[index]=arr[i];
            index++;
        }
        return b;

    }

    public static void main(String[] args) {
        int[]x={2,5,9,0};
        int[]y=a(x);
        for (int i=0;i<x.length;i++){
            System.out.println(y[i]);
        }
    }

}

