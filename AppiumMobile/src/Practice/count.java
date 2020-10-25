package Practice;

public class count 
{
    static int i;
	public count() 
	{
		i++;
	}
	public void counter()
	{
		System.out.println(i);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		count obj1=new count();
		count obj2=new count();
		count obj3=new count();
		count obj4=new count();
		count obj5=new count();
		count obj6=new count();
		obj2.counter();
		//obj1.counter();
	}

}
