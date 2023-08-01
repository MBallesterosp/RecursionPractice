package com.mycompany.practice;

/**
 *
 * @author mario
 */
public class Recursion {

    static int count = 0;

    public static <E> E[] cutCorners(E[] array) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        E[] copy = (E[]) new Object[array.length - 2];
        for (int i = 1; i < array.length - 1; i++) {
            copy[i - 1] = array[i];
        }
        return copy;
    }

    public static char[] cutCorners(char[] array) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        char[] copy = new char[array.length - 2];
        System.arraycopy(array, 1, copy, 0, array.length - 2);
        return copy;
    } 
    
    public static int factorial(int n) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        if (n == 1) {
            return 1;
        }
        System.out.println(n);
        return n * factorial(n - 1);
    }

    /**
     * The 3 parts of a recursive algorithm are called
     * recursive operation stop condition.
     * @param n
     * @return 
     */
    public static int fibonacci(int n) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        System.out.println(n);
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static <E> boolean isPalindrome(E[] array) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        return (array.length == 1 || array.length == 0) || (array[array.length - 1] == array[0]) && isPalindrome(cutCorners(array));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        /*
        If I wanted to put my tread in to a infinite loop I could call the
        following method: repeatInfiniteTimes();
         */
        repeatFiniteTimes();
        int n = 4;
        System.out.println(factorial(n));
        n = 9;
        System.out.println(fibonacci(n));
        Character[] array = new Character[6];
        array[0] = 'a';
        array[1] = 'b';
        array[2] = 'c';
        array[3] = 'c';
        array[4] = 'b';
        array[5] = 'a';
        System.out.println(isPalindrome(array));
        System.out.println(cutCorners(array));
    }

    public static void repeatFiniteTimes() {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        count++;
        if (count <= 20) {
            System.out.println(count);
            repeatFiniteTimes();
        }
    }

    public static void repeatInfiniteTimes() {
        System.out.println(new Object() {
        }.getClass().getEnclosingMethod().getName());
        repeatInfiniteTimes();
    }

}
