import java.util.Scanner;

class UserInput{

	public static void main(String[] args) {
		
		int a, b;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter value ");
		a=obj.nextInt();
		b=obj.nextInt();
		System.out.print(a+" "+b);
	}
}
