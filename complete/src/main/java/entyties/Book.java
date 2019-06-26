package main.java.entyties;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String bookName;
    private String authorName;
    private int dateEdition;

    public Book(String bookName, String authorName, int dateEdition) {

        this.bookName = bookName;
        this.authorName = authorName;
        this.dateEdition = dateEdition;

    }

    public Book() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getDateEdition() {
        return dateEdition;
    }

    public void setDateEdition(int dateEdition) {
        this.dateEdition = dateEdition;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", dateEdition=" + dateEdition +
                '}';
    }
}
