import java.util.Scanner;
public class invoiceTest {
	
	public static void main (String [] argz){
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Input Part Number: \n");
		String myPartNumber = input.nextLine();
		
		System.out.println("Input Part Description: \n");
		String myPartDescription = input.nextLine();
		
		System.out.println("Input Item Quantity: \n");
		int myItemQuantity = input.nextInt();
		
		System.out.println("Input Price Per Item: \n");
		double myPricePerItem = input.nextInt();
		
		input.close();
		
		Invoice myInvoice = new Invoice (myPartNumber, myPartDescription,
				myItemQuantity, myPricePerItem);
		
		System.out.printf("Part Number: %s\nPart description: %s\n"
				+ "Item Quantity: %d\nPrice Per Item: $%.2f\nTotal Cost of Item: $%.2f",
				myInvoice.getPartNumber(), myInvoice.getPartDescription(), myInvoice.getItemQuantity(),
				myInvoice.getPricePerItem(), myInvoice.getInvoiceAmount());
		
		
	}

}
