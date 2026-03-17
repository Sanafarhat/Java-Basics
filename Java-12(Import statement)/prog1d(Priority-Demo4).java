// What  is  the  issue  when  both  are  explicit  import  statements ?  (Home  work)
import  java . util . Date;  //  Valid
import  java . sql . Date;   //  Error :  java . util . Date  is  already  impotred  and  hence  java . sql . Date  can  not  be  imported
class  prog1d
{
	public  static  void  main(String[]  args)
	{
	}
}


/*
1) Can  same  class  be  imported  from  different  packages  ?  --->  No  i.e.  explicitly

2) How  to  import  Date  class  from  both  util  and  sql  packages ? --->  import  them  explicitly  and  implicitly
																									               i.e.  import  java . util . Date;
																									                     import  java . sql . *;

3) import  java . util . *;
    import  java . sql . *;
	Are  the  two  import  statements  valid ?  --->  Yes  
	
4) import  java . util . Date;	
    import  java . util . Date;	
	Can  Date  class  be  imported  twice  from  same  package ?  ---> Yes
*/
