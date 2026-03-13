//  Can  a  file  have  multiple  classes ?  --->  Yes
class  c1  
{
}
public  class  prog4   
{
}
class  c2
{
	public  static  void  main(String[]  args)
	{
		System . out . println("main  method  of  class  c2");
		c1  a  = new  c1(); 
		prog4  b =  new  prog4(); 
	}
}


/*
1) How  many  classes  can  be  in  a  file ? ---> Multiple  classes

2) Where  can  the  above  program  be  saved  ?  --->  In  prog4.java  file  becoz  prog4  is  a  public  class

3) How  to  compile  the  program ?  --->  javac  prog4.java

4) javac  prog4.java
    What  are  the  class  files  generated  ? ---> c1 . class , prog4 . class  and  c2 . class

5) Which  class  can  be  executed  and  why ?  --->  c2.class  becoz  it  has  got  main()  method

6) java  c2  
    Which  method  is  executed ?  --->  main()  method  of  class  c2

7) Can  c1.class  and  prog4.class  be  executed ?  --->  No  becoz  they  do  not  have  main()  method

8) java  c1 
    Is  the  command  valid ?  --->  No  becoz  there  is  no  main()  method  in  class  c1

9) java   prog4
    Is  the  command  valid ?  ---> No  becoz  there  is  no  main()  method  in  class  prog4
*/
