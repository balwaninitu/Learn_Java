//Relational operator is type of Binary operator

import java.util.Scanner;

class Ralational{


	public static void main(String[] args) {
		int a, b;

		System.out.print("Enter two Numbers...");
		Scanner obj=new Scanner(System.in);
		a=obj.nextInt();
		b=obj.nextInt();

		System.out.println("true/false "+(a<b));
		System.out.println("true/false "+(a>b));
		System.out.println("true/false "+(a<=b));
		System.out.println("true/false "+(a>=b));
		System.out.println("true/false "+(a==b));
		System.out.println("true/false "+(a!=b));

		
	}
}