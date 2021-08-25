package question5;
import java.util.Scanner;
public class averagecalculation {

	public static void main(String[] args) {
		float a,b,c,d,e;
		System.out.println("Enter the marks");
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		d= sc.nextInt();
		e= sc.nextInt();
		float sum=a+b+c+d+e;
		System.out.println("total marks"+ sum);
		
		float avg= sum/5;
		System.out.println("Average Marks"+ avg);
		



	}

}
