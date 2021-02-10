
// Question no 7: 
public class Dimention {
    private double length;
    private double width;
    private double height;
    private double side;

    Dimention(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    Dimention(double side) {
        this.side = side;
    }

    public double volume() {
        return length * width * height;

    }

    public double are() {
        return 2 * (length * width + width * height + height * length);
    }

    public static void main(String[] args) {
        Dimention Dm = new Dimention(11, 5, 7);
        Dimention Dm2 = new Dimention(3);
        System.out.println(Dm2);
        System.out.println("Volume: " + Dm.volume());
        System.out.println("Circumference: " + Dm.are());

    }

}
