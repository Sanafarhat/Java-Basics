// Find  outputs
class   prog2
{
	public  static  void  main(String[]  args)
	{
		char[]  a  =  {'R' , 'A' , 'M' , 'A'};
		int[]  b = {10 , 20 , 15 , 18};
		System . out . println(a); //  println(char[])  prints  "RAMA"
		System . out . println(b); // toString() method   prints  [I@hexa-decimal-hashcode-of-array 
		System . out . println(b . toString());  // toString() method   prints  [I@hexa-decimal-hashcode-of-array 
		System . out . println(a . toString()); // toString() method   prints  [C@hexa-decimal-hashcode-of-array 
	}
}


/*
1) char[]  a  =  {'R' , 'A' , 'M' , 'A'};
   System . out . println(a);
   Why  is  toString()  method  not  executed ?  ---> Since  there  is  already  println(char[])  method  in  PrintStream  class
   
2) What  does  println(char[])  method  do ? --->  Concatenates  all  the  characters  of  char  array  and   prints  the  string

3) int[]  b = {10 , 20 , 15 , 18};
   System . out . println(b);
   Is  toString()  method  executed ?  ---> Yes  becoz  there  is  no  println(int[])  method  in  PrintStream  class
    
4) What  does  toString()  method  do ? ---> Returns  classname@hexa-decimal-hashcode																		
*/
