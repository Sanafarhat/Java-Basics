// How  to  print  execution  time  of  for  loop
class  prog5b
{
	public  static  void  main(String[]  args)
	{
		long a = System.currentTimeMillis();		
		for(long  i = 1 ; i <= 10000000000L ; i++) 
		{
		}
		long  b = System.currentTimeMillis();	
		System . out . println("for loop  execution time : "+(b-a)/1000.0);		
	}
}
