
/*Ternary operator is used in some condition 
hence its called conditinal operator

*/

class Ternary{

public static void main(String[] args) {
	
	int a=10, b=20,c=30, Max;
	//condition
	Max=(a>b) ? (a>c ? a: c) : (b>c ? b : c);
	System.out.print(Max);
}

}