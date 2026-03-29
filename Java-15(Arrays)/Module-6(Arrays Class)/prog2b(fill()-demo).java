// fill()  method  demo  program
import  java . util . Arrays;
class  prog2b
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 18 , 15 , 5 , 12 , 18 , 25 , 30 , 28};
//		                 0    1     2   3    4    5     6     7     8
		System . out . println(Arrays . toString(a));  //  [10 , 18 , 15 , 5 , 12 , 18 , 25 , 30 , 28]
		Arrays.fill(a, 3, 8, 100);// How  to  modify  elements  of  array  from  indexes  3  to  7  with  100
		System . out . println(Arrays . toString(a));  //  [10 , 18 , 15 , 100 , 100 , 100 , 100 , 100 , 28]
	}
}
