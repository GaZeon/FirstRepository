
public class demo {
    //输出数组中出现次数大于2的元素的个数
    //输入：数组，数组长度
    //输出：出现次数大于2的元素个数
    //输入样例：
    //1 2 3 4 5 6 7 8 9 10
    //输出样例：
    //4

    public static int count(int[] a,int n){
        //定义一个变量count，初始值为0
        int count=0;
        //遍历数组a
        for(int i=0;i<n;i++){
            //获取数组a中的每一个元素
            int num=a[i];
            //定义一个变量num2，初始值为0
            int num2=0;
            //遍历数组a
            for(int j=0;j<n;j++){
                //如果数组a中的元素和num相等，num2加1
                if(a[j]==num){
                    num2++;
                }
            }
            //如果num2大于2，count加1
            if(num2>2){
                count++;
            }
        }
        //返回count
        return count;
    }
public static void main(String[] args) {
    //定义一个数组
    int[] a={1,2,3,4,5,6,7,8,9,10};
    //输出数组中出现次数大于2的元素的个数
    System.out.println(count(a,10));

}
}
