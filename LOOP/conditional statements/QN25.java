import java.util.Scanner;
class EODD {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int A=sc.nextInt();
        
        sc.close();
        //maxNumbers= A>B ? A : B;
        String evenOdd = (A % 2 == 0) ? "even" : "odd";

        System.out.println(A + " is " + evenOdd);

    }
    
}
