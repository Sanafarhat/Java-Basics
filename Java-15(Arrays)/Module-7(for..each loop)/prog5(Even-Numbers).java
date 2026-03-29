/*
Write  a  program  to   print  first  20  even  numbers

1) What  are  the  first  20  even  numbers ?  --->  2 , 4 , 6 ,  ...   40

2) What  is  printed  in  general ?  ---> 2 * i  where  'i'  varies  from   1  to  20
*/
class  prog5
{
	public  static  void  main(String[]  args)
	{
		System.out.println("First  20  even  numbers");
		for(int i = 1; i <= 20; i++ )
				System.out.println(2 * i); // How  to  print  first  20  even  numbers  with  regular  for  loop
		// How  to  print  first  20  even  numbers  with  for  each  loop  --->  Not  possible
	}
}


/*
1) What  can  for ... each  loop  do ?  --->  Iterates  thru  array , collection  and  enum

2) Can  for  each  loop  print  even  numbers , odd numbers , natural  numbers , fibonacci  series  and  so  on ?  --->  No
*/
