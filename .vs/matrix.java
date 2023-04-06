public class matrix {
    public static void main(String[] arg) {
        
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        int sum=0;
        for(int i=0,j=0;i<3;i++,j++)
        {
           sum+=a[i][j];
        }
        for(int i=0,j=2;i<3;i++,j--)
        {
            if(i!=1&&j!=1)
            sum+=a[i][j];
        }
        System.out.println(sum);
    }
}
