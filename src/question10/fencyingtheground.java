package question10;
import java.util.Scanner;
public class fencyingtheground {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Enter Two Numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		
		int area = a * b;
		int Perimeter = 2 * (a+b) ;
		System.out.println("Area :"+ area );
		System.out.println("Perimeter :"+ Perimeter);
		
		}

	}