// Factory  method
class  c1
{
	public  static  c1   m1()
	{
		c1 obj = new c1();   // How to create c1 class object 
               System.out.println("Hash code inside m1(): " + obj.hashCode());	 // print its hash code and return the object	
	}
}
class  prog3b
{
	public  static  void  main(String[]  args)
	{
		c1 ref = c1.m1();    // How to call m1() method  (classname.methodname)
		 System.out.println("Hash code in main(): " + ref.hashCode());   // How to print the hash code of object created in m1() method
	}
}