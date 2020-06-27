package com.wipro.abstraction_encapsulation;

public class Ex1 {
public static void main(String[] args) {
	Book b=new Book();
	b.setName("Java");
	b.setPrice(4000);
	b.setQtyInStock(28);
	System.out.println("Book name "+b.getName()+"\n"+"Book price "+b.getPrice()+" \n"+"Author details: "+b.getAuthor()+"\n"+"In Stock "+b.getQtyInStock());
}
	

}
