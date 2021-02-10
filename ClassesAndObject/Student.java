import java.util.Scanner;
public class Student
{
    String name;
    int m1, m2, m3,age,maximum;
    double average;
    
    public Student(String n, int a, int marks1, int marks2, int marks3, int max, double avg)
    {
        name = n;
        age = a;
        m1 = marks1;
        m2 = marks2;
        m3 = marks3;
        maximum = max;
        average = avg;
    }

    /* accept() method to accept name,age and marks*/
    public void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age =sc.nextInt();
        System.out.print("Enter marks of 1st subject: ");
        m1 = sc.nextInt();
        System.out.print("Enter marks of 2nd subject: ");
        m2 = sc.nextInt();
        System.out.print("Enter marks of 3rd subject: ");
        m3 = sc.nextInt();
    }

    public void calculate()
    {
        average = (m1 + m2 + m3) / 3.0;
        maximum = Math.max(m1, (Math.max(m2, m3)));
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks1 " + m1);
        System.out.println("Marks2 " + m2);
        System.out.println("Marks3 " + m3);
        System.out.println("Maximum: " + maximum);
        System.out.println("Average: " + average);
    }

    public static void main(String[] args)
    {
        Student ob1 = new Student("",0,0,0,0,0,0);
        ob1.accept();
        ob1.calculate();
        ob1.display();
    }

}