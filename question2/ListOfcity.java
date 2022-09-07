package question2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListOfcity {
	
	public static void main(String[] args) {
	  List<String> city=Arrays.asList("patna","delhi","jaipur","darbhanga","madhubani");
	  
	   Collections.sort(city,(s1,s2)-> s1.compareTo(s2)>1? 1:-1);
	   System.out.println(city);
	  
	}

}
