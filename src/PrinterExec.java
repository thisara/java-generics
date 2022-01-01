
public class PrinterExec {

	public static void main(String args[]) {
		
		/**
		 * Avoid the need to create multiple classes for int long and string. Reduce boilerplate code.
		 * Type safety for the collection objects
		 */
		Printer<Integer> intPrinter = new Printer<>(50);
		intPrinter.print();
		
		Printer<Double> doublePrinter = new Printer<>(50.5d);
		doublePrinter.print();
		
		Printer<String> stringPrinter = new Printer<>("This is String");
		stringPrinter.print();
		
		display("Test");
	}
	
	/*
	 * 
	 */
	private static <T> void display(T t) {
		System.out.println(t);
	}
}
