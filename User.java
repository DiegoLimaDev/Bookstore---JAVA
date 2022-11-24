import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthday;
    private ArrayList<Book> books = new ArrayList<Book>();

    User(String name, String birthday) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
    }

    public int getAge() {
        Period age = Period.between(this.birthday, LocalDate.now());

        return age.getYears();
    }

    public void borrowBook(Book book) {
        this.books.add(book);
    }

    public String getName() {
        return this.name;
    }

    public String getBirthday() {
        return this.birthday.toString();
    }

    public ArrayList<Book> getBorrowedBooks() {
        return this.books;
    }

}
