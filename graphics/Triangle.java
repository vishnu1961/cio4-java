package graphics;
import java.util.Scanner;
public class Triangle implements area_cal
{
    int b,h;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input breadth");
        b=sc.nextInt();
        System.out.println("input height:");
        h=sc.nextInt();
        System.out.println("Area of triangle:"+(0.5*b*h));
        
    }
}