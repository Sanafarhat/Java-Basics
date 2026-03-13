//  Where  can  the  program  be  saved  when  no  class  is  public ?  --->   In  any file name . java
class  c1
{
}
class  c2
{
	public  static  void  main(String[]  args)
	{
		System . out . println("main  method of  class  c2");  // main  method of  class  c2
	}
}
class  c3
{
}


/*
1) Where  can  the  above  program  be  saved  ?  --->  In  anyfile . java   becoz  no  class  is  public

2) javac  prog5.java
    What  are  the  class  files  generated ?  ---> 	c1 . class , c2 . class  and  c3 . class

3) Which  class  can  be  executed ?  ---> class  c2  becoz  it  has  got  main  method

4) java  c2  
    Which  method  is  executed ?  ---> main()  method  of  class  c2

5) Can  c1.class  and  c3.class  be  executed ?  --->   No  becoz  they  do  not  have  main()  method

6) java   c1  
    Is  the  command  valid ?  --->  No  becoz  there  is  no  main()  method  in   class  c1

7) java   c3  
    Is  the  command  valid ?  ---> No  becoz  there  is  no  main()  method  in   class  c3
*/
