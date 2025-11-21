import java.util.Arrays;

class Week3Project {
    public static void main(String[] args) {
        char vowels[] = {'e', 'a', 'u', 'i', 'o'};
        
        int startindex = 1;
        int endindex = 4;
        char key = 'a';

        //Arrays.sort(vowels, startindex, endindex);
        int keyindex = Arrays.binarySearch(vowels, startindex, endindex, key);

        System.out.println(Arrays.toString(vowels));
        System.out.println(keyindex);
    }
}