package prototype;

public class App {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook(new Book("orange", "Tomas"));
        bookShelf.addBook(new Book("apple", "James"));
        bookShelf.addBook(new Book("grape", "Edward"));

        BookShelf another = (BookShelf) bookShelf.clone();

        System.out.println(bookShelf);
        System.out.println(another);

        bookShelf.getShelf()
                .get(0)
                .setAuthor("Mango");

        bookShelf.getShelf()
                .get(0)
                .setTitle("Jane");

        System.out.println(bookShelf);
        System.out.println(another);
    }
}
