package com.alg.leetcode27;

/**
 * 给定一个数组nums和一个数值val，将数组中所有等于val的元素删除，并返回剩余的元素个数
 * -如何定义删除？从数组中去除？还是放在数组末尾
 * -剩余元素的排列是否要保证原有的相对顺序?
 * -是否有空间复杂度的要求？0（1）
 *
 */
public class RemoveElement {

    public int intreElement(int arr[],int targer){

           if (arr==null||arr.length==0)
               return 0;

            int k=0;
            for (int i=0;i<arr.length;i++){

                /*
                    当arr[i]不等于targer 时 arr[k]和arr[i] 相同时 k i同时移动一位
                    当arr[i]等于targer时 i向前移动 k的位置被锁定 不移动
                    当再次 当arr[i]不等于targer arr[k]的位置为 targer的位置 i的位置为非target 进行交换 同时向后移动一位
                    最好得到结果
                 */
             if (arr[i]!=targer){
                   if (arr[k]!=arr[i]){
                       arr[k]=arr[i];
                   }
                    k++;
                }
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[]={3,6,5,8,8,6,6,7,8,9,8};
        RemoveElement r=new RemoveElement();
        int i = r.intreElement(arr, 8);
        System.out.println(i);
    }

}
