class Week4Project{
    public static void main(String[] args){
        int numbers[] = {1,2,3,4,5,6,7,8,9,10};

        int sum = 0;

        for (int index = 0; index < 10; index++){
            sum += numbers[index];
        }

        System.out.println(sum);
    }
}