package solutions.math;

/**
 * Created by calabash on 2017/4/7.
 * LeetCode 537th : Complex Number Multiplication
 * Description : https://leetcode.com/problems/complex-number-multiplication/#/description
 * Difficulty : Medium
 * Tags : Math, String
 */
public class ComplexNumberMultiplication_537 {

    /**
     * Status : Accepted
     * Runtime : 6ms
     */
    public String complexNumberMultiply(String a, String b) {
        int a1, a2, b1, b2;
        a1 = Integer.valueOf(a.substring(0, a.indexOf('+')));
        a2 = Integer.valueOf(a.substring(a.indexOf('+') + 1, a.length() - 1));
        b1 = Integer.valueOf(b.substring(0, b.indexOf('+')));
        b2 = Integer.valueOf(b.substring(b.indexOf('+') + 1, b.length() - 1));
        return String.valueOf(a1 * b1 - a2 * b2) + "+" +String.valueOf(a1 * b2 + a2 * b1) + "i";
    }
}