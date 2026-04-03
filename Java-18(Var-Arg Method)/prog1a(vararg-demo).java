//  Var-arg  method  demo  program
import  java . util . Arrays;
class  prog1a
{
	public  static  void  disp(int...   a)  
	{
		System . out . println(How  to  print   array  'a');
	}
	public  static  void  main(String[]  args)
	{
		disp(10 , 20 , 15 , 18); 
		disp(100 , 200 , 150); 
        disp(30 , 40 , 35 , 32 , 38); 
        disp();  
        disp(new int [] {70 , 80 , 75 , 72}); 
		disp(10.8 , 20.6 , 15.2 , 14.9);  
	}
}
