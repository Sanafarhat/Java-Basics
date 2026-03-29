// Find  outputs
class  prog2b
{
	public static void main(String[] args)
	{
		int[]  a =  new  int  []  {10 , 20 , 15 , 18};  // Creates  an  array  with  four  elements  i.e. 10, 20, 15, 18
		System . out . println("Array  a");
		for(int i = 0; i < a . length ; i++)  //How  to  print  elements  of  array  'a'  with  for  loop
			System.out.println(a[i]); // 10  <next  line> 20   <next  line>  15   <next  line>  18  <next  line>
		//a =  new  int  [4]  {10 , 20 , 15 , 18}; // Error : dimension  is  not  permitted  when  array  is  being  initialized
		int[]  b =  {10 , 20 , 15 , 18}; //  Valid :  new  is  optional
		System . out . println("Array  b"); 
		for(int i = 0; i < b . length ; i++)   // How  to  print  elements  of  array  'b'  with  for  loop
			System.out.println(b[i]);  // 10  <next  line> 20   <next  line>  15   <next  line>  18  <next  line>
	}
}


/*
What  is  difference  between  a[i]  and  i ?  --->   a[i]  is  each  element  of  array  and  'i'  is  index  of  each  element
*/
