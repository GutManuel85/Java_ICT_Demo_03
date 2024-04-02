package bookLibrary;

public class Main {

    public static void main(String[] args) {

        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.addBook(new Book("Anna und Elsa", "Chris Buck", "ABCD1234", 3));
        bookLibrary.addBook(new Book("Flapper", "SRF", "UIOD2345", 2));
        bookLibrary.addBook((new Book("Pompon", "SRF", "RITA3456", 1)));
        bookLibrary.addBook((new Book("Paw Patrol", "Keith Chapman", "PAW1234", 2)));
        bookLibrary.lendBook("PAW1234");
        bookLibrary.takeBack("NOTFROMHERE");
        bookLibrary.createBookReport();
        bookLibrary.takeBack("PAW1234");
        bookLibrary.takeBack("PAW1234");
        bookLibrary.createBookReport();

    }
}
