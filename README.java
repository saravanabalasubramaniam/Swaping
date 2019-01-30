import java.util.*;
import java.io.*;
class Swaping
{
public static void main(String args[])
	{
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        a = input.nextInt();
        System.out.print("Enter the second number:");
        b = input.nextInt();
        a = a ^ b;
        b = a ^ b;
        a= a ^ b;
        System.out.println("After Swapping");
        System.out.println("First number:"+a);
        System.out.println("Second number:"+b);
    	}
}
