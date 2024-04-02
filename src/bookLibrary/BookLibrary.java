package bookLibrary;

import java.util.HashMap;
import java.util.Map;

public class BookLibrary {

    private final Map<String, Book> books;

    public BookLibrary() {
        books = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getIBAN(), book);
    }

    public boolean lendBook(String IBAN) {
        Book foundBook = books.get(IBAN);
        if (foundBook == null) {
            return false;
        } else {
            int availableExemplars = foundBook.getExemplarAvailableAmount();
            if (availableExemplars > 0) {
                foundBook.setExemplarAvailableAmount(availableExemplars-1);
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean takeBack(String IBAN) {
        Book book = books.get(IBAN);
        if(book == null){
            System.out.println("Achtung: Buch gibt es nicht in unserer Bibliothek");
            return false;
        }else if(book.getExemplarAvailableAmount() < book.getExemplarTotalAmount()){
            book.setExemplarAvailableAmount(book.getExemplarAvailableAmount() + 1);
            return true;
        }else{
            System.out.println("Achtung: Wir haben dieses Buch nicht verliehen.");
            return false;
        }
    }

    public void createBookReport() {
        System.out.println("*********** Start Buch-Report ***********");
        for (Book book : this.books.values()) {
            System.out.println(book);
        }
        System.out.println("*********** Ende Buch-Report ***********");
    }
}
