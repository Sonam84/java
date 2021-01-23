package text;

import java.util.Scanner;

public class Swipping {
	public static void main(String[] args) {
		int a, b;
		Scanner sc =new Scanner( System.in);
		System.out.println("enter the value of A");
		a=sc.nextInt();
		System.out.println("enter the value of B");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value in a "+a);
		System.out.println("value in b "+b);
	}

}
