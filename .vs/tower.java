public class tower {
    public static void main(String[] arg) {
        for(int i=9;i>=1;i--)
        {
            for(int j=1;j<i;j++)
            {
            System.out.print(' ');
            }
            for(int k=1;k<=9+1-i;k++)
            {
            System.out.print(k);
            }
            for(int m=9-i;m>=1;m--)
            {
            System.out.print(m);
            }
            System.out.println(' ');
            

        }
    }
}
