package csc180.strings;
import java.util.*; 

public class Receipt { 
	private double total =0; 
	private Formatter f = new Formatter(System.out); 
	
		static int itemSpace = 15;
		static int qtySpace = 5; 
		static int priceSpace = 10;
		
	public void printTitle(){ 
		f.format("%"+-itemSpace+"s"+" %"+qtySpace+"s"+" %"+priceSpace+"s"+"\n","Item","Qty","Price"); 
		f.format("%"+-itemSpace+"s"+" %"+qtySpace+"s"+" %"+priceSpace+"s"+"\n", "----", "---", "-----"); 
	} 
	
	public void print(String name, int qty, double price){ 
		double nameSpace = 15.15d; 
		double priceSpace = 10.2d;
		f.format("%"+-nameSpace+"s"+" %"+qtySpace+"d"+" %"+priceSpace+"f"+"\n", name, qty, price); 
		total += price * qty;
	} 
	
	public void printTotal(){  
		double totalSpace = 10.2d;
		
		f.format("%"+-itemSpace+"s"+" %"+qtySpace+"s"+" %"+totalSpace+"f"+"\n", "Tax", "", total*0.06); 
		f.format("%"+-itemSpace+"s"+" %"+qtySpace+"s"+" %"+priceSpace+"s"+"\n", "", "", "-----"); 
		f.format("%"+-itemSpace+"s"+" %"+qtySpace+"s"+" %"+totalSpace+"f"+"\n", "Total", "", total*1.06);
	}

}
