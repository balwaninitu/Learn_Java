/*incr/Decr operator example
it has two category pre and post
it can work on only one operator and its called unary operator
In post incr first there is operand then operator 
in pre incr operator comes before oprand
*/

class PrePost{

	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a);
		System.out.println("Prepost Incr ..");

		System.out.println(a++); //Post incr - it print 10 then increment to 11
		
		System.out.println(++a); //Pre Incr - 12 because it increase value first then print


		System.out.println("Prepost Decr ..");

		System.out.println(a--); //Post Decr - it print 12 then Decrement to 11
		
		System.out.println(--a); //Pre Decr - 10 because it Decrease value first then print


	}


}