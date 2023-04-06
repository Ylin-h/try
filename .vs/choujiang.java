
import java.util.Scanner;
public class choujiang {
    public static void main(String[] arg) {

        int sum=0;
        int a=0,b=0,c=0;
        try (Scanner myScanner = new Scanner(System.in)) {
            sum=myScanner.nextInt();
        }
        a=(int)(Math.random()*100+1);
        do{
            b=(int)(Math.random()*100+1);
        }while(b!=a);
        do{
            c=(int)(Math.random()*100+1);
        }while(c!=a&&c!=b);
            if(a==sum)
            System.out.println("number one");
            else if(b==sum)
            System.out.println("number two");
            else if(c==sum)
            System.out.println("number three");
            else 
            System.out.println("no lottery!");
    }
}
