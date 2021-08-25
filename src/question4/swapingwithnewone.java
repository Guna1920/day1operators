package question4;
import java.util.Scanner;

public class swapingwithnewone {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Numbers");
			num1 = sc.nextInt(); //12
			num2 = sc.nextInt(); //3
		System.out.println("Before Swapping "+ num1+" "+ num2); //12 3
		num1=num1+num2;  //12+3=15
		num2=num1-num2;  //15-3=12
		num1=num1-num2;  //15-12=3
		System.out.println("After Swapping "+ num1+" "+ num2); //3 12
				
			
				
		}

	}
