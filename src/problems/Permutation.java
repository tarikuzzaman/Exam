package problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by mrahman on 4/9/16.
 */
public class Permutation {
    public static Set<String> permutation(String str)
    {
        Set<String> set = new HashSet<String>();
        if (str == "")
            return set;

        Character a = str.charAt(0);

        if (str.length() > 1)
        {
            str = str.substring(1);

            Set<String> permSet = permutation(str);

            for (String x : permSet)
            {
                for (int i = 0; i <= x.length(); i++)
                {
                    set.add(x.substring(0, i) + a + x.substring(i));
                }
            }
        }
        else
        {
            set.add(a + "");
        }
        return set;
    }

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "abc" "bac" "bca" "acb" "cab" "cba".
         * Write Java program to compute all Permutation of a String
         *
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.next();
        System.out.print(permutation(str));

    }
}
