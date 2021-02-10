import java.util.*;

class Interest {
    private double principal;
    private double rate;
    private double time;

    Interest(double principal, double time, double rate) {
        this.principal = principal;
        this.time = time;
        this.rate = rate;

    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getprincipal() {
        return principal;
    }

    public void setrate(double rate) {
        this.rate = rate;
    }

    public double getrate() {
        return rate;

    }

    public void settime(double time) {
        this.time = time;
    }

    public double gettime() {
        return time;

    }

    public double calculateSimpleIneres() {
        double i = principal * rate * time;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Principal: ");
        double P=sc.nextInt();
        System.out.println("Time:");
        double T=sc.nextInt();
        System.out.println("Rate: ");
        double R=sc.nextInt();
        Interest I = new Interest(P, T, R);
        double Interest = I.calculateSimpleIneres();
        System.out.println("Simple interest is :" + Interest);
    }

}
