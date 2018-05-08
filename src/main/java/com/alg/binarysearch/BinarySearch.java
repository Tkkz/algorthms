package com.alg.binarysearch;

import java.util.HashMap;

/**
 * 二分法 1946年提出O(            0logn)
 *
 * 主要考虑边界问题
 */
public class BinarySearch {
    //[a b]
    public static int search(int[] arr, int target) {

        int n = arr.length;

        int l = 0, r = n - 1;//[l.....r]的范围里寻找target
        while (l <= r) //当l=r时 这个区间任然有一个元素
        {
            //int mid=(l+r)/2;
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) { //targer在[mid+1...r]中
                l = mid + 1;
            } else {
                r = mid - 1;//同上
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 8, 9, 10, 22, 25, 33, 45};
        int i = search(arr, 33);
        System.out.println(arr[i]);

    }
}
