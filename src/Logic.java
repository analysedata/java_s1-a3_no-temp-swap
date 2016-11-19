
public class Logic {

	public static void main(String[] args) {
		swapVariables();
	}	

	public static void swapVariables() {
		int a = 21;
		int b = 101;
		
		// Use math to logically work it out
		a = a + b;
		b = a - b;
		a = a - b;
		
		display("a: ", a);
		display("b: ", b);
	}

	// A method that prints the integer argument to the screen 
	public static void display(String msg, int x) {
		System.out.println(msg + x);
	}
}
