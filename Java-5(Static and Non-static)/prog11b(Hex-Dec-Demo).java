//  Find  outputs  (Home  work)
class  prog11b
{
	public  static  void  main(String[]  args) 
	{
		int  x = 0XA7B9; // Variable  contains  decimal  equivalent  i.e.  10 * 16 ^ 3 + 7 * 16 ^ 2 + 11 * 16 ^ 1 + 9 * 16 ^ 0
		System . out . println(x); // 42937
		System . out . println(0xBEEF); // 11 * 16 ^ 3 + 14 * 16 ^ 2 + 14 * 16 ^ 1 + 15 * 16 ^ 0
		System . out . println(0xA7B9); // 10 * 16 ^ 3 + 7 * 16 ^ 2 + 11 * 16 ^ 1 + 9 * 16 ^ 0 = 42937
		//System . out . println(0XBEER); // Error  due  to R
		//System . out . println(0xHyd); // /Error  due  to H and y 
		//System . out . println(0xA7G9B); // Error  due  to G 
		//System . out . println(A7B9); // Error:  No prefix  0X
	}
}


/*	
Conversion  of   hexa  decimal  number  to  decimal  number
--------------------------------------------------------------------
	4096   256   16   1  --->  Weights
      A        7      B    9   --->  10 * 4096 + 7 * 256 + 11 * 16 + 9 * 1
*/
