package Entity;

public class Book {
   private int id;
   private String name;
   private String isbn;
   private String author;
   private int stock;
   
   public Book() {
	// TODO Auto-generated constructor stub
}
	public Book(int id, String name, String isbn, String author, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.stock = stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStock() {
		return stock;
	}         
}
