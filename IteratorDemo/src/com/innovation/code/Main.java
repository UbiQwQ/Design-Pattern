package com.innovation.code;
/*
 * @author Innovation
 */
public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(4);
		bookShelf.appendBook(new Book("The Crowd： A Study of the Popular Mind"));
		bookShelf.appendBook(new Book("Steve Jobs:A Biography"));
		bookShelf.appendBook(new Book("Hackers & Painters: Big Ideas from the Computer Age"));
		bookShelf.appendBook(new Book("Thinking in Java"));
		Iterator it = bookShelf.iterator();
		while(it.hasNext()){
			Book book = (Book) it.next();
			System.out.println(book.getName());
		}
		
		
	}

}
