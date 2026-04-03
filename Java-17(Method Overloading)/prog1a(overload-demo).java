//  Overload  add()  method  such  that  it  can  add  integers , floats , doubles and  join  strings
class  prog1a
{
	public  static  int  add(int  a , int  b)
	{
		return  a + b;
	}
	public  static  int  add(int  a , int  b , int  c)
	{
		return  a + b + c;
	}
	public  static  float  add(float  a , float  b)
	{
		return  a + b;
	}
	public  static   int  add(char  x , char  y)
	{
		return  x + y;
	}
	public  static  void  main(String[]  args)
	{
		System . out . println(add(10.8 , 20.6)); //  add(double  , double)  returns  31.4
		System . out . println(add(10 , 20));  // add(int , int) returns  30
		System . out . println(add("Hyder" , "abad")); // add(String , String) returns   "Hyderabad"
		System . out . println(add(10 , 20 , 30));  // add(int , int , int) returns  60
		System . out . println(add(10.5f , 20.6f)); // add(float , float) returns  31.1
		System . out . println(add('A' , 'B'));  //  add(char , char) returns  65 + 66 i.e. 131
		System . out . println((char)add('A' , 'B')); // add(char , char) returns  131  and  char(131)  is  ?
	}
	public  static   double  add(double  a , double  b)
	{
		return  a + b;
	}
	public  static  String  add(String  a , String  b)
	{
		return  a + b;
	}
}

/*
1) prog1a . add(10 , 20);
    Is  class  name  prog1a  mandatory  ?  ---> No  becoz  add()  is  a  static  method  of  same  class

2) prog1a . add(10 , 20);
    When  is  class  name  prog1a  mandatory ?  ---> When  add()  method  is   in  a  different  class

3) How  to  call  add()  method   if  it  is  not  a  static  method ? --->  prog1a  obj = new  prog1a()
																											  obj . add(10 , 20);

4) Where  can  main()  method  be  defined  in  the  class (Begin , middle  (or)  end)  ?  --->  Any  where  in  the  class

5) In  which  order  can  methods  of  the  class  be  defined  ?  --->  Any  order
*/
