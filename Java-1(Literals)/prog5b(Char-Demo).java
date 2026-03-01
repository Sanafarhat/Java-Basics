//  char  demo  program
class  prog5b
{
	public  static  void  main(String[]  args)
	{
		char  ch =  'A';  //  ch  is  char  variable  with  value  'A'
		System . out . println(ch); //  Value  of  ch  i.e. A
		ch  = '7'; //  ch  is  '7'  replacing  'A'
		System . out . println(ch); //  Value  of  ch  i.e.  7
		ch = '$';  //  ch  is  '$'  replacing  '7'
		System . out . println(ch);  //  Value  of  ch  i.e.  $
		ch  = 'a';  //  ch  is  'a'  replacing  '$'
		System . out . println(ch);   //  Value  of  ch  i.e.  a
		//ch = 'Hyd'; // Error:  More than  one  character  is  not  permitted  in   single quotes
		//ch = "A"; // Error:  char  variable  can  not  hold  string
		//ch = '';  // Error:    Less than  one  character  is  not  permitted  in   single quotes
	}
}
