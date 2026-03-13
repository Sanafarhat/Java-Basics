// How  many  public  classes  can  be  in  a  file ?   --->  One  (or)  zero
public  class  c1  //  Error :  It  should  be  in  c1 . java  file  but  not  in  prog6.java   file
{
}
public  class  prog6   //  Valid  :  It  is  in   prog6.java  file
{
	public  static  void  main(String[]  args)
	{
		System . out . println("main  method");   
	}
}
public  class  c2  //  Error :  It  should  be  in  c2 . java  file  but  not  in  prog6.java   file
{
}


/*
1) How  many  public  classes  can  be  in  a  file ?  --->  One  (or)  none  but  not  more  than   one

2) What  is  the  issue  with  multiple  public  classes  in  a  file ? ---> File  name  becomes  an  issue

3) Where  can  public  class  c1  be  saved  ?  --->  In  c1.java  file
    Where  can  public  class  c2  be  saved ? --->  In  c2.java  file

4) javac  prog6.java
    Can  the  above  program  be  compiled ?  --->  No  due  to  multiple  public  classes
*/
