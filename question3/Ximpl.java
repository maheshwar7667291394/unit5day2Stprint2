package question3;

public class Ximpl implements X {

	@Override
	public int convetStringToNumber(String s) {
		int x=Integer.parseInt(s);
		return x;
	}
	
	public static void main(String[] args) {
	  
		X x=new Ximpl();
		int result=x.convetStringToNumber("123");
		System.out.println(result);
		
	}

}
