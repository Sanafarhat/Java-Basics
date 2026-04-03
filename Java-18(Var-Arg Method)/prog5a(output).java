// Find  outputs   (Home  work)
import  java . util . Arrays;
class  prog5a
{
	public  static  void  m1(int...  a)
    {
		System . out . println("Var-Arg    Method  :  " +  Arrays . toString(a));
	}
	public  static  void  m1(int  x)
	{
            System . out . println("Regular  method  :  " +  x);
	}
	public  static  void  main(String[]  args)
	{
	    m1(10 , 20 , 15 , 18);   //  Var-Arg Method : [10, 20, 15, 18]
		m1(25);  // Regular  method : 25
		m1(); //  Var-Arg Method : []
	}
}


/*
1) m1(25)
    Why  is  regular  method  executed ? ---> Since  regular  method  has  got  higher  priority  over
																	   var-arg  method  when  there  is  a  confict

2) m1(25);
    Jvm  does  not  take  the  burden  of  creating  an   array , stores  25  in  the  array  becoz  m1(int)  is  readily  available

3) What  is  the  signature  of  var-arg  method ?  ---> int...
    What  is  the  signature  of  regular  method ?  ---> int

4) m1()  method  is  overloaded  in  the  above  program  with  two  different  signatures
*/
