package problems;

import java.util.*;
import java.util.List;
import java.lang.*;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. This is not Hello Java. Java is something else";
        String str = st.toLowerCase();
        String [] words = str.split(" ");
        Map<Integer,String> hmap = new LinkedHashMap<Integer, String>();

        for(int i=0;i<words.length;i++) {
            hmap.put((i+1),words[i]);

        }
        for(Map.Entry<Integer,String> mentry : hmap.entrySet()){
            System.out.println(mentry.getKey()+" "+mentry.getValue());
        }

        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if((words[i].equals(words[j])) && (i!=j)){
                    System.out.println("Duplicate element "+words[j]);
                }
            }
        }


    }



}


