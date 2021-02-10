import java.security.KeyStore.PrivateKeyEntry;

import javax.swing.border.EtchedBorder;

// Question no 8: 
public class Dimention2 {
    private double length;
    private double width;
    private double height;
    //private double side;

    Dimention2(double length, double width, double height) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

   

    private double volume() {
        return length*width*height;

        
    }
    private double area(){
        return 2*(length*width+width*height+height*length);
    }
    
    public static void main(String[] args){
        Dimention2 Dm= new Dimention2(17, 5, 7);
        System.out.println("Volume: "+Dm.volume());
        System.out.println("Circumference: "+Dm.area());
        System.out.println("top area: "+Dm.area());

       

    }

}
