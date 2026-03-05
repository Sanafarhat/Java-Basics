// Find  outputs (Home  work)
class  prog2b 
{
	public  static  void  main(String[]  args)
	{
		short  x = 10000;  //  'x'  is  short  variable  with  value  10000
		System . out . println(x); //Value  of  'x'  i.e.  10000
		System . out . println(Short . SIZE); //  size  of   short  i.e. 16  bits
		System . out . println(Short . MAX_VALUE); // max  value  of  short  i.e.  2 ^ 15 - 1 = 32767
		System . out . println(Short . MIN_VALUE); // min  value  of  short  i.e.  -2 ^ 15 = -32768
		//x = 32768; // Error :  short variable  can  not  hold  value  more  than  32767
		//x = -32769; //Error :  short  variable  can  not  hold  value  less  than  -32768
		//System . out . println(short . MAX_VALUE); // Error :  short  is  not  a  class
		//short  int  y  =  25; // Error :  No  datatype  short int
	}
}


/*
What  are  SIZE , MAX_VALUE  and  MIN_VALUE  called ? --->  final   static  variables  of  Short  class
*/
