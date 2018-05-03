package com.alg.insertsort;

/**
 * 质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数；否则称为合数。
 */
public class Test {

    public static boolean isPrime(int n){
        for (int x=2;x*x<=n;x++){
            if (n%x==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean prime = isPrime(101);

        System.out.println(prime);
    }
}
