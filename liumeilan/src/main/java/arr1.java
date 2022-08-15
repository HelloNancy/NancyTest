public class arr1 {
    public static void main(String[] args) {
        int[]arr={2,88,7,10,84,10};
        int max=arr[0];//初始化最大值是第0个位置的数
        for(int i=1;i<arr.length;i++){//从第一个位置开始比较
            if(arr[i]>max){//如果数组中的数据大于max,那就把这个值赋值给maxNNNNN
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
//找出数组中的最大值
