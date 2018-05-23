package library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1=new Book ("aa  ", "bb");
		Book b2=new Book ("cc  ", "dd");		 
	
	Liabrary l= new Liabrary ("xx", "zz");
	l.addBook(b1);
	
	l.addBook(b2);
	 
	for (Book b: l.getListOfBook()) {
		//System.out.println(b.getTitleBook());
	}

	try {
		FileReader fr=new FileReader("E:\\book.txt");
		BufferedReader br = new BufferedReader(fr);
		 int k;  
            while ((k = br.read()) != -1) {  
                System.out.print((char) k);  
            }  
            br.close(); 
	}catch
	(IOException ex)
	{
		System.out.println(ex.getMessage());
	}
	

}
}