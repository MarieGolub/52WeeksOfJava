
import java.time.LocalDate;

class HelloWorld {
    public static void main(String[] args) {
        User user = new User();

        user.name = "Marie";
        user.birthday = LocalDate.parse("2015-01-24");

        Book book = new Book();
        book.title = "The Poppy War";
        book.author = "R.F. Kuang";

        user.borrow(book);

        System.out.printf("%s was born in %s, they are now %d years old", user.name, user.birthday.toString(), user.age());


    }
}