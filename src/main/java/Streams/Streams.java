package Streams;

import java.awt.List;
import java.util.ArrayList;
import java.util.Optional;

public class Streams {
	public static void main(String[] args)
	{
		ArrayList<Integer> c=new ArrayList<>();
		c.add(1);
		c.add(7);
		c.add(10);
		c.add(18);
		c.add(14);
		c.add(7);
		c.add(10);
		
		/*
		 * Optional <Integer>max = c.stream().max((a,b)->a.compareTo(b));
		 * if(max.isPresent()) System.out.println(max.get());
		 */
			
		/*
		 * Optional <Integer> min=c.stream().min((a,b)->a.compareTo(b));
		 * if(min.isPresent()) System.out.println(min.get());
		 * 
		 */
			  c.stream().filter(a->a>5).filter(a->a%2==0).sorted(). forEach(a->
			  System.out.println(a));
			  
			  c.stream().filter(a->a>5).filter(a->a%2!=0).sorted().forEach(a->{System.out.
			  println(a); });
			  c.stream().filter(a->a>=5).filter(a->a%2==0).map(a->a+2).sorted().forEach(a->{System.out.println(a);});
		System.out.println(" hi team");
			 
		  }
		 


			

		 
}

	
	


