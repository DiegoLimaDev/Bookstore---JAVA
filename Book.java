public class Book {
    private String title;
    private String author;
    private int pageCounter;

    Book(String title, String author, int pageCounter) {
        this.title = title;
        this.author = author;
        this.pageCounter = pageCounter;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPageCounter() {
        return this.pageCounter;
    }

    public String toString() {
        return String.format("%s written by %s", this.title, this.author);
    }
}