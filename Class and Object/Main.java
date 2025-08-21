public class Main {
   public static void main(String[] args) {
        Library library = new Library("Bidya Niketon", "Mirpur 11, Lane: 11, Road: 10, Dhaka");
        Book book1 = new Book("C Programming", "Balagurusamy", "302xx", 2025, 10);
        library.addBook(book1);
        Book book2 = new Book("C Programming Lab", "Balagurusamy", "303xx", 2025, 10);
        library.addBook(book2);
        library.showAllBooks();
   } 
}
