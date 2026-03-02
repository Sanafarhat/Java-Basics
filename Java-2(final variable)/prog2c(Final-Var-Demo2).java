// Find  outputs (Home  work)
class  prog2c 
{
	public  static  void  main(String[]  args) 
	{
		final  int  X;  //  'X'  is  empty  variable
		//System . out . println(X); // Error :  Empty  variable  can  not  be  printed
		X = 10;  //  Valid :  final  variable  is  initialized  to  10
		//X = 20; // Error : final variable  cannot be changed
		System . out . println(X); //  Value  of  'X'   i.e.  10
	}
}


/*
1) int  x;
    What  is  the  value  of  variable  'x'   in  other  languages ? --->  Garbage  value  becoz  'x'  is  not  initialized

2) int  x;
    What  is  the  value  of  variable  'x'   in  java ? ---> Empty  variable  becoz  it  is  not  initialized

3) There  is  no  garbage  value  concept  in  java

4) final  int  X = 5;
    Is  X = 10  valid ?  ---> No  becoz  final  variable  can  not  be  modified

5) final  int  X;
     Is  X = 10  valid ?  --->  Yes  and  final  variable  is  initialized  to  10
*/
