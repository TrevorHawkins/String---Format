package csc180.strings;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Receipt receipt = new Receipt(); 
		
		receipt.printTitle();  
		receipt.print("Jack's Magic Beans", 4, 4.25);  
		receipt.print("Princess Peas", 3, 5.1);  
		receipt.print("Three Bears Porridge", 1, 14.29);    
		receipt.printTotal();
	}

}
