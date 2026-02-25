package model;

public class Book {
    
    // describe book

    private String title;
    private String writer;
    private boolean onLoan;

    // methods

    public Book(String title, String writer, boolean onLoan){
        this.title = title.toUpperCase();
        this.writer = writer.toUpperCase();
        this.onLoan = onLoan;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title.toUpperCase();
    }

    public String getWriter(){
        return this.writer;
    }

    public void setWriter(String writer){
        this.writer = writer.toUpperCase();
    }

    public boolean getOnLoan(){
        return this.onLoan;
    }

    public void setOnLoan(boolean onLoan){
        this.onLoan = onLoan;
    }

    public static boolean loan(Book[] bookList,String bookTitle){
        
        for (Book book : bookList) {

            if (book.getTitle().equals(bookTitle.trim()) && book.getOnLoan() != true) {
                book.setOnLoan(true);
                return true;
            }
        }
        
        return false;
    }

}
