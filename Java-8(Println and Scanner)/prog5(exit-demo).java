// exit()  method  demo  program
class  prog5
{
	public  static  void  main(String[]  args)
	{
		System . out . println("Begin");  //  Begin
		System . exit(0); //  Stops  program  execution
		System . out . println("End");   //  Skipped 
	}
}


/*
exit()  method
-----------------
1) What  does  exit()  method  do ?  --->  Stops  program  execution

2) Where  is  exit()  method  defined ?  --->  In  System  class

3) System . exit(0);
     Why  is  exit()  method  called  thru  class  name  System ? ---> Since  it  is  a  static  method  of  System  class

4) What  is  the  argument  of  exit()  method ?  --->  Any  integer  number  but  not  necessarily  0

5) Which  of  the  following  are  valid ?
     a) System . exit(No-args) ---> Invalid  becoz  exit()  method  demands  an  integer  argument          
	 b) System . exit(10.8)  --->  Invalid  becoz  double  can  not  be  typecasted  to  int
     c) System . exit('A')  --->  Valid  and  character  is   typecasted  to   integer
     d) System . exit("Ten")  ---> Invalid  becoz  String  can  not  be  typecasted  to  int
     e) System . exit(25)  ---> Valid  becoz  25  is  an  integer     
     f) System . exit(-18)  ---> Valid  becoz  -18  is  an  integer

6) System   s  =  new  System();
     s . exit(0);
     Can  exit()  method  be  called  wrt  object ?  --->									
										No  becoz  System  class  can  not  have  object  due  to  private  constructor  in  System  class
*/
