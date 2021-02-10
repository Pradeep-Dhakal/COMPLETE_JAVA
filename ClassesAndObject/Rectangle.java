public class Rectangle {
    private Float length = 1.0f;
    private Float Width = 1.0f;

    public Rectangle() {

    }

    public Rectangle(float length, float Width){
        this.length=length;
        this.Width=Width;

    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;

    }
    public float getWidth(){
        return Width;
    }
    public void setWidth(float Width){
        this.Width=Width;
    }
    public double getArea(){
        return getWidth()*getLength();
     }
     public String toString(){
     return "Rectangle[Length: "+length+" Width:: " +Width+" ]";
    }

    public static void main(String[] args) {
        Rectangle re=new Rectangle();
        re.setLength(2.5f);
        re.setWidth(2.5f);
        System.out.println("Area of rectangle: "+re.getArea());
        

    }

}
