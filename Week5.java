import java.util.HashMap;

class Week5Project {
    public static void main(String[] args) {
        HashMap<String, Integer> ExamScores = new HashMap<>();

        ExamScores.put("Maths", 75);
        ExamScores.put("Chemistry", 90);
        ExamScores.put("Physics", 85);
        ExamScores.put("Computer Science", 95);

        System.out.println(ExamScores.get("Chemistry"));
    }
}