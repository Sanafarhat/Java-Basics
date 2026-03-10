// PI  variable  demo  program
class  prog9 
{
	//static   int  PI = 35;
	public  static void main(String[] args) 
	{		
		//int  PI = 25;
		System . out . println(Math . PI); // 3.14159
		//System . out . println(PI); // Error:  No  local  variable  PI  in  current  method  nor  static  variable  PI  in  same  class   i.e.  prog9  class
		//Math . PI++; //  Error:  final  variable  PI  cannot be modified
		//Math  m = new  Math(); // Error:  Math  class   object  cannot  be  created  due  to  private constructor  in  Math  class
		//System . out . println(m . PI); // Error:  No  object  'm' 
	}
}


/*
PI  variable
-------------
1) What  is  the  value  of  variable  PI ?  ---> 3.14159

2) Where  is  PI   variable  defined  ?  --->  In  Math  class

3) Can  value  of  PI  variable  be  modified ?  --->  No  becoz  it  is  a  final  variable  of  Math  class

4) System . out . println(Math . PI);
    Why  is  PI  variable  accessed  through  class  name ?  --->  Since  it  is  a  static  variable  of  Math  class
 
5) Finally  PI  is  a  final  static  variable  of  Math  class
 
6) Is  Math . PI()  valid ?  --->  No  becoz  PI  is  not  a  method  of  Math  class
 
7) System . out . println(new  Math() . PI);
     Can  variable  PI  be  accessed  wrt  object ?  ---> No  becoz  Math  class  doesn't  have  object
*/
