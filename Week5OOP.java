class Week5OOP {
    public static void main(String[] args) {
        User user = new User("Marie", "2015-01-24");

        Book book = new Book();
        book.title = "The Poppy War";
        book.author = "R.F. Kuang";

        user.borrow(book);

        System.out.printf("%s was born in %s, they are now %d years old\n", user.name, user.birthday.toString(), user.age());

        System.out.printf("%s has borrowed these books: %s\n", user.name, user.books.toString());

    }
}