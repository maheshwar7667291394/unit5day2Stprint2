package question1;

public class Tiger extends Animal{

	public Tiger() throws AnimalException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() throws AnimalException {
	 System.out.println("tiger is eating!!");
		
	}
	
	public static void main(String[] args) {
		
	 try {
		Animal an=new Tiger();
		an.eat();
	} catch (AnimalException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
