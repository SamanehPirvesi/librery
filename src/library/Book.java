package library;

public class Book {
	private String titleBook;
	private String autherName;

	public Book(String titleBook) {
		super();
		this.titleBook = titleBook;
		//this.autherName = autherName;
	}

	public String getTitleBook() {
		return titleBook;
	}

	public void setTitleBook(String titleBook) {
		this.titleBook = titleBook;
	}

	public String getAutherName() {
		return autherName;
	}

	public void setAutherName(String autherName) {
		this.autherName = autherName;
	}

}
