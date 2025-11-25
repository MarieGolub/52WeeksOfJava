//

import java.util.Arrays;

class Week3Project {
    public static void main(String[] args) {
        char vowels[] = {'e', 'a', 'u', 'i', 'o'};
        
        //int startindex = 1;
        //int endindex = 4;
        char key = 'x';

        //Arrays.sort(vowels, startindex, endindex);
        int keyindex = Arrays.binarySearch(vowels, key);

        System.out.println(Arrays.toString(vowels));
        System.out.println(keyindex);
    }
}