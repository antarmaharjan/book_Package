package book_package;

public class Book {
	public String title;
	public String author;
	public String descr;
	public double price;	
	public String sku;

	public Book(String sku, String title, String author, String descr, double price) {
		this.title = title;
		this.author = author;		
		this.descr = descr;
		this.price = price;
		this.sku = sku;
	}
	//Apllying the getters and setters method
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setInfo(String info) {
		this.descr = info;
	}
	public String getInfo() {
		return descr;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

	public String getSku() {
		return this.sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}

	public String toString() {
		//This will return details on the base of Sku
		return ("Your deired books details :-"+'\n'+"SKU:-" +this.sku +","+" Title: "  +  this.title+"," + " Author:"+ this.author +"," + '\n' +"Description: " + this.descr + "," + "Price:"+"$"+
				+ this.price);
		
		
	}

}



