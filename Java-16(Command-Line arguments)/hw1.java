/*
Write  a  program  to  print  employee  data  passed  from  command  line
1) java  emp   25    "Rama  Rao"   10000.0     m     true
    What  are  the  outputs ?  --->  Print  all  the  inputs
 
2) java  emp
    What  is  the  output ?  ---> Pls  send  inputs
*/
class  emp
{
	int  empno;
	String  ename;
	double  sal;
	char  gender;
	boolean  married;
	public  static  void  main(String[]   args)
	{
		emp a = new emp(); // How  to  create  emp  class  object  'a'
		a.empno = Integer.parseInt(args[0]); // How  to  copy  1st  input  from  args  array  to  object  'a'
		a.ename = args[1]; // How  to  copy  2nd  input  from  args  array  to  object  'a'
		a.sal = Double.parseDouble(args[2]); // How  to  copy  3rd  input  from  args  array  to  object  'a'
		a.gender = args[3]; // How  to  copy  4th   input  from  args  array  to  object  a''
		a.married = Boolean.parseBoolean(args[4]); // How  to  copy  5th  input  from  args  array  to  object  'a'
		System . out . println("Emp  number :  " + a.empno);
		System . out . println("Emp  name :  " + a.ename);
		System . out . println("Salary : " + a.sal);
		System . out . println("Gender :  " + a.gender);
		System . out . println("Married : " + a.married);
	}
}