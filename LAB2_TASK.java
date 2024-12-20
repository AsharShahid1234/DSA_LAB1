# TASK_1

package DSA_LABS_TASK;
import java.util.*;

public class Lab2_Task1 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        int sum = 0;

        
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
            sum += i;
        }
        System.out.println("Made by ASHAR");
        System.out.println("Integers in Vector: " + numbers);
        System.out.println("Sum of Integers: " + sum);
    }
}


# TASK_2

package DSA_LABS_TASK;
import java.util.*;

public class Lab2_Task2 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Watermelon");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Display all elements");
            System.out.println("2. Display largest string");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Elements: " + strings);
            } else if (choice == 2) {
                String largest = Collections.max(strings, Comparator.comparing(String::length));
                System.out.println("Largest String: " + largest);
            } else if (choice == 3) {
                break;
            }
        }
    }

}

# TASK_3

package DSA_LABS_TASK;

import java.util.ArrayList;
import java.util.Comparator;


class Employee {
    int empId;
    String empName;
    int joiningYear;

    public Employee(int empId, String empName, int joiningYear) {
        this.empId = empId;
        this.empName = empName;
        this.joiningYear = joiningYear;
    }

    @Override
    public String toString() {
        return empName + " (" + joiningYear + ")";
    }
}

public class Lab2_Task3 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Faiz", 2019));
        employees.add(new Employee(2, "Haris", 2018));
        employees.add(new Employee(3, "Ayesha", 2020));

        employees.sort(Comparator.comparingInt(e -> e.joiningYear));

        System.out.println("Employees sorted by joining year: " + employees);
    }
}



# TASK_4

package DSA_LABS_TASK;
import java.util.*;

public class Lab2_Task4 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>(Arrays.asList(5, 3, 8, 1, 7, 4, 9, 2, 6, 10));
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        int max = Collections.max(numbers);

        System.out.println("Integers: " + numbers);
        System.out.println("Sum: " + sum);
        System.out.println("Max Element: " + max);
    }
}

# TASK_5

package DSA_LABS_TASK;
import java.util.*;

public class Lab2_Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        int k = 2;

        System.out.println(k + "-th smallest element: " + numbers.get(k - 1));
    }
}

# TASK_6

package DSA_LABS_TASK;
import java.util.*;



public class Lab2_Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        list1.addAll(list2);
        System.out.println("Merged List: " + list1);
    }
}
