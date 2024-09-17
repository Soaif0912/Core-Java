
public class findSecondHighestNum{
    
    public static void main(String[] args){

        int[] num ={1,3,7,5,8,9,6,4,2,5,10};

        try{
            int secondLargestElement = findSecondLargest(num);
            System.out.println("Second largest element is " + secondLargestElement);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }

    public static int findSecondLargest(int[] num){

        if(num.length < 2){
            throw new IllegalArgumentException("Array must contain at least two element.");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i : num){

            if(i > largest){
                secondLargest = largest;
                largest = i;
            }else if(secondLargest > i && i < largest){
                secondLargest = i;
            }
        }

        if(secondLargest == Integer.MIN_VALUE){
            throw new IllegalArgumentException("There is distinc second largest element in this array");
        }

        return secondLargest;
    }
}

