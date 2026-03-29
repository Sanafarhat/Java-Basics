//  Find  outputs
import  java . util . Arrays;
class  prog7
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 18};
		for(int  i = 0 ; i <= a . length - 1 ; i++)
			a[i]++;
		System . out . println("Regular  for  loop  :  " + Arrays . toString(a));  // [11, 21, 16, 19]
		int[]  b = {10 , 20 , 15 , 18};
		for(int  x :  b)
		     x++;  // 11 21 16 19
		System . out . println("for  ...  each   loop  :  " + Arrays . toString(b)); //  [10 , 20 , 15 , 18]
	}
}


/*
1) for ... each  loop  can  iterate  thru  array  but  can  not  modify  array

2) In  other  words,  for  ...  each  loop  treats  array  as  read  only  array
*/
