package com.algo.array;

public class RotatedSortedArray {


    static void main() {
        System.out.println("Minimum in Rotated Sorted Array: [3,4,5,1,2] is : " + findMin(new int[]{3, 4, 5, 1, 2}));

        System.out.println("Search in Rotated Sorted Array: [4,5,6,7,0,1,2] target is 0 : " + search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));

        System.out.println("Search in Rotated Sorted Array: [4,5,6,7,0,1,2] target is 3 : " + search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));

        System.out.println("Search in Rotated Sorted Array: [1] target is 0 : " + search(new int[]{1}, 0));
    }

    public static int findMin(int[] nums) {

        int result = nums[0];
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] < nums[r]) {
                result = Math.min(result, nums[l]);
                break;
            }

            int m = (l + r) / 2;
            result = Math.min(nums[m], nums[r]);
            if (nums[l] <= nums[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return result;
    }


    public static int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {

            int m = (l + r) / 2;
            if (nums[m] == target) {
                return m;
            }

            if (nums[l] <= nums[m]) {
                if (target > nums[m] || target < nums[l]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            } else {
                if (target < nums[m] || target > nums[r]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }

            }
        }

        return -1;

    }
}
