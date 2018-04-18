package com.alg.selectionsort;

/**
 * O（n^2）级别
 */
public class SelectSort {
    // 我们的算法类不允许产生任何实例
    private SelectSort(){}

    public static void sort(Comparable[] arr){
        int len=arr.length;
        for (int i=0;i<len;i++){
            //[i,len) 区间
            int minIndex=i;
            for (int j=i+1;j<len;j++){
                if(arr[j].compareTo(arr[minIndex])<0)
                    minIndex=j;
            }
            swap(arr,i,minIndex);
        }
    }

    private static void swap(Object [] arr, int i, int j) {
        Object temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        Integer[] a = {15, 6, 4, 32, 1, 64, 9, 87, 8, 13};
        sort(a);
        for (int al:a) {
            System.out.print(al+",");
        }
        System.out.println();
        Double[] b = {4.4, 3.3, 2.2, 1.1};
        SelectSort.sort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
            System.out.print(' ');
        }

        System.out.println();

        // 测试自定义的类 Student
        Student[] d = new Student[4];
        d[0] = new Student("D", 90);
        d[1] = new Student("C", 100);
        d[2] = new Student("B", 95);
        d[3] = new Student("A", 95);
        SelectSort.sort(d);
        for (int i = 0; i < d.length; i++)
            System.out.println(d[i]);
    }
}
