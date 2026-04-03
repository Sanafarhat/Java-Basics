// Find  outputs
class  prog9a
{
	public  static  void  m1(int   x)
	{
		System . out . println("Regular  method : " + x);
	}
	public  static  void  m1(long   x)
	{
		System . out . println("Typecasting  method : " + x);
	}
	public  static  void  m1(int...   x)
	{
		System . out . println("Var-Arg  method : " + x[0]);
	}
	public  static  void  main(String[]  args)
	{
		m1(25);  // Regular  method : 25
	}
}


/*
1) Which  method  has  got  highest  priority  ? --->  Regular  method

2) Which  method  has  got  2nd  highest  priority  ? --->  Typecasting  method

3) Which  method  has  got  3d  highest  priority  ? --->  Var-Arg  method
*/
