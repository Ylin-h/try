
public class bubble {
      public static void main(String[] args) {
        int arr[]={23,4,32,67,42,42,41,32,15};
        int t=0;
        for(int i=0;i<arr.length-1;i++){
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
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
        System.out.print(' ');
      }
      }
}
