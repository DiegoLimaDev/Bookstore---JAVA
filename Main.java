class Main {
    public static void main(String[] args) {
        User user1 = new User("Davi", "2001-10-01");

        Book book1 = new Book("Lord of the rings: Complete Volume", "J.R.R. Tolkien", 724);

        user1.borrowBook(book1);

        System.out.printf("%s was born back in %s and now he is %d years old.\n", user1.getName(),
                user1.getBirthday(), user1.getAge());

        if (user1.getBorrowedBooks().size() == 1) {
            System.out.printf("%s has borrowed this book: %s\n", user1.getName(), user1.getBorrowedBooks());
        } else {
            System.out.printf("%s has borrowed these books: %s\n", user1.getName(), user1.getBorrowedBooks());
        }
    }
}