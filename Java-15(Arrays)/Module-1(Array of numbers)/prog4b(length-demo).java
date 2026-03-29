//  length  variable  demo  program
class  prog4b
{
	public  static  void  main(String[]  args)
	{
		int[]  a = new  int  [5]; // Ref 'a'  points  to  an  integer  array  with  5 zeroes
		System . out . println(a.length); //  5  //How  to  print  array  size
		a = new  int  [] {10 , 20 , 15 , 18};  // Ref 'a'  is  modified  to  to  an  array  with   10 , 20 , 15 , 18
		System . out . println(a.length); // 4
		for(int i = 0; i < a.length; i++)   //How  to  print  each  element  of  array  with  for  loop
 			System . out . println(a[i]);  // 10 <nextline> 20 <nextline> 15 <nextline> 18
		//System . out . println(a . length()); // Error :  No  length()  method  in  array  class
		//a . length++; // Error : final  variable  length  cannot  be  modified
		//int[]  b = new  int[b . length]; // Error :  ref  'b'  is  being  used  without  creation  of  'b'  on  right  side
	}
}


/*
1) What  does  arrayname . length  represent ?  ---> Array  size  (or) Number  of  elements  in  the  array

2) What  is  the  starting  index  of  array  ?  --->  0
     What  is  the  last  index  of  array ?  ---> Arrayname . length  -   1
*/
