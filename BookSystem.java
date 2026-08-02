// Practical 4: Library Book System

class Book {

    private int bookId;
    private String bookName;
    private String author;
    private boolean available;

    Book(int bookId, String bookName, String author, boolean available){
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.available = available;
    }
    public int getbookId(){
        return bookId;
    }
    public String getbookName(){
        return bookName;
    }
    public String getauthor(){
        return author;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setbookId(int bookId){
        this.bookId = bookId;
    }
    public void setbookName(String bookName){
        this.bookName = bookName;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
    public void issueBook() {
    if (available) {
        available = false;
        System.out.println("\nBook has been issued successfully.");
    } else {
        System.out.println("\nSorry! This book is already issued.");
    }
   }
    public void returnBook() {
    if (!available) {
        available = true;
        System.out.println("\nBook has been returned successfully.");
    } else {
        System.out.println("\nThis book is already available in the library.");
    }
}
    public void displayBook() {
     System.out.println("\n----- Book Details -----");
     System.out.println("Book ID      : " + bookId);
     System.out.println("Book Name    : " + bookName);
     System.out.println("Author       : " + author);
     System.out.println("Status       : " + (available ? "Available" : "Issued"));
     System.out.println("------------------------");
    }

}
    public class BookSystem {
        public static void main(String[] args) {
         Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", true);
         book1.displayBook();
         book1.issueBook();
         book1.displayBook();
         book1.returnBook();
         book1.displayBook();
    }

    }
    

    

