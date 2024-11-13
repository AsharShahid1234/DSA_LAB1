# TASK_1
package DSA_LABS_TASK;

import java.util.Scanner;
public class Lab3_Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative number:");
        int k = scanner.nextInt();

       if (k >= 0) {
          printSequence(k); 
       } else {
            System.out.println("Number must be non-negative.");
        }
    }

    public static void printSequence(int k) {
        if (k < 0) {
            return;             
        }
        System.out.print(k + " ");
        printSequence(k - 1);
    }
}

# TASK_2
package DSA_LABS_TASK;

public class Lab3_Task2 {
    public static String reverseName(String name) {
        if (name.isEmpty()) {
            return ""; 
        }
      
        return reverseName(name.substring(1)) + name.charAt(0);  
    
    public static void main(String[] args) {
        System.out.println(reverseName("ASHAR"));
    }
}


#TASK_3

package DSA_LABS_TASK;


public class Lab3_Task3 {
    public static int sumToN(int n) {
        if (n == 0) {
            return 0; 
        }
        return n + sumToN(n - 1);  
    }

    public static void main(String[] args) {
        System.out.println(sumToN(12)); 
    }
}

#TASK_4

package DSA_LABS_TASK;


public class  Lab3_Task4 {
    public static int sumArray(int[] arr, int index) {
        if (index < 0) {
            return 0;  
        }
        return arr[index] + sumArray(arr, index - 1);  
    }

    public static void main(String[] args) {
        int[] array = {52,28,15,6,50};
        System.out.println("Sum of Given array: "+sumArray(array, array.length - 1));
    }
}

#TASK_5

package DSA_LABS_TASK;


public class Lab3_Task5  {
    public static int factorial(int n) {
        if (n <= 1) {
            return 1; 
        }
        return n * factorial(n - 1);  
    }

    public static void main(String[] args) {
        System.out.println("The Factorial of is: "+ factorial(12));  
    }
}
# TASK_6

package DSA_LABS_TASK;


public class  Lab3_Task6  {
    public static int countdigits(int number) {
        if (number == 0) {
            return 0;  
        }
        return 1 + countdigits(number / 10);  
    }

    public static void main(String[] args) {
        System.out.println("The digits counts of given value is: "
                +countdigits(5051505150));
    }
}
