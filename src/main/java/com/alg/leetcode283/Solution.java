package com.alg.leetcode283;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个数组nums，写一个函数，将数组中所有的0挪到数组的末尾，而维持其他所有非0元素的相对位置。
 * <p>
 * 举例：nums=[0,1,0,3,12] ,函数运行后结果为[1,3,12,0,0]
 */
public class Solution {

    //第一种方式O(n)
    public void moveZeros01(int arr[]) {
        int len = arr.length;
        List<Integer> nonZeroElements = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                nonZeroElements.add(arr[i]);
        }
        for (int j = 0; j < nonZeroElements.size(); j++) {
            arr[j] = nonZeroElements.get(j);
        }
        for (int i = nonZeroElements.size(); i < len; i++) {
            arr[i] = 0;
        }
    }

    //第二种方式
    public void moveZeros02(int arr[]) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        for (int i = k; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    //第三种方式
    public void moveZeros03(int arr[]) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, k);

            }
        }

    }

    private static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 3, 0, 12};
        Solution s = new Solution();
        s.moveZeros03(arr);

        for (int a : arr) {
            System.out.print(a + ",");
        }

    }
  
}
