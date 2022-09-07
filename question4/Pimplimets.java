package question4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Pimplimets {

	
		public static void main(String[] args) {
			
			
			PrintList p=( city)->{
				for(String s:city) {
					System.out.println(s);
				}
				Collections.sort(city,(s1,s2)-> s1.compareTo(s2)>1 ?1:-1);
				System.out.println(city);
				
		
				
			};
			
			List<String> city=Arrays.asList("madhepur","sultanpur","patna","aajamgarh","manipur");
			p.display(city);
					
		}
	

}
