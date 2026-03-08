// Explicit  typecasting  demo  program  (Home  work)
class  prog2b 
{
    public  static  void  main(String[]  args) 
	{
        int  a = 9 , b = 2; 
        System . out . println(a / b); //  9 /  2  = 4
        System . out . println((double) a / b); //  9.0 / 2 = 4.5 
        System . out . println(a / (double) b); //  9 / 2.0 = 4.5
        System . out . println((double) (a / b)); //  (double)4 = 4.0
        System . out . println(a); // 9
        System . out . println(b); // 2
    }
}


/*
(double)a / b 
(double)(a / b) 
What  is  the  difference  between  the  two  statements ?  --->																  
																  (double) a / b   converts  variable  'a'  to  double  but
															      (double) (a / b)   converts  result  of  a / b  to  double
*/
