package bookLibrary;

public class Book {

    private final String title;
    private final String Author;
    private final String IBAN;
    private final int exemplarTotalAmount;
    private int exemplarAvailableAmount;

    public Book(String title, String Author, String IBAN, int exemplarAmount) {
        this.title = title;
        this.Author = Author;
        this.IBAN = IBAN;
        this.exemplarTotalAmount = exemplarAmount;
        this.exemplarAvailableAmount = exemplarAmount;
    }

    @Override
    public java.lang.String toString() {
        return String.format("Title: %s | Autor: %s | IBAN %s | Anzahl total: %d | Anzahl verfügbarer : %d",
                this.title, this.Author, this.IBAN, this.exemplarTotalAmount, this.exemplarAvailableAmount);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getIBAN() {
        return IBAN;
    }

    public int getExemplarTotalAmount() {
        return exemplarTotalAmount;
    }

    public int getExemplarAvailableAmount() {
        return exemplarAvailableAmount;
    }

    public void setExemplarAvailableAmount(int exemplarAvailableAmount) {
        this.exemplarAvailableAmount = exemplarAvailableAmount;
    }
}
