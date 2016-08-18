package problems;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String str1 = sc.next();
        String str2 = sc.next();

        char [] s1Array = str1.toCharArray();
        char [] s2Array = str2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);
        if(Arrays.equals(s1Array,s2Array)){
            System.out.print("The strings are Anagram");
        }
        else
            System.out.println("Strings are not Anagram");

    }
}
