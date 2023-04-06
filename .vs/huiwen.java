import java.util.Scanner;

public class huiwen {
    public static void main(String[] arg) {
        Scanner myScanner = new Scanner(System.in);
        String a = myScanner.next();
        int len = a.length();
        boolean flag = false ;              
        for(int i=0,j=len-1;i<len/2&&j>len/2;i++,j--)
        {   
                if(a.charAt(i)==a.charAt(j))
            flag=true;
            else
            flag=false;
        }
 if(flag)
 System.out.println("是回文串");
 else
 System.out.println("不是回文串");
 myScanner.close();

    }
}
