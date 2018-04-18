package com.alg.selectionsort;

/**
 *Comparable[] 接口
 * 比较此对象与指定对象的顺序。如果该对象小于、等于或大于指定对象，则分别返回负整数、零或正整数
 */
public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public int compareTo(Student student) {
       if (this.score<student.score){
           return -1;
       }else if (this.score>student.score){
            return 1;
       }else
           return this.name.compareTo(student.name);
    }
}
