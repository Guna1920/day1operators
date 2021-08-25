package question2;
import java.util.Scanner;
public class multiplicationdivide {
	
	public static void main(String[] args) {
		
		int a,b;
		System.out.println("Enter a first number");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		System.out.println(" Enter a second number ");
		b=sc.nextInt();
		int multiplication =a*b; int devision=a/b; int remainder=a%b;
		System.out.println("multiplication " + multiplication );
		
		System.out.println("devide" + devision); 
		
		System.out.println("remainder" + remainder);
}
}