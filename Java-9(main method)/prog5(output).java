//  Find  outputs  (Home  work)
class  prog5
{
	public  static  void  main(String[]  args)
	{
		System . out . println("Hello"); // Hello
		if(9 > 7) // true
				return; //  Moves  control  out  of  the  method
		System . out . println("Bye"); //  Valid  but  skipped 
	}	
}


/*
if(cond)
{
	return;
	stmt-x;
}
stmt-y;
1) Is  stmt-x  valid ?  --->  No  becoz  statements  are  not  permitted  after  return

2) Is  stmt-y  valid ?  --->  Yes  becoz  it  is  after  'if'  but  not  after  return
*/
