package by.it_academy.tr.obj;

import java.util.Objects;

public class Book 
{
	//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета. 
	private int id;
	private String name;
	private String autors;
	private String publisher;
	private int year;
	private int numberPages;
	private double price;
	private String binding;
 
	public Book(int id, String name, String autors, String publisher, int year, int numberPages, double price, String binding)
	{
		this.id = id;
		this.name = name;
		this.autors = autors;
		this.publisher = publisher;
		this.year = year;
		this.numberPages = numberPages;
		this.price = price;
		this.binding = binding;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAutors()
	{
		return autors;
	}

	public void setAutors(String autors)
	{
		this.autors = autors;
	}

	public String getPublisher() 
	{
		return publisher;
	}

	public void setPublisher(String publisher) 
	{
		this.publisher = publisher;
	}

	public int getYear() 
	{
		return year;
	}

	public void setYear(int year) 
	{
		this.year = year;
	}

	public int getNumberPages() 
	{
		return numberPages;
	}

	public void setNumberPages(int numberPages) 
	{
		this.numberPages = numberPages;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getBinding() 
	{
		return binding;
	}

	public void setBinding(String binding) 
	{
		this.binding = binding;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(autors, binding, id, name, numberPages, price, publisher, year);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(autors, other.autors) && Objects.equals(binding, other.binding) && id == other.id
				&& Objects.equals(name, other.name) && numberPages == other.numberPages
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(publisher, other.publisher) && year == other.year;
	}

	@Override
	public String toString() 
	{
		return "Book [id=" + id + ", name=" + name + ", autors=" + autors + ", publisher=" + publisher + ", year="
				+ year + ", numberPages=" + numberPages + ", price=" + price + ", binding=" + binding + "]";
	}
}
