import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "Davi";
        user1.birthday = LocalDate.parse("2001-10-01");

        Book book1 = new Book();
        book1.title = "Lord of the rings: Complete Volume";
        book1.author = "J.R.R. Tolkien";

        user1.borrowBook(book1);

        System.out.printf("%s was born back in %s and now he is %d years old.\n", user1.name,
                user1.birthday.toString(), user1.getAge());

        if (user1.books.size() == 1) {
            System.out.printf("%s has borrowed this book: %s", user1.name, user1.books.toString());
        } else {
            System.out.printf("%s has borrowed these books: %s", user1.name, user1.books.toString());
        }
    }
}