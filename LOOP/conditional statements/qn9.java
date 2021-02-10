import java.util.Scanner;
class qn9{
    public static void main(String[] args){
        char choice;
        long amount,Discount,netAmt;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your choice");
        System.out.println("enter D for desktop and L for laptop");
        choice = sc.next().charAt(0);
        
      
    
    switch (choice) {
    case 'L':
    System.out.println("please enter your laptop price");
    amount=sc.nextLong();
   if(amount>=0 && amount<=25000){
    Discount=0;
    netAmt=amount-Discount;       //discount = (discount rate/100) * amount of purchase
    System.out.println("your net amount is"+netAmt);
    }else if(amount==25001 && amount<=57000){
        Discount=(5/100)*amount;
        netAmt=amount-Discount;
        System.out.println("your net amount after discount is=" +netAmt);
    }
    else if(amount==57000 && amount<=100000){
        Discount=(7/100)*amount;
        netAmt=amount-Discount;
        System.out.println("your net amount after discount is=" +netAmt);
    }
    else{
        Discount=(10/100)*amount;
        netAmt=amount-Discount;
        System.out.println("your net amount ater discount is="+netAmt);
    }
    break;
  
  case 'D':
  System.out.println("please enter your Desktop price");
  amount=sc.nextLong();
   if(amount>=0 && amount<=25000){
    Discount=(5/100)*amount;
    netAmt=amount-Discount;       //discount = (discount rate/100) * amount of purchase
    System.out.println("your net amount is"+netAmt);
   }
   else if(amount== 25001 && amount<=57000){
    Discount=(7/100)*amount;
    netAmt=amount-Discount;
    System.out.println("your net amount after discount is=" +netAmt);
}
else if(amount==57001 && amount<=100000){
    Discount=(10/100)*amount;
    netAmt=amount-Discount;
    System.out.println("your net amount after discount is=" +netAmt);
}
else{
    Discount=(15/100)*amount;
    netAmt=amount-Discount;
    System.out.println("your net amount after discount is="+netAmt);
    }
    
    break;
  default:
  System.out.println("please enter vallied choice!!!!!!!!11");

    // default statements
     }
     System.out.println("thank you for choosing us \n keep shoping");
}

}
