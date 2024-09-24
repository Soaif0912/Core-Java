package Questions;
public class SortArray0Of2 {
    public static void sort012(int a[], int n)
    {
        // code here
        int c0 = 0, c1 = 0, c2 = 0;

        // Count 0s, 1s and 2s
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                c0 += 1;
            }
            else if (a[i] == 1) {
                c1 += 1;
            }
            else {
                c2 += 1;
            }
        }

        int idx = 0;
        // Place all the 0s
        for (int i = 0; i < c0; i++)
            a[idx++] = 0;

        // Place all the 1s
        for (int i = 0; i < c1; i++)
            a[idx++] = 1;

        // Place all the 2s
        for (int i = 0; i < c2; i++)
            a[idx++] = 2;
    }
    public static void main(String[] args){
        
        int[] a = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
        int n = a.length;

        sort012(a, n);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
