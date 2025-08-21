import java.util.ArrayList;

public class Library {
   private String name;
   private String address;
   private ArrayList<Book> books;
   Library(String name, String address) {
    this.name = name;
    this.address = address;
    // create ArrayList
    books = new ArrayList<Book>();
   }
   void setName(String name) { this.name = name; }
   String getName() { return name; }
   void setAddress(String address) { this.address = address; }
   String getAddress() { return address; }
   void addBook(Book b) {
    books.add(b);
   }
   void showAllBooks() {
        for(Book book : books) {
            System.out.println(book.getTitle() + "\t" + book.getAuthor());
        }
   }
}
