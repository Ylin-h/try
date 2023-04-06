import java.util.Scanner;
public class text {
  public static int binarySearch(int[] arr, int input) {//折半查找（二分)
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid = (left + right) / 2;
        if (arr[mid] == input) {
            return mid;
        } else if (arr[mid] < input) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1;
}
    public static void main(String[] args){
      int t=0;int arr[]={7,8,5,3,9,12,0};
        for(int i=0;i<arr.length-1;i++){//冒泡排序
          for(int j=i;j<arr.length;j++)
          {
            if(arr[i]>arr[j])
            {
            t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
          }
        }
      }
     int len=arr.length;
      System.out.print("冒泡排序后的数组：");
      for(int i=0;i<len;i++){
        System.out.print(arr[i]);
        System.out.print(' ');
      
      }
      System.out.println();
      //折半查找：输入一个数，查找他是否存在这个数组中
      Scanner myScanner=new Scanner(System.in);
      int input=myScanner.nextInt();
      int target = input;
      int index = binarySearch(arr, target);
      if (index != -1) {
          System.out.println(target + " 在数组中的下标为：" + index);
      }
       else {
          System.out.println(target + " 不在数组中");
      }
 myScanner.close();

}
}
