package by.it_academy.tr.obj;

import java.util.ArrayList;
import java.util.List;

public class BookList
{
	private List<Book> list = new ArrayList<>();
 
	public BookList()
	{
  
	}
 
	public void bookAdd(Book b)
	{
		list.add(b);
	}
 
	public List<Book> getBooksByAutors(String autors) 
	{
		List<Book> bl1 = new ArrayList<>();
  
		for(int i = 0;i<list.size();i++)
		{
			Book b = list.get(i);
   
			if(b.getAutors().equals(autors)) 
			{
				bl1.add(b);
			}
		}
		return bl1;
	}
 
	public List<Book> getBooksByPublisher(String publisher) 
	{
		List<Book> bl2 = new ArrayList<>();
  
		for(int i = 0;i<list.size();i++)
		{
			Book b = list.get(i);
   
			if(b.getPublisher().equals(publisher)) 
			{
				bl2.add(b);
			}
		}
		return bl2;
	}
 
	public List<Book> getBooksAfterYear(int year) 
	{
		List<Book> bl3 = new ArrayList<>();
  
		for(int i = 0;i<list.size();i++)
		{
			Book b = list.get(i);
   
			if(b.getYear() > year) 
			{
				bl3.add(b);
			}
		}
		return bl3;
	}
 
}
