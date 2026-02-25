import model.Book;

public class Main {
    
    public static void main(String[] args) {
        
        Book secondBook = new Book("Animal farm", "George Orwell", true);
        Book firstBook = new Book("1984", "George Orwell", false);

        Book[] bookList = {firstBook, secondBook};

        System.out.println(Book.loan(bookList, "Animal farm"));

        // create book
        // list all
        // list by title
        // remove book
        // book to loan
        // give back book

    }

}
