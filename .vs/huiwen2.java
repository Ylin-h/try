import java.util.Scanner;

public class huiwen2 {
    public static void main(String[] arg) {
        Scanner myScanner = new Scanner(System.in);
        String a = myScanner.next();
        StringBuffer s=new StringBuffer(a);
        s.reverse();
 if(a.equals(s.toString()))
 System.out.println("是回文串");
 else
 System.out.println("不是回文串");
 myScanner.close();


    }
}