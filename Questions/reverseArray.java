
package Questions;

import java.util.Arrays;

public class reverseArray {
    
    public static int[] reArray(int[] arr){
        int[] newArray = new int[arr.length];

        for(int i=0; i<= arr.length -1; i++ ){
            newArray[i] = arr[arr.length -1 -i];
        }
        return newArray;
    }

    public static void main(String args[]){

        int[] arr = {1,2,3,4,5,6,7,8,9};

        int[] reversedArray = reArray(arr);
        System.out.println(Arrays.toString(reversedArray));
    }
}
