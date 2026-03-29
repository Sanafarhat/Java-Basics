// Find  outputs
import  java . util . Arrays;
class  prog3b
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 5 , 12};
		System . out . println("Unsorted  Array : " + Arrays . toString(a));  //  [10 , 20 ,  15 ,  5 , 12]
		Arrays.sort(a);// How  to  sort  array  'a'
		System . out . println("Sorted  Array : " + Arrays . toString(a));  //  [5 , 10 ,  12 ,  15 , 20]
	}
}
