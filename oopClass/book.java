package oopClass;

public class book {
	private String name;
	private String kind;
	private String publisher;
	private int stockAmount;
	private int yearOfPrinting;
	private String kod;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public int getYearOfPrinting() {
		return yearOfPrinting;
	}
	public void setYearOfPrinting(int yearOfPrinting) {
		this.yearOfPrinting = yearOfPrinting;
	}
	public String getKod() {
		return this.name.substring(0,2)+ kind;
	}
	
	
	
	



}
