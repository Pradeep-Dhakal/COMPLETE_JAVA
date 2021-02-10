
public class Circle {
    private double radius;
    private double Pi = 3.14;

    public Circle() {

    }

    public Circle(double R) {
        this.radius = R;
    }

    public void setradius(double radius) {
        this.radius = radius;

    }
    public double getCircumference(){
        return 2*Pi*radius;
    }
    
    public static void main(String[] args) {
        Circle C= new Circle();
        C.setradius(5);

    System.out.println("Circumference :"+ C.getCircumference());

    }

}
