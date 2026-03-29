// Find   outputs
import  java . util . Arrays;
class  prog3c
{
	public  static  void  main(String[]  args)
	{
		String[]  a = {"Rama" , "Sita" , "Amar" , "Kiran" , "Rajesh" , "Manohar" , "Vamsi" , "Rama Rao"};
		System . out . println("Unsorted  Array : " + Arrays . toString(a)); //   [Rama , Sita , Amar , Kiran , Rajesh , Manohar , Vamsi ,  Rama Rao]
		Arrays.sort(a);// How  to  sort  array  'a'
		System . out . println("Sorted  Array : " + Arrays . toString(a)); //  [Amar , Kiran , Manohar , Rajesh  , Rama , Rama Rao  ,Sita , Vamsi]
	}
}
