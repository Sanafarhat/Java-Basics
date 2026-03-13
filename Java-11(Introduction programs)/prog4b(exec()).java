//  Executing  windows  exe  file  from  java  program
import  java . io . IOException;
@SuppressWarnings("deprecation")
class   prog4b
{
	public  static  void  main(String  args[])  throws  IOException
	{
		Runtime  r = Runtime . getRuntime();
		r . exec("notepad.exe"); // How  to  open  empty  notepad  
		r . exec("notepad  hw12.java"); //How  to  open  notepad  with  test.java  file
		r . exec("calc.exe");  //How  to  open  calculator
		r . exec("mspaint.exe"); //How  to  open  paint
		//Runtime  x = new   Runtime();  //  Error :  Runtime   class   object  can  not  be  created  due  to  private  constructor  in  Runtime  class
	}
}
