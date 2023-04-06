import java.util.Scanner;
class School{
    private double line;
    public School(double line){
        this.line=line;
    }
    public void setLine(double line)
    {
        this.line=line;
    }
    public double getLine(){
        return this.line;
    }
}
class Student0{
    private String name;
    private String id;
    private double total;
    private double sports;
    public Student0(String name,String id,double total,double sports)
    {
      this.name=name;
      this.id=id;
      this.total=total;
      this.sports=sports;
    }
    public double getTotal()
    {
        return this.total;
    }
    public double getSports()
    {
        return this.sports;
    }
    public void printInfo()
    {
        System.out.println("name:"+name+' '+"id:"+id+' '+"total:"+total+' '+"sports:"+ sports);
    }
}
 class Admission {
    public boolean isAdmitted(Student0 student, School school) {
        if (student.getTotal() > school.getLine() || (student.getSports() > 96 && student.getTotal() > 300)) {
            return true;
        } 
        else
        {
            return false;
        }
    }
}
public class studentEnroll {
    public static void main(String[] args) {
    Student0 student = new Student0("张三", "001", 280.0, 90.5);
    Scanner myScanner=new Scanner(System.in);
    System.out.print("设置录取分数线: ");
    double line=myScanner.nextDouble();
    School school=new School(line);//设置录取分数线
    Admission ad=new Admission();
        if (ad.isAdmitted(student, school))
            {
            student.printInfo();
            System.out.println("被录取");
            }
        else
            {
            student.printInfo();
            System.out.println("未被录取");
            }
    myScanner.close();
}
}
