package by.it_academy.tr.obj;

import java.util.List;

public class Main 
{
	public static void main(String[] args)
	{ 
		BookList bl = new BookList();
  
		bl.bookAdd(new Book(123,"Мастер и Маргарита","Михаил Булгаков","Азбука", 1937, 504, 23.5, "Мягкий переплет"));
		bl.bookAdd(new Book(123,"Мастер и Маргарита2","Михаил Булгаков","Азбука", 1937, 504, 23.5, "Мягкий переплет"));
  
		List<Book> books = bl.getBooksByAutors("Михаил Булгаков");
		for(Book b:books) 
		{
			System.out.println(b.getName());
		}
  
		books = bl.getBooksByPublisher("Азбука");
		for(Book b:books) 
		{
			System.out.println(b.getName());
		}
  
		books = bl.getBooksAfterYear(1935);
		for(Book b:books) 
		{
			System.out.println(b.getName());
		} 
	}

}
