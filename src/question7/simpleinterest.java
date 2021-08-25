package question7;
import java.util.Scanner;
public class simpleinterest {

	public static void main(String[] args) {
	float p,r,t;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the principle amount");
	p=sc.nextFloat();
	System.out.println("Enter the rate of interest");
	r=sc.nextFloat();
	System.out.println("Enter the time in years");
	t=sc.nextFloat();
	double si;
	si=(p*r*t)/100;
	System.out.println("Simple Interest="+si);
	
	}

}
