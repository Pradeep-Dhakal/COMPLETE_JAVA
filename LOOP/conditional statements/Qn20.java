import java.util.Scanner;
class StudentAttendenc {
    public static void main(String[] args) {

     Scanner in=new Scanner(System.in);
     
        System.out.println("Enter the number of class");
        int n=in.nextInt();
        System.out.println("Enter the number of class attend");
        int a=in.nextInt();
        in.close();
        float per=(a*100)/n;
        System.out.println("percentage : " +per);
        if(per<75){
            System.out.println("Are you medical cause ?? yes or not ???");
            int choise;
            System.out.println("1 : yes");
            System.out.println("2 : No");
            System.out.println("Enter your choise");
            choise=in.nextInt();
           switch(choise){
               case 1:
                   System.out.println("you can sit an exam");
                   break;
               case 2:
                   System.out.println("you can't sit an exam");
                   break;
               default:
                   System.out.println("If any other is pressed");
                   
           }
                    }
       else
            System.out.println("You can sit in examination room");
    
}
}
