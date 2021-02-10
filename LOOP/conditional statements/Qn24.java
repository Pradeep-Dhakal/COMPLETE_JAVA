import java.util.Scanner;
class max {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int maxNumbers=0;
        sc.close();
        maxNumbers= A>B ? A : B;
        System.out.println("maximum among both number is "+maxNumbers);

    }
}
