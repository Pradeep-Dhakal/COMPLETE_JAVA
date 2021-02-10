import java.util.Scanner;
class Divis{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        sc.close();
        String Div=(num%5==0) ? "Divisible " : "not Divisible";
        System.out.println(num+ " is" + Div);
    }
    
}