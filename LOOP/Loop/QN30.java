import java.util.Scanner;
class TwoInt{
public static void main(String[] args) {
int a=1;
Scanner sc = new Scanner(System.in);
System.out.println("Input integer number: ");
int x = sc.nextInt();
System.out.println("Input  integer another number: ");
int y = sc.nextInt();

System.out.print("Value of n:");
int n = sc.nextInt();
for(int i=0;i<n;i++){
    a=a*10;
}
if(x%a == y% a){
    System.out.println("Expected output:");
System.out.println("They are same");
    }
 }
}
