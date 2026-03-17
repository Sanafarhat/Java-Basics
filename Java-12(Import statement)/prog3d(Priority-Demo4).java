// What  is  the  issue  when  both  are  explicit  static  import ?
import  static  java . lang . Integer . MAX_VALUE;  //  Valid
import  static  java . lang . Double . MAX_VALUE;   //  Valid
class  prog3d
{
	public  static  void  main(String[]  args)
	{
		System . out . println(MAX_VALUE); //  Ambiguity  error :  Confusion  whether  to  print  MAX_VALUE   of  Integer  class  (or)  MAX_VALUE  of  Double  class
	}
}
