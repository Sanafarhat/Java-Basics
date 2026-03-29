//  Find  outputs  (Home  work)
class  prog6b
{
	public  static   void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 18};  // Integer array is being initialized with 4 elements
		double[]  b = {10.8 , 20.6 , 15.2 , 19.4};  //Double array is being initialized with 4 elements
		char[]  c  = {'H' , 'y' , 'd'}; // Character array is being initialized with 3 elements
		boolean[]  d = {true , false}; // Boolean array is being initialized with 2 elements
		String  e = "Hyd"; //  Object  is  initialized  with  "Hyd"
		String[]  f = {"Hyd" , "Pune" , "Chennai" , "Vijayawada"}; // String array is being initialized with 4 elements
		System . out . println(a . getClass() . getName()); // classname of  array   'a'  i.e.  [I
		System . out . println(b . getClass() . getName()); // classname of  array   'b'  i.e.  [D
		System . out . println(c . getClass() . getName()); // classname of  array   'c'  i.e.  [C
		System . out . println(d . getClass() . getName()); // classname of  array   'd'  i.e.  [Z
		System . out . println(e . getClass() . getName()); // classname of  object  'e'  i.e. java . lang . String
		System . out . println(f . getClass() . getName()); // classname of  array   'f'  i.e. [Ljava . lang . String;
	}
}