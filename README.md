数据结构 与 算法 基础 <br/>
==
#1 选择排序


``` java
 for (int i=1;i<len;i++){
                //寻找元素arr[i]合适的插入位置
      Comparable e=arr[i];
      int j;//保存元素E 应该插入的位置
      for( j=i;j>0&&arr[j-1].compareTo(e)>0;j--)
      arr[j]=arr[j-1];
      arr[j]=e;
  }
   
    
    
    
    
    
    
    
    
    
2 插入排序<br/>
3 归并排序