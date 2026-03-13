// Can  every  class  have  main  method ?   --->  Yes
class  c1
{
	public  static  void  main(String[]  args)
	{
		System . out . println("main  method  of  class  c1");  		
	}
}
class  prog7
{
	public  static  void  main(String[]  args)
	{
		System . out . println("main  method of  class  prog7"); 
	}
}
class  c2
{
	public  static  void  main(String[]  args)
	{
		System . out . println("main  method  of   class  c2");  
	}
}


/*
1) Can  every  class  have  main  method ?  --->  Yes

2) javac  prog7.java
    What  are  the  class  files  generated  when  the  program  is  compiled  ? ---> c1 . class , prog7 . class  and  c2 . class

3) Which  class  can  be  executed ?  --->  Every  class  becoz  each  class  has  got  main()  method

4) java   c1  
     Which  method  is  executed ?  ---> main()  method  of  class  c1
     
5) java   prog7  
    Which  method  is  executed ?  ---> main()  method  of  class  prog7
	 
6) java  c2 	 
    Which  method  is  executed ?  ---> main()  method  of  class  c2

7) java  c1   prog7  c2
     What  does  the  command  do ?  --->  Executes  main()  method  of  class  c1  and
												                 prog7 , c2  are  passed  as  command  line  inputs  to  main()  method
     What  is  args[0]  ?  --->  "prog7"
     What  is  args[1]  ?  --->  "c2"
*/
