// Jagged  array  (or)  Array  of  arrays
class  prog1
{
	public  static void  main(String[]  args)
	{
		int[][] a =  new  int  [3][]; //  Array  of  3  null's
		a[0] = new  int  [2];  //  1st  row  with  two  zeroes
		a[1] = new  int  [3];   //  2nd  row  with  three  zeroes
		a[2] = new  int  [4];   //  3rd  row  with  four  zeroes
		System . out . println(a[0].length); //  2 : Number   of   elements  in  1st  row
		System . out . println(a[1].length);  //  3 : Number   of   elements  in  2nd  row
		System . out . println(a[2].length);  // 4 : Number   of   elements  in  3rd  row
		System . out . println(a.length); // 3 : Number   of   rows
	}
}


/*
int[]  a = new  int  [3];
int[][]  b = new  int  [3][4];
int[][]  c = new  int  [3][];
What  is  the  difference  between  the  three  statements ?  --->  'a'  is  1 - d  array  with  three  zeroes,
																										  'b'  is   2 - d  array  with  12  zeroes
																										  'c'  is  1 - d  array   with  three  null's
*/
