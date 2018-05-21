package library;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1=new Book ("aa  ", "bb");
		Book b2=new Book ("cc  ", "dd");		 
	
	Liabrary l= new Liabrary ("xx", "zz");
	l.addBook(b1);
	
	l.addBook(b2);
	 
	for (Book b: l.getListOfBook()) {
		System.out.println(b.getTitleBook());
	}


}
}