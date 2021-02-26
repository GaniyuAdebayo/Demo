
public class Invoice {
	
	private String partNumber;
	private String partDescription;
	private int itemQuantity;
	private double pricePerItem;
	
	public Invoice (String partNumber, String partDescription,
			int itemQuantity, double pricePerItem){
		
		if (itemQuantity < 0)
			
			itemQuantity = 0;
		if (pricePerItem < 0)
			
			pricePerItem = 0.0;
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.itemQuantity = itemQuantity;
		this.pricePerItem = pricePerItem;
	}
	
	public void setPartNumber(String partNumber){
		
		this.partNumber = partNumber;
	}
	
	public String getPartNumber(){
		
		return partNumber;
	}
	
	public void setPartDescription(String partDescription){
		
		this.partDescription = partDescription;
	}
	
	public String getPartDescription(){
		
		return partDescription;
	}
	
	public void setItemQuantity(int itemQuantity){
		
		if (itemQuantity < 0)
			
			itemQuantity = 0;
		
		this.itemQuantity = itemQuantity;
	}
	
	public int getItemQuantity(){
		
		return itemQuantity;
	}
	
	public void setPricePerItem(int pricePerItem){
		
		if (pricePerItem < 0)
			
			pricePerItem = 0;
		
		this.pricePerItem = pricePerItem;
	}
	
	public double getPricePerItem(){
		
		return pricePerItem;
	}
	
	public double getInvoiceAmount(){
		
		double result = itemQuantity * pricePerItem;
		
		return result;
		
	}

}
