//  for....each  loop  demo  program
class  prog1
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20 , 15 , 18};
		System . out . println("for  ... each  loop");
		for(int  x  :   a)   //  'x'  is  each  element  of  array  'a'
				System . out . println(x);  //  10   <next  line>  20  <next  line>  15  <next  line>  18  <next  line>
		System . out . println("Regular  for  loop");
		for(int  i = 0 ; i <= a . length - 1 ; i++)
				System . out . println(a[i]); //  10   <next  line>  20  <next  line>  15  <next  line>  18  <next  line>
	}
}


/*
int[]  a = {10 , 20 , 15 , 18};
for(int  x :  a)
	  	System . out . println(x);
Iteation      x
-----------------------
    1            10
    2           20
    3           15
    4           18
*/
