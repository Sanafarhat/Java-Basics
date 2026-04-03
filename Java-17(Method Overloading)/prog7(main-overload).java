// Overloading  main()  method  (Home  work)
import  java . util . Arrays;
class prog7
{
	public  static  void  main(int[]  args)
	{
		System . out . println("main(int[])  method  : " +  Arrays . toString(args));
	}
   	public  static  void  main(String  args)
	{
		System . out . println("main(String)  method  :  " + args);
	}
	public  static  void  main(String[]  args)
	{
		System . out . println("main(string[])  method");
		main(new  int  []  {10 , 20 , 15 , 18});  // main(int[])  method  : [10 , 20 , 15 , 18]
		main("Hello"); // main(String) method : Hello
		main(); // main  without  arguments
		main(25);  // main(int)  : 25
		System . out . println("End"); // End
	}
	public  static  void  main()
	{
		System . out . println("main  without  arguments");
	}
   	public  static  void  main(int  args)
	{
		System . out . println("main(int)  :  " + args);
	}
}


/*
1) Jvm  executes  which  main  method ?  --->   main(String[])  method

2) main(String[])  inturn  calls  other  main  methods
*/
