import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    public String name;
    public LocalDate birthday;
    public ArrayList<Book> books = new ArrayList<Book>();

    public int getAge() {
        Period age = Period.between(this.birthday, LocalDate.now());

        return age.getYears();
    }

    public void borrowBook(Book book) {
        this.books.add(book);
    }

}
