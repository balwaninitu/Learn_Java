
import java.util.Scanner;

class Simple{

	public static void main(String[] args) {

		int age;
		System.out.print("Enter Your Age..! ");
		Scanner r=new Scanner(System.in);
		age=r.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible for votes...!");
		}

		System.out.println("Thank You..!");
	}
	
}