// Identify  Error
class  prog3
{
	public  static  void  main(String[]  args)
	{
		int[]  a;
		a = {10 , 20 , 15 , 18}; // Error : new  is  mandatory  when  array  is  initilaized  later
	}
}



/*
1) int[]  a = new   int[5]
    How  to  divide  the  statement  into  two  statements ?  --->	int[]   a;
                                                                        a = new  int  [5];

2) int[]   a = new  int[]  {10 , 20 , 15 , 18}
    How  to  divide  the  statement  into  two  statements ?  --->	int[]  a;
					  				 a = new  int[]  {10 , 20 , 15 , 18}

3) int[]   a = {10 , 20 , 15 , 18}
    Can  the  statement  be  divided  into  two  statements ?  --->  Yes  but  new  is  mandatory  to  initialize  array

4) int[]  a;
    Which  of  the  following  are  valid ?
     a) a = new  int [5]  --->  Valid  due  to  new  operator
     b) a = new  int  []  {10 , 20 , 15 , 18}  ---> Valid  due  to  new  operator
     c) a =  {10 , 20 , 15 ,18}  ---> Error  becoz  array  can  not  be  initialized  later  without  new  operator
*/
