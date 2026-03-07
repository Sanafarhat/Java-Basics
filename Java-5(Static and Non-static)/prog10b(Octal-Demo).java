// Find  outputs  (Home  work)
class  prog10b 
{
    public  static  void  main(String[]  args) 
	{
        int  x = 06247; // Variable  contains  decimal  equivalent  i.e.  6 * 8 ^ 3 + 2 * 8 ^ 2 + 4 * 8 ^ 1 + 7 * 8 ^ 0  
        System . out . println(x); // 3239
        System . out . println(6247); // Decimal  number  i.e. 6247 
        System . out . println(09248); // Error  due  to  8 and 9
    }
}


/*
Conversion  of  octal  number  to  decimal  number
----------------------------------------------------------
			  512   64   8    1  ---> Weights
               6      2    4    7   --->  6 * 512 + 2 * 64 + 4 * 8 + 7 * 1
*/
