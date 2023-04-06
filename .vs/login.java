import java.util.Scanner;
public class login {
    public static void main(String[] args){
       String s1="nihao";
       String s2="123456";
        Scanner myScanner= new Scanner(System.in);
        int n=3;
        while(n!=0)
        {
            n--;
        String user=myScanner.next();
        String psw=myScanner.next();
        if(user.equals(s1)&&psw.equals(s2))
        {
        System.out.println("欢迎");
        break;
        }
        }
        if(n==0)
        System.out.println("error");
        myScanner.close();
    }
}
