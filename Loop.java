
/*while loop is pre-test loop
it checks condition before entering
in the loop, it is used when we dont know the no. of
iterations in advanced
It is also known as entry control loop
*/

import java.util.Scanner;

class Loop{

public static void main(String[] args) {

	int n;
	System.out.print("Enter value for condition\n");
	Scanner r=new Scanner(System.in);
	n=r.nextInt();

	while(n>=0)
	{
		System.out.print("Learn Coding");
	}

	
}

}