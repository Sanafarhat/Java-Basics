//  Find  outputs  (Home  work)
class prog1d
{
	public  static  void  main(String[]  a)
	{
		System . out . println(Math . max(10 , 20));  //  max(int , int)   returns  20
		System . out . println(Math . max(10.8 , 20.6)); // max(double , double)   returns  20.6
		System . out . println(Math . max('g' , 's'));  // max(int ,  int)   returns  115
		System . out . println((char)Math . max('g' , 's'));  // max(int , int)   returns  115  abd  char(115)   is  's'
		//System . out . println(Math . max("Rama" , "Rajesh")); //  Error :  No  max(String , String)  method  in  Math  class
	}
}


/*
1) Is  max()  method  overloaded  in  Math  class ?   ---> Yes

2) Math . max(10 , 20);
    Which  max()  method  is  executed  ?  ---> max(int , int)

3) Math . max(10.8 , 20.6);
    Which  max()  method  is   executed ?  --->	max(double , double)

4) Math . max('g' , 's');
    Which  max()  method  is   executed ?  --->	max(int , int)  becoz  there  is  no  max(char , char)  method  in  Math  class
    What  happens  to  characters  'g'  and  's' ?  ---> They  are  typecasted  to  integers

5) Math . max("Hyd" , "Sec");
    What  is  the  issue  with  the  above  method  call ?  --->
																Throws  error  becoz  there  is  no  max(String , String)  method  in  Math  class

6) What  is  the  key  to  execute  overloaded  methods  ?  ---> Type  of  argument
*/
