// Find  outputs  (Home  work)
class  prog8
{
	public  static  double  area(double  r)
	{
		return  Math . PI * r * r;
	}
	public  static  double  area(double  l , double  b)
	{
		return  l * b;
	}
	public  static  double  area(double  a , double  b , double  c)
	{
		double  s = (a + b + c) / 2;
		return  Math . sqrt(s * (s - a) * (s - b) * (s - c));
	}
	public  static  void  main(String[]  args)
	{
		System . out . println("Area  of  Triangle  :  " + area(3 , 4 , 5));  // Area of Triangle : 3.0 + 4.0 + 5.0/2 = 6.0  => (6.0 * (6.0 - 3.0) * (6.0 - 4.0) * (6.0 - 5.0)) =  36.0
		System . out . println("Area  of  Rectangle  :  " + area(6 , 7));   // Area of Rectangle :  6.0 * 7.0  => 42.0
		System . out . println("Area  of  Circle  :  " + area(3.5));    // Area of Circle :  38.5
     }
}