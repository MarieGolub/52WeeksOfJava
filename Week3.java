//
import java.util.Arrays;

class Week3Project {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,};

        int copyofNumbers[] = Arrays.copyOf(numbers, numbers.length);

        System.out.println(Arrays.equals(numbers,copyofNumbers));
    }
}