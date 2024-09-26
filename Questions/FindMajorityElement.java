package Questions;

import java.util.Arrays;

public class FindMajorityElement {
    
    public static int findMajorityEl(int arr[]){

        int l = arr.length;
        if(l == 1){ return arr[0]; };
        Arrays.sort(arr);

        int count =1;

        for(int i=1; i< l; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }else{
                if(count > (l / 2)){
                    return arr[i-1];
                }
                count =1;
            }
        }

        if(count > (l / 2)){
            return arr[l-1];
        }
            return -1;
        
    }

    public static void main(String[] args){
        int[] arr ={1,2,1,5,1,4,6,1,9,7,1,1,1};
        System.out.println(findMajorityEl(arr));
    }
}
