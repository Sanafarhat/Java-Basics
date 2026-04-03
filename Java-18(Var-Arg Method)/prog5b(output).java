// Find  outputs   (Home  work)
import  java . util . Arrays;
class  prog5b
{
	public  static  void  m1(int...  a)
    {
		System . out . println("Var-Arg    Method  :  " +  Arrays . toString(a));
	}
	public  static  void  main(String[]  args)
	{
	    m1(10 , 20 , 15 , 18);  // Var-Arg Method : [10, 20, 15, 18]
		m1(25);  // Var-Arg Method : [25]
		m1();   //  Var-Arg Method : []
	}
}
