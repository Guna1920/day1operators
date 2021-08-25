package question3;
import java.util.Scanner;
public class swappingnumber {

	public static void main(String[] args) {
		int num1,num2,temp; 
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter Two Number");
		num1 = Sc.nextInt();
		num2 = Sc.nextInt();
		System.out.println("Berfore Swapping "+ num1+" "+num2);
	
	 temp=num1;
	 num1=num2;
	 num2=temp;
	 System.out.println("After Swapping "+ num1+" "+num2);
				
		

	}

}