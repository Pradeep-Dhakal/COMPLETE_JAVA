import java.util.Scanner;
class SameUptoThreeNum {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the 1st number: ");
        int num1=sc.nextInt();
        
        System.out.println("Enter the 1st number: ");
        int num2=sc.nextInt();
        
        double dup_num1 = num1%1000;
        double dup_num2 = num2%1000;
        
        if(dup_num1==dup_num2){
            System.out.println("They are same.");
        }
        else{
            System.out.println("They are different.");
        }
        sc.close();
    }
}

