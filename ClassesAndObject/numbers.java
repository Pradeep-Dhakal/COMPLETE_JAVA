

public class numbers {
    private int num;
    private int a, b;
    private String s1, s2;

    numbers(int number, int a, int b, String s1, String s2) {
        this.num = number;
        this.a = a;
        this.b = b;
        this.s1 = s1;
        this.s2 = s2;

    }

    public void num_calc(int num) {
        int square = this.num * this.num;
        System.out.println("Square : " + square);

    }

    public void num_calc(int a, int b) {
        int product= this.a * this.b;
        System.out.println("Product: "+product);

    }

    public void num_calc(String s1, String s2){
        String concat= this.s1+" \t"+ this.s2;
        System.out.println(concat);

    }

    public static void main(String[] args) {
        numbers n= new numbers(5,10,10,"pradeep","Dhakal");
        n.num_calc(5);
        n.num_calc(5, 7);
        n.num_calc("pradeep","Dhakal");




    }

}
