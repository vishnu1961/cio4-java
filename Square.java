package graphics;
import java.util.Scanner;
public class Square implements area_cal
{
    int a;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("input side length:");
        a=sc.nextInt();
        System.out.println("area of square:"+(a*a));

    }
}