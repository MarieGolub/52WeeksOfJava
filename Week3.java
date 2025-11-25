//Creates an array of characters based on user input and then prints a search value (if user wants to search)

import java.util.Scanner;
import java.util.Arrays;

class Week3Project {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of characters you want to store: ");
        int size = scanner.nextInt();

        char[] letters = new char[size];
        scanner.nextLine();

        System.out.println("Enter " + size + " characters:");
        for(int i = 0; i < size; i++){
            char inputChar = scanner.nextLine().charAt(0);
            letters[i] = inputChar;
        }

        System.out.print("Do you want to search for a character in the array? (Y/N): ");

        String response = scanner.nextLine();

        switch (response) {
            case "Y", "y" -> {
                System.out.print("Enter the character to search for: ");
                char searchChar = scanner.nextLine().charAt(0);
                boolean found = false;

                for (char letter : letters) {
                    if (letter == searchChar) {
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("Character '" + searchChar + "' found in the array at index " + Arrays.binarySearch(letters, searchChar));
                } else {
                    System.out.println("Character '" + searchChar + "' not found in the array.");
                }
            }
            case "N", "n" -> System.out.println("Search operation skipped.");
            default -> System.out.println("Invalid response. Please enter Y or N.");
        }
    }
}