package Questions;

import java.util.ArrayList;

public class FindDuplicateInteger {
    
    static void findDuplicates( 
      int arr[], int len) 
    { 
  
        // initialize ifPresent as false 
        boolean ifPresent = false; 
  
        // ArrayList to store the output 
        ArrayList<Integer> al = new ArrayList<Integer>(); 
  
        for (int i = 0; i < len - 1; i++) { 
            for (int j = i + 1; j < len; j++) { 
                if (arr[i] == arr[j]) { 
                    // checking if element is 
                    // present in the ArrayList 
                    // or not if present then break 
                    if (al.contains(arr[i])) { 
                        break; 
                    } 
  
                    // if element is not present in the 
                    // ArrayList then add it to ArrayList 
                    // and make ifPresent at true 
                    else { 
                        al.add(arr[i]); 
                        ifPresent = true; 
                    } 
                } 
            } 
        } 
  
        // if duplicates is present 
        // then print ArrayList 
        if (ifPresent == true) { 
  
            System.out.print(al + " "); 
        } 
        else { 
            System.out.print( 
                "No duplicates present in arrays"); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        int arr[] = { 12, 11, 40, 12, 5, 6, 5, 12, 11 }; 
        int n = arr.length; 
  
        findDuplicates(arr, n); 
    } 

}
