class Week4Project{
    public static void main(String[] args){
        for (int number = 1; number < 10; number ++){
            System.out.printf("-------------%d times table--------------%n", number);
            for (int multiplier = 1; multiplier < 13; multiplier++){
                System.out.printf("%d x %d = %d", number, multiplier, number*multiplier);
            }
        }
    }
}