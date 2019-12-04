package cse360assign2;

public class main {
	
	public static void main(String args[]) {
		AddingMachine test1 = new AddingMachine();
		
		
		test1.add(5);
		test1.subtract(3);
		test1.add(6);
		test1.subtract(3);
		test1.subtract(3);
		test1.subtract(3);
		test1.add(6);
		test1.add(6);
		test1.add(6);
	
		
		System.out.println(test1.toString() + " = " + test1.getTotal());
		
		
		
		
		
		
		
	}

}
