package question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		List<Product> pd=new ArrayList<>();
		
	   pd.add(new Product(2,"tshirt",3,2000));
	   pd.add(new Product(1,"zins",1,1000));
	   pd.add(new Product(3,"googles",23,2700));
	   pd.add(new Product(5, "mango",34,100));
	   pd.add(new Product(4, "banana",1, 40));
	   for(Product item:pd) {
		   System.out.println(item);
	   }
	   System.out.println("----------------------------------------------------");
	   
	   Collections.sort(pd,(s1,s2)-> s1.getPrice()>s2.getPrice() ? -1:1);
	   for(Product item:pd) {
		   System.out.println(item);
	   }
	}

}
