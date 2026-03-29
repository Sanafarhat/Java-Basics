// How  to  access  array  of  calling  method  in  called  method
class  prog12b
{
	public  static  void  main(String[]  args)
	{
		int[]   a =  {10 , 20 , 15 , 18};  // Integer array is being initialized with 4 elements		
		m1(a); // m1() method is called
		for(int i = 0; i < a.length; i++)   //How  to print  each  element  of  array 'a'  with  for  loop
 			System . out . println(a[i]);  //  11  <next line>  21  <next line>   16  <next line>  19  <next line>
	}
	public  static  void  m1(int[]  b)  //  Ref  'b'  points  to  array  'a'  of  main()  method
	{		
		for(int i = 0; i < b.length; i++)   //How  to  increment  each  element  of  array  'a'
            		b[i]++;   //  Increments  a[i]  
	}
}


/*
1) How  many  arrays  are  in  the  above  program ?  --->  Single  array  with  two  references  a  and  b

2) Is  b[i]  valid  in  main()  method ?  --->  No  becoz  there  is  no  'b'  in  main()  method
     Is  a[i]  valid  in  m1()  method ?  --->  No  becoz  there  is  no  reference  'a'  in  m1()  method

3) How  to  use  array   in  m1()  method ?  ---> Thru  reference  'b'  i.e.  b[0] , b[1] , b[2] , b[3]

4) How  to  call  m1()  when  it  is  non-static ?  --->  prog12b  obj = new  prog12b();
                                                                                  obj . m1(a);
*/
