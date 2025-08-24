public class Book {
   private String title; 
   private String author;
   private String isbn;
   private int publicationYear;
   private int stock;
   Book(String title, String author, String isbn, int year, int stock) {
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.publicationYear = year;
    this.stock = stock;
   }
   public String getTitle() { return title; }
   public void setTitle(String title) { this.title = title; }
   public String getAuthor() { return author; }
   public void setAuthor(String author) { this.author = author; }
   public String getIsbn() { return isbn; }
   public void setIsbn(String isbn) { this.isbn = isbn; }
   public int getPublicationYear() { return publicationYear; }
   public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }
   public boolean isAvailable() { return stock > 0 ? true : false; }
}
