
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    public String name;
    public LocalDate birthday;
    public ArrayList<Book> books;

    User(String name, String birthday) {
        this.books = new ArrayList<>();
        this.name = name;
        this.birthday = LocalDate.parse(birthday);

    }

    public void borrow(Book book){
        this.books.add(book);
    }

    public int age() {
        Period age = Period.between(this.birthday, LocalDate.now());

        return age.getYears();
    }
}