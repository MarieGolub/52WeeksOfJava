import java.util.ArrayList;
import java.util.Scanner;

class Week4Project{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> grades = new ArrayList<>();

        System.out.println("How many grades would you like to enter? ");
        int gradenumber = scanner.nextInt();

        int i = 0;
        while (i < gradenumber){
            System.out.println("Enter grade: ");
            numbers.add(scanner.nextInt());
            i++;
        }

        for (Integer number : numbers) {
            if (number <= 100 && number >= 90){
                grades.add("A*");
            }
            else if (number < 90 && number >= 80){
                grades.add("A");
            }
            else if (number < 80 && number >= 70){
                grades.add("B");
            }
            else if (number < 70 && number >= 60){
                grades.add("C");
            }
            else if (number < 60 && number >= 50){
                grades.add("D");
            }
            else if (number < 50 && number >= 40){
                grades.add("E");
            }
            else {
                grades.add("F");
            }
        }

        for (int j = 0; j < numbers.size(); j++){
            System.out.println("Grade for " + numbers.get(j) + " is: " + grades.get(j));
        }

    }
}