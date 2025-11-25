//

import java.util.Arrays;

class Week3Project {
    public static void main(String[] args) {
        char vowels[] = {'e', 'a', 'u', 'i', 'o'};
        
        //int startindex = 1;
        //int endindex = 4;

        Arrays.fill(vowels, 'x');

        System.out.println(Arrays.toString(vowels));
    }
}