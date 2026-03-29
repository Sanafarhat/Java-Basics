//  Find  outputs
import  java . util . Arrays;
class  prog4b
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 5 , 12};
		Arrays . sort(a);  //  [5  , 10 , 12 , 15 , 20]
		System . out . println(Arrays . binarySearch(a , 15));  //  Index  of  15  in  array  'a'  i.e. 3
		System . out . println(Arrays . binarySearch(a , 14));  //  Index  of  14  in  array  'a'  i.e.  -(3 + 1) = -4
		System . out . println(Arrays . binarySearch(a , 25)); // Index  of  25  in  array  'a'  i.e. -(5 + 1) = -6
		System . out . println(Arrays . binarySearch(a , 3)); // Index  of  3  in  array  'a'  i.e. -(0 + 1) = -1
	}
}
