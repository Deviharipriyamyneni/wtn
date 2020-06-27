package com.wipro.abstraction_encapsulation;

class Book
{
	private String name;
	private Author author = new Author("abc","abc@gmail.com",'M');
	 private double price;
	 private int qtyInStock;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return ("\nAuthor name: "+author.name+"\nemail "+author.email+"\nGender "+author.gender);
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyInStock() {
		return qtyInStock;
	}
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	} 
}
