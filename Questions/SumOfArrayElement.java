package Questions;

public class SumOfArrayElement {
    public static void main(String[] args){

        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int totalNumber = 0;

        for(int i : numbers){
            totalNumber += i;
        }

        System.out.println(totalNumber);

    }
}
