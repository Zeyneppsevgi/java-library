package oopClass;


public class main {
	public static void main(String[] args) {
		book book= new book();
		book.setName("Savaþ ve Barýþ");
		book.setKind("roman");
		book.setPublisher("Tolstoy");
		book.setStockAmount(20);
		book.setYearOfPrinting(1995);
		
		
	
		bookManager bookManager=new bookManager();
		bookManager.Add(book);
		 System.out.println(book.getKod());
		
	}

}
