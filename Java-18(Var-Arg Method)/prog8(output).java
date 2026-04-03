// Find  outputs
class  prog8
{
	public  static  void  main(String[]  args)
	{
		int[]  a = {10 , 20};
		int[]  b = {30 , 40 , 50};
		int[]  c = {60 , 70 , 80 , 90};
		m1(a , b , c);  //  Array  of  3  arrays  is  passed  to   the  method
		System . out . println();  // <next line>
		m1(a , b);   //  Array  of  2  arrays  is  passed  to   the  method
		System . out . println();  // <next line>
		m1(a);   //   Array  of  single  array  is  passed  to   the  method
		System . out . println(); // <next line>
		m1();    //  Array  of  0  arrays  is  passed  to   the  method
		//m1(10 , 20 , 15 , 18);   //   Error :   10 , 20 , 15  and  18  are  not  arrays
		m1(new  int[]  {10 , 20 , 15 , 18}); //  Array  of  single  array  is  passed  to   the  method
		//m1({10 , 20 , 15 , 18});   //  Error  due  to  {}
	}
	public  static  void  m1(int[]...  x)  //  'x'  points  to array  of  arrays
	{
		for(int[]  arr :  x)  //   arr  is  each   array  of   array  'x'
		{
			for(int  y : arr)  //  'y'  is  each  element  of  array   arr
					System . out . print(y + "\t");
			System . out . println();
		}
		System . out . println();
	}
}


/*
1) 	public  static  void  m1(int[]...  x)
	{
	}
    What  can  be  passed  to  m1()  method ?  ---> Variable  number  of  arrays
	Can  values  be  passed  to  m1()  method ?  ---> No  due  to  []

2) public  static  void  m2(int...  x)
	{
	}
    What  can  be  passed  to  m2()  method ?  ---> Variable  number  of  values
	Can  arrays  be  passed  to  m2()  method ?  ---> 	Yes  but  only  one

3) public  static  void  m3(int[]  x)
	{
	}
    What  can  be  passed  to  m3()  method ?  ---> Only  one  array
	Can  value  be  passed  to  m3()  method ?  ---> No  due  to  []

4) public  static  void  m4(int  x)
	{
	}
    What  can  be  passed  to  m4()  method ?  ---> Only  one  integer  value
	Can  array  be  passed  to  m4()  method ?  ---> No  becoz  []  is  missing
*/
