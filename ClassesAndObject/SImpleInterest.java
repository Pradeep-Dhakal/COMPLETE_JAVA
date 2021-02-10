
class Interest {
    private double principal;
    private double rate;
    private double time;

    Interest(double principal, double rate, double time) {
        this.principal=principal;
        this.time=time;
        this.rate=rate;
        
    }
    public void setPrincipal(double principal){
    this.principal=principal;
    }
    public double getrate(){
    return rate;
    }

public void setrate(double rate){
this.rate=rate;
}
public double getprincipal(){
return principal;
}
    public double calculateSimpleIneres(){
        double i=principal*rate*time;
        return i;
    }
    public static void main(String[] args){
        Interest I=new Interest(1000, 10, 2);
       double Interest= I.calculateSimpleIneres();
       System.out.println(Interest);
    }

}
