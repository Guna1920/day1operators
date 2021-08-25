package question8;
import java.lang.Math;

import java.util.Scanner;

public class powerofnumber {
  
    public static void main(String args[])
    {
        float x;
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println(" Enter a number");
        x=sc .nextFloat();
        System.out.println(" Enter a power ");
        n=sc.nextInt();
        int result= (int) Math.pow(x,n);
        System.out.println("result:"+result);
  
    }
}