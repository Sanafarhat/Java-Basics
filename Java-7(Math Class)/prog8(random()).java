// random()  method  demo  program
class  prog8 
{
	public  static  void  main(String[]  args)
	{
		System . out . println(Math . random());  //  Any  random  number  between  0 (inclusive)  and   1 (exclusive)  i.e.  May  be  0.5 
		System . out . println((int)(Math . random() * 100 + 1));   //  Any  random  number  between  1  and   100  i.e.  May  be   72
		System . out . println((int)(Math . random() * 401 + 100));  //  Any  random  number  between  100  and   500  i.e.  May  be   248
		System . out . println((int)(Math.random() * 301 + 1200)); //  Any  random  number  between  1200  and   1500  i.e.  May  be   1248
		System . out . println((int)(Math.random() * 6 + 1)); // Any  random  number  between  1  and   6  i.e.  May  be   3
		System . out . println((int)(Math.random() * 4));  // Any  random  number  between  0  and   3  i.e.  May  be   1
		System . out . println((char)(Math.random() * 26 + 65)); // Any  random  character  between  'A'  and   'Z'  i.e.  May  be   'S'
		System . out . println((char)(Math.random() * 26 + 97)); // Any  random  character  between  'a'  and   'z'  i.e.  May  be   'S'
		System . out . println((char)(Math.random() * 26 + 65) + "");  //  Any  random  string  between  "A"  and  "Z"   i.e.  May  be   K"
	}
} 


/*
random()  method
--------------------
How  to   obtain  a  random  number  between  x  and  y  --->  (int)(Math . random() *  (y - x + 1) + x)
*/																							
