package Chapter1;

import java.util.Arrays;


// Chapter 1: Arrays and Strings
public class ChapterOne {
    public ChapterOne() { }

    /*
     *  Question: Implement an algorithm to determine if a string has all unique
     *            characters. What if you can not use additional data structures?
     */

    // Space Complexity: O(n), Time Complexity: O(n)
    public boolean questionOne_v1(String str) {
        boolean [] cSet = new boolean [256];

        for(char c : str.toCharArray()) {
            if(cSet[(int)c] == true) return false;
            else cSet[(int)c] = true;
        }
        return true;
    }

    // Space Complexity O(1), Time complexity O(n * m)
    public boolean questionOne_v2(String str) {

        char [] cs = str.toCharArray();

        for (int i = 0; i < cs.length; i++) {
            for(int j = i + 1; j < cs.length; j++) {

                if(cs[i] == cs[j]) return false;
            }
        }

        return true;
    }

    /* Question: Design an algorithm and write code to remove the duplicate
                 characters in a string without using any additional buffer.
                 NOTE: One or two additional variables are fine.An extra copy
                 of the array is not. FOLLOW UP Write the test cases for this
                 method.
     */
    // Space Complexity O(n), Time Complexity O(n)
    public String questionThree(String str) {
        String result = "";
        boolean [] cSet = new boolean [256];

        for(char c : str.toCharArray()) {
            if(cSet[(int)c] == false) {
                result += c;
                cSet[(int)c] = true;
            }
        }
        return result;
    }

    /* Question: Write a method to decide if two strings are anagrams or not
     */
    // Space Complexity O(n), Time Complexity O(n)
    public boolean questionFour(String str1, String str2) {

        char [] first = str1.toCharArray();
        char [] second = str2.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if(String.valueOf(first).contentEquals(String.valueOf(second))) return true;
        else return false;
    }

    public String questionFive(String str1) {

        char space = ' ';
        String htmlSpace = "%20";
        StringBuilder sb = new StringBuilder();

        for (char c : str1.toCharArray()) {
            if(c == space) {
                sb.append(htmlSpace);
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
