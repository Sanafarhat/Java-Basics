// Factory  method
class  c1
{
	public  static  c1   m1()
	{
		c1  a = new c1();   //  Ref  'a' points  to  c1 class object 
		System.out.println(a.hashCode());  // Hash  code  of  object  'a'  (may  be  1000)
		return  a; //  Returns   object  'a'   to  the  method  call   c1 . m1()
	}
}
class  prog3b
{
	public  static  void  main(String[]  args)
	{
		c1  b = c1.m1(); //  c1  b = a  i.e.  ref  'b'  points  to  object  'a'
		System.out.println(a.hashCode()); // Hash  code  of  object  'b'  i.e.  Same  hash  code
	}
}

/*
1) Can  main  method  use  object  'a'  directly ?  --->  No  becoz  'a'  is  local  object  to  m1()  method

2) return  a;
    What  is  the  advantage  of  returning  object  'a' ?  ---> main()  method  can  use  object  'a'  indirectly  thru  ref  'b'

3) What  is  the  advantage  of  factory  method  ?  ---> 								
													Object  of  called  method  can  be  used  by  calling  method  indirectly  thru  reference

4) How  many  objects  are   in  the  above  program ?  --->  One  object  with  two  references  'a'  and  'b'  and
														                                      both  the  references  point  to  the  same  object
*/
