package java8;

 interface Stringeg {
	public String text(String str);
}
  public class String1{
 
	 public static String main(String[] args)
	 {
		Stringeg c= new Stringeg()
				{
			@Override
			public String text(String str)
			{
				return "welcome to stg";
				}
				};
			System.out.println(c.text("a"));
			return null;
			
				
			
				
	 }
 
  }
  
