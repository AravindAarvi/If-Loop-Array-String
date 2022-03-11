package whileLoop;

public class Factorial {

	public static void main(String[] args) {
		//Initialization
		int range=6, fact=1;
		//for condition
		for (int i = 1; i <=range; i++) {
			//step for multiplication
			fact=fact*i;
			
		}
		//print statement
		System.out.println(fact);
	}

}
