package question9;
import java.util.Scanner;
public class ternaryoperator {

	public static void main(String[] args) {
		int number,remainder;
	System.out.println("Enter a number");
	Scanner sc=new Scanner(System.in);
	number= sc.nextInt();
	sc.close();
	remainder=number%2;
	if(remainder==0)
	
	System.out.println(number+" is a even number");
	else
		System.out.println(number+" is a odd number");

	}
	}
