# TASK_1
public class Lab1_Task1 {
    public static void main(String[] args) {
        
        String name = "ashar";
        String username = "ashar_2004"
        String name2 = new String("Ashar");
        
        // Using intern method
        String name3 = name2.intern();
        
        // Check immutability
        name2.concat("Shahid");
        // Print the strings
        System.out.println("Name: " + name);            
        System.out.println("Username: " + username);    
        System.out.println("Name2: " + name2);          
        System.out.println("Name3 (interned): " + name3);
    }
}

# TASK_2

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DSA_LABS_TASK;

/**
 *
 * @author USER
 */
public class Lab1_Task2 {
    public static void main(String[] args) {
        double primitiveDouble = 25.75;
        
        // Converting primitive double to Wrapper Double
        Double wrapperDouble = Double.valueOf(primitiveDouble);
        
        System.out.println("Primitive Double: " + primitiveDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);
    }
}

# TASK_3

package DSA_LABS_TASK;
public class Lab1_Task3{
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Java";
        String str4 = "Programming";
        String str5 = "Language";
        String concatenated = str1 + " " + str2 + " " + str3 + " " + str4 + " " + str5;
        System.out.println("Concatenated String: " + concatenated);
                System.out.println("Uppercase of fourth string: " + str4.toUpperCase());
                System.out.println("Substring from index 8: " + concatenated.substring(8));
    }
}


#TASK_4

package DSA_LABS_TASK;

public class Lab1_Task4{
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        
        String merged = mergeAlternating(word1, word2);
        System.out.println("Merged String: " + merged);
    }
    
    public static String mergeAlternating(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                result.append(word2.charAt(j));
                j++;
            }
        }
        
        return result.toString();
    }
}


# TASK_5

public class Lab1_Task5 {
    public static void main(String[] args) {
        // Minimum and Maximum values of Integer
        System.out.println("Integer Minimum Value: " + Integer.MIN_VALUE);
        System.out.println("Integer Maximum Value: " + Integer.MAX_VALUE);

        // Minimum and Maximum values of Float
        System.out.println("Float Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Float Maximum Value: " + Float.MAX_VALUE);

        // Minimum and Maximum values of Double
        System.out.println("Double Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Double Maximum Value: " + Double.MAX_VALUE);
    }
}

