// byte  demo  program
class  prog1b 
{
	public  static  void  main(String[]  args) 
	{
		byte  x = 25; //  'x'  is  byte  variable  with  value  25
		System . out . println(x);  //  Value  of  'x'  i.e.  25
		System . out . println(Byte . SIZE); //  size  of   byte  i.e. 8  bits
		//Byte . SIZE++;   //  Error :  final  variable  can  not  be  modified
		System . out . println(Byte . MAX_VALUE);  //  max  value  of  byte  i.e.  2 ^ 7 - 1 = 127
		System . out . println(Byte . MIN_VALUE);  //  min  value  of  byte  i.e.  -2 ^ 7  =  -128
		//x = 128; //  Error :  byte  variable  can  not  hold  value  more  than  127
		//x = -129;  //  Error :  byte  variable  can  not  hold  value  less  than   -128
		//System  .  out  .  println(byte  .  SIZE);  //  Error :  byte  is  not  a  class
		//byte int y = 25;  //  Error :  No  datatype  byte  int
	}
}


/*
1) Why  are  SIZE , MAX_VALUE  and  MIN_VALUE   in  capital  letters ?  ---> Since  they  are  final  variables  of  Byte  class  

2) System . out . println(Byte . SIZE); 
	System . out . println(Byte . MAX_VALUE);
	System . out . println(Byte . MIN_VALUE);
    Why  is  classname  Byte  used  for  accessing  the  three  variables ?  ---> Since  they  are  static  variables  of  Byte  class 
*/
