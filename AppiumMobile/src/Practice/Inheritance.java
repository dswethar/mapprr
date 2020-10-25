package Practice;

public class Inheritance 
{

	public static void main(String[] args) 
	{
		A obj1=new B(8);
		
//		obj1.num1=4;
//		obj1.num2=2;
//		obj1.add();
//		System.out.println(obj1.result);
//		obj1.sub();
//		System.out.println(obj1.result);

	}

}
class A
{ 
	public A()
	{
		System.out.println("In A const");
	}
	public A(int i)
	{
		System.out.println("In A const int");
	}
//	int num1,num2,result;
//	public void add()
//	{
//		result=num1+num2;
//	}
}
class B extends A
{
	public B()
	{
		System.out.println("In B const");
	}
	public B(int i)
	{
		System.out.println("In B const int");
	}
//	public void sub()
//	{
//		result=num1-num2;
//	}
}