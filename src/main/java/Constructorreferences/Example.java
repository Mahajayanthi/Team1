package Constructorreferences;
interface Robo
{
	Bike getBike(String str);
}
class Bike {
	  Bike(String str)
	{
		{
			System.out.println(str);
		}	
	}
}
public class Example {
	public static void main(String[] args)
	{
	Robo a=Bike::new;
	a.getBike("welcome to hero honda");
	
}
}
