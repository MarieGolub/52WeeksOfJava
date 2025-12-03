import java.util.ArrayList;
import java.util.Comparator;

class Week4Project{
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers);
    }
}