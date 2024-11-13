# TASK_1

package DSA_LABS_TASK;

public class Lab4_Task1 {
    public static void main(String[] args) {
        int[] array1 = {28, 6, 15, 5};
        int[] array2 = {12, 6, 3, 1};

        // Display original arrays
        System.out.println("Before Swapping:");
        printArrays(array1, array2);

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }

        System.out.println("After Swapping:");
        printArrays(array1, array2);
    }

    public static void printArrays(int[] array1, int[] array2) {
        System.out.print("Array 1: ");
        for (int num : array1) System.out.print(num + " ");
        System.out.print("\nArray 2: ");
        for (int num : array2) System.out.print(num + " ");
        System.out.println();
    }
}


# TASK_2

package DSA_LABS_TASK;

public class Lab4_Task2 {
    public static void main(String[] args) {
        int[] array1 = {28, 6, 15, 5};
        int[] array2 = {27, 3, 29, 12};
        
        int[] mergedArray = mergeArrays(array1, array2);
        
        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }
        
        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }
        
        return result;
    }
}

# TASK_3

package DSA_LABS_TASK;

public class Lab4_Task3 {
    public static void main(String[] args) {
        String[] words = {"level", "pencil", "deed", "rat"};
        
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }
        }
    }
    
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}



# TASK_4

package DSA_LABS_TASK;

public class Lab4_Task4 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 8, 9, 12, 15};
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

# TASK_5

package DSA_LABS_TASK;


import java.util.HashSet;
import java.util.Set;

public class Lab4_Task5 {
    public static void main(String[] args) {
        int[] array1 = {18, 2, 5, 4};
        int[] array2 = {3, 4, 18, 5};
        
        int[] mergedArray = mergeAndRemoveDuplicates(array1, array2);
        
        System.out.print("Merged Array without duplicates: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeAndRemoveDuplicates(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }
        
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        
        return result;
    }
}

# TASK_6
