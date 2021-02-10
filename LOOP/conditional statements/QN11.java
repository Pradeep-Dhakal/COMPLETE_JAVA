public class QN11 {
    public static void main(String[] args)
	{
		int x= 15, y=2, z=8; 
		if ((x > y && x > z))
        {
            if(y > z)
            {
                System.out.print("The ascending order is " +z + " " + y + " " + x);
            }
            else
                System.out.print("The ascending order is " +y + " " + z + " " + x);
        }
        else if ((y > x && y > z))
        {
            if(x > z)
            {
                System.out.print("The ascending order is " +z + " " + x + " " + y);
            }
            else
                {
                System.out.print("The ascending order is " +x + " " + z + " " + y);
                }
        }
        else if ((z > x && z > y))
        {
            if(x > y)
            {
                System.out.print("The ascending order is " +y + " " + x + " " + z);
            }
            else
                System.out.print("The ascending order is " +x + " " + y + " " + z);
        }
        else
        {
            System.out.println("umatched condition!");
        }
	
	} }

