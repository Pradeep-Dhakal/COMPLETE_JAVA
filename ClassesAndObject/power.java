
import java.lang.Math; 
public class power {
    int m;
    int n=2;
    power(int m, int n){
        this.m=m;
        this.n=n;

    }
    public double squ(){
        return Math.pow(m, 2);
    }
    public double square(int m, int n){
        return Math.pow(m, n);

    }
    public static void main(String[] args){
    
        power p=new power(2,5);
        System.out.println(p.squ());
        System.out.println(p.square(3,6));


    }
    
}
