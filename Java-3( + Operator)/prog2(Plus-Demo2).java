// Find  outputs  (Home  work)
class  prog2 
{
    public  static  void  main(String[]  args) 
	{
        String  a = "Hyd";
        int  b = 10, c = 20, d = 30; 
        System . out . println(a + b + c + d); // "Hyd" + 10 + 20 + 30 = "Hyd10" + 20 + 30 = "Hyd1020" + 30 = "Hyd102030"
        System . out . println(b + a + c + d); // 10 + "Hyd" + 20 + 30 = "10Hyd" + 20 + 30 = "10Hyd20" + 30 = "10Hyd2030"
        System . out . println(b + c + a + d); //  10 + 20 + "Hyd" + 30 = 30 + "Hyd" + 30 = "30Hyd" + 30 = "30Hyd30"
        System . out . println(b + c + d + a); //  10 + 20 + 30 + "Hyd" = 30 + 30 + "Hyd" = 60 + "Hyd" = "60Hyd"
    }
}
