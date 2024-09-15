package Questions;

public class FindPeakElement {

    public static int findPeakElement(int[] nums) {
        return findPeak(nums, 0, nums.length - 1);
    }

    private static int findPeak(int[] nums, int low, int high) {
        int mid = low + (high - low) / 2;

        // Check if mid is a peak element
        if ((mid == 0 || nums[mid] >= nums[mid - 1]) && 
            (mid == nums.length - 1 || nums[mid] >= nums[mid + 1])) {
            return mid;
        }
        // If the left neighbor is greater, then the peak lies on the left half
        else if (mid > 0 && nums[mid - 1] > nums[mid]) {
            return findPeak(nums, low, mid - 1);
        }
        // Otherwise, the peak lies on the right half
        else {
            return findPeak(nums, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 20, 4, 1, 0};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak element is at index: " + peakIndex);
    }
}

