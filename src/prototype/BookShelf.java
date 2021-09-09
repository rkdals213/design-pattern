package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShelf {
    private List<Book> shelf;

    public BookShelf() {
        shelf = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        shelf.add(book);
    }

    @Override
    protected Object clone() {
        BookShelf another = new BookShelf();
        for (Book book : shelf) {
            another.addBook(new Book(book.getAuthor(), book.getTitle()));
        }

        return another;
    }

    public List<Book> getShelf() {
        return shelf;
    }

    public void setShelf(List<Book> shelf) {
        this.shelf = shelf;
    }

    public String toString() {
        return shelf.toString();
    }
}
