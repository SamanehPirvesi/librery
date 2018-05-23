package library;

import java.io.*;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Book b1=new Book ("aa ", "bb");
		// Book b2=new Book ("cc ", "dd");

		Liabrary l = new Liabrary("xx", "zz");
		// l.addBook(b1);
		// l.addBook(b2);
		// for (Book b: l.getListOfBook()) {
		// System.out.println(b.getTitleBook());
		// }

		try {
			FileReader fr = new FileReader("E:\\book.txt");
			BufferedReader br = new BufferedReader(fr);
			String bookDetail;
			while ((bookDetail=br.readLine()) != null) {
				Book b1 = new Book();
				String[] bookVars = bookDetail.split(":"); 
                b1.setAutherName(bookVars[0]);
       

				l.addBook(b1);
				
			}

			br.close();
			

		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

		for (Book b : l.getListOfBook()) {
			System.out.println(b.getAutherName());
		}

	}
}