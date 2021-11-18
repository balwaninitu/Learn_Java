class Variables1


{
	static int a = 10;
	void fun()
	{
		int b=10;
		System.out.println(a+" "+b); //10 10
		++a; ++b; //11 11 after increment
	}
	public static void main(String[] args) 
	{
       Variables1 ref = new Variables1();
	   ref.fun();

	   /*when function get called second time local variable memory will create again and it will be 10
	   whereas static variable will  */
	    ref.fun();

		System.out.println("Hello World!");

	}
}
