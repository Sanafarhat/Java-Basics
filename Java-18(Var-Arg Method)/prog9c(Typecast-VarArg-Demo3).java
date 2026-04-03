// Find  outputs
class  prog9c
{
	public  static  void  m1(int...   x)  //  'x'points   to  array  of  single value
	{
		System . out . println("Var-Arg  method : " + x[0]);  //   Var-Arg  method  : 25
	}
	public  static  void  main(String[]  args)
	{
		m1(25);  //  Array  of  single  value  25  is  passed  to   m1()  method
	}
}
