package com.nttdata.stringAssignment;

public class CountString {

// JAVA program to count occurrences 
// of a character 
  
 
    // Method that return count of the given 
    // character in the string 
    public static int count(String s, char c) 
    { 
        int res = 0; 
  
        for (int i=0; i<s.length(); i++) 
        { 
            // checking character in string 
            if (s.charAt(i) == c) 
            res++; 
        }  
        return res; 
    } 
      
    // Driver method 
    public static void main(String args[]) 
    { 
        String str= "NttData"; 
        char c = 't'; 
        System.out.println(count(str, c)); 
    } 
} 


