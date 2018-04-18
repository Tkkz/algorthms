package com.alg.insertsort;

/**
 * 插入排序
 */
public class insertSort {

    public static void sort(Comparable[] arr){
            int len=arr.length;
        long startTime=System.currentTimeMillis();
            for (int i=1;i<len;i++){
                //寻找元素arr[i]合适的插入位置
                Comparable e=arr[i];
                int j;//保存元素E 应该插入的位置
                for( j=i;j>0&&arr[j-1].compareTo(e)>0;j--)
                        arr[j]=arr[j-1];
                arr[j]=e;
                }
        long endTime=System.currentTimeMillis();
        System.out.println(startTime-endTime);
        }
        private static void swap(Object arr[],int i,int j){
            Object temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

        }


    public static void main(String[] args) {
        Integer[] a = {15, 6, 4, 32, 1, 64, 9, 87, 8, 13};
        sort(a);
        for (int al : a) {
            System.out.print(al + ",");
            
        }
    }

}
