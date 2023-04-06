import java.util.Scanner;

class Person {
     int id;
    String name;
    
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int classNumber;
    double score;
    
    public Student(int id, String name, int classNumber, double score) {
        super(id, name);
        this.classNumber = classNumber;
        this.score = score;
    }
    
    public void display() {
        super.display();
        System.out.println("Class Number: " + classNumber);
        System.out.println("Score: " + score);
    }
}

class Teacher extends Person {
    String title;
    String department;
    
    public Teacher(int id, String name, String title, String department) {
        super(id, name);
        this.title = title;
        this.department = department;
    }
    
    public void display() {
        super.display();
        System.out.println("Title: " + title);
        System.out.println("Department: " + department);
    }
}

public class human {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 输入学生数据
        System.out.print("student ID: ");
        int studentId = scanner.nextInt();
        
        System.out.print("student name: ");
        String studentName = scanner.next();
        
        System.out.print("student class number: ");
        int studentClassNumber = scanner.nextInt();
        
        System.out.print("student score: ");
        double studentScore = scanner.nextDouble();
        
        Student student = new Student(studentId, studentName, studentClassNumber, studentScore);
        student.display();
        
        // 输入教师数据
        System.out.print("teacher ID: ");
        int teacherId = scanner.nextInt();
        
        System.out.print("teacher name: ");
        String teacherName = scanner.next();
        
        System.out.print("teacher title: ");
        String teacherTitle = scanner.next();
        
        System.out.print("teacher department: ");
        String teacherDepartment = scanner.next();
        
        Teacher teacher = new Teacher(teacherId, teacherName, teacherTitle, teacherDepartment);
        teacher.display();
        
        scanner.close();
    }
}
