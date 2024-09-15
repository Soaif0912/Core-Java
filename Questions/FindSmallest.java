package Questions;

public class FindSmallest {
    public static void main(String[] main){
        
        int[] age = {12, 45, 7, 10, 25, 29};
        int smallest = age[0];

        for(int i : age){
            if(i < smallest){
                smallest = i;
            }
        }

        System.out.println(smallest);

    }
}
