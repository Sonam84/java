package text;

import java.util.Scanner;

public class EvenorOdd {
public static void main(String[] args) {
	int num;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the vaue");
	num= sc.nextInt(); //initized the variable
	if( num%2==0)
	{
		System.out.println("even number");
		
	}
	else{
		System.out.println("odd number");
	}
		
}
}
