package library;

import java.util.ArrayList;
import java.util.List;

public class Liabrary {

	private String name;
	private String address;
	private List<Book> listOfBook = new ArrayList<>();

	public Liabrary(String name, String address) {

		this.name = name;
		this.address = address;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public List<Book> getListOfBook() {
		return listOfBook;
	}



	public void setListOfBook(List<Book> listOfBook) {
		this.listOfBook = listOfBook;
	}



	public void addBook(Book b) {
		this.listOfBook.add(b);
	}
}
