//
import java.util.Arrays;

class Week3Project {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,};

        int copyofNumbers[] = Arrays.copyOf(numbers, numbers.length);

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyofNumbers));
    }
}