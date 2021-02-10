import java.util.Scanner;
public class DogsEar {
public static int DogsEars(int Dogs){
  if(Dogs == 0)
    return 0;
  else if (Dogs % 2 == 0)
    return (3 + DogsEars(Dogs- 1));
  else
    return (2 + DogsEars(Dogs - 1));
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total numbers of dogs in quee :");
       int dogsnum=sc.nextInt();
        System.out.println("Total numbers of dogs ear: "+ DogsEars(dogsnum));
        sc.close();

    }
}
