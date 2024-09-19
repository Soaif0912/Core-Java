package Questions;

class MinMax{
    int minNum;
    int maxNum;

    MinMax(int min, int max){
        this.minNum = min;
        this.maxNum = max;
    }
}

public class FindMaxMinNumber {
    
    public static MinMax findMaxMin(int[] arr){
        if(arr.length ==0 || arr == null){
            throw new IllegalArgumentException(" Array must not be null or emapty.");
        }

        int minNum = arr[0];
        int maxNum = arr[0];

        for(int i : arr){
            if(i> maxNum){
                maxNum = i;
            }else if(i < minNum){
                minNum = i;
            }
        }

        return new MinMax(minNum, maxNum);

    } 

    public static void main(String[] args){

        int[] arr ={7,6,9,4,5,8,1,6,3,2};

        try{
            MinMax obj = findMaxMin(arr);
            System.out.println(obj.minNum);
            System.out.println(obj.maxNum);

        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
