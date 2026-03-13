//  Which  of  the  following  are  valid ?
private  class  c1  //  Error :  No  private  class  in  java
{
}
protected  class  c2   //  Error :  No  protected  class  in  java
{
}
public  class  prog9  //  Valid :  java  supports   public  class
{
}
class  c3 //  Valid :  java  supports  default  class
{
}
default  class   c4  //  Error :   No default keyword
{
}


/*
1) Which  access  modifiers  are  permitted  for  variables ?  ---> private , protected , public  and  default

2) Which  access  modifiers  are  permitted  for  methods ?  --->  private , protected , public  and  default

3) Which  access  modifiers  are  permitted  for  classes ?  --->  public  and  default

4) Does  java  support  private  and  protected  classes ? ---> No

5) default  class  c4
    {
	}
	Is  the  above  class  valid ?  ---> No  becoz  there  is  no  default  keyword  
*/
