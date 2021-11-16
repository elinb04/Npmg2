import java.util.concurrent.TimeoutException;

public class book {
	String publisher;
    String isbn;
    String title;
    String autor;

    public book(String title, String autor, String publisher, String isbn){
        this.title = title;
        this.autor = autor;
        this.publisher = publisher;
        this.isbn = isbn;
    }
    public book()
    {
 
        this.title = "dom";
        this.autor = "Someone";
        this.publisher = "Trd";
        this.isbn = "***";
    }
    public String getIsbn(){
        return isbn;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getAutor(){
        return autor;
    }
    public String getTitle(){
        return title;
    }
    public String toString(){
        return String.format("%s, %s, %s, %s", getAutor(), getTitle(), getPublisher(), getIsbn());
    }
}