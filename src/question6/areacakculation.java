package question6;
import java.util.Scanner;
public class areacakculation {

	public static void main(String[] args) {
	   int l,b,a1,a2,s;
	   float r;
	   double a3;
	   Scanner sc = new Scanner (System.in);
	   System.out.println("Enter sides");
	   s=sc.nextInt();
	   System.out.println("Enter length");
	   l=sc.nextInt();
	   System.out.println("Enter breadth");
	   b=sc.nextInt();
	   System.out.println("Enter the radious ");
	   r=sc.nextInt();
	   a1=s*s;
	   a2=l*b;
	   a3=(r*r*3.14)/4;
	   System.out.println(" the area of square is "+a1);
	   System.out.println(" the area of rectangle is "+a2);
	   System.out.println(" the area of circle is "+(float)(a3));
	}

}
