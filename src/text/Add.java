package text;

import java.util.Scanner;

public class Add  { 
public static void main(String[] args) {
	
	int a, b, flag;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the value");
	a=sc.nextInt();
	b=sc.nextInt();
	
	flag=a+b;
	System.out.println("the value of add:"+flag);
}
}
