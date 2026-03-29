//  Array  of  characters  demo  program
class   prog1
{
	public  static  void  main(String  args[])
	{
		char[]  a  =  new  char[4]; // Creates  a  character  array  with  four  \0's
		System . out . println(a . length); // 4
		for(int  i = 0 ; i <= a . length - 1 ; i++)
		{
			System . out . println(a[i]);  // Nothing :  '\0'  is  a  non-printable  char
			System . out . println((int)a[i]); //  Unicode value of '\0'  is  0
		}
		char[]   b  = new  char  []  {'H' , 'y' , 'd'};  // Creates  a  character  array  with  'H' , 'y' , 'd'
		System . out . println(b . length);  // 3
		for(int  i = 0 ; i <= b . length - 1 ; i++) 
				System . out . println(b[i]); // H <nextline> y <nextline> d  <nextline>
		char[]  c = {'S' , 'e' , 'c'};   // Creates  a  character  array  with  'S' , 'e' , 'c'
		System . out . println(c); // println(char[])  prints  "Sec"
		System . out . println(c . getClass() . getName()); // classname of  array  'c'   i.e. [C
		System . out . println(c . hashCode()); //  hash  code  of  array   'c'
	}
}


/*
4
Nothing
0
Nothing
0
Nothing
0
Nothing
0
3
H
y
d
Sec
[C
Hash  code  of  array  'c'
*/
