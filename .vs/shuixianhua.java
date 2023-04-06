
public class shuixianhua {
    public static void main(String[] args){
     int s1=0,s2=0,s3=0;
        for(int i=100;i<1000;i++)
        {
             s1=i%10;
             s2=i/100;
             s3=i/10%10;
            if(i==s1*s1*s1+s2*s2*s2+s3*s3*s3)
            {
           System.out.println(i);
        }
    }
    }
}
