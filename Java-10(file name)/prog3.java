// Where  can  the  following  program  be  saved  ?   ---> In  any  file.java  becoz  it  is  not  a  public  class
class   Test
{
	public  static  void  main(String[]  args) 
	{
		System . out . println("main  method");
	}
}


/*
1) Can  the  program  be  saved  in  prog3.java  file ?  --->  Yes  becoz  Test  is  not  a  public  class

2) How  to  compile  the  program ?  --->  javac  prog3.java

3) What  is  obtained  when  the  program  is  compiled ?  ---> Test.class 

4) Why  not  prog3.class  file ?  --->  Since  class  name   is  Test   and  hence  Test.class  file   is  obtained

5) How  to  run  the  class ?  ---->  java  Test

6) java  Test
     Which  method  is  executed ?  --->  main()  method

7) java  prog3
    Is  the  command  valid ?  --->  No  becoz  there  is  no  prog3.class  file  in  cwd
*/
