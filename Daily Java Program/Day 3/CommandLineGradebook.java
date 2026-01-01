import java.util.Scanner;

public class CommandLineGradebook {

    // print all students with name and grades
    static void printAll(String[] names, int[] grades) {
        // loop from 0 to length-1
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "(" + grades[i] + ")");
            if (i < names.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    // find and print topper
    static void printTopper(String[] names, int[] grades) {
        int maxIndex = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > grades[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("Topper: " + names[maxIndex] + "(" + grades[maxIndex] + ")");
    }

    // calculate and print class average
    static void printAverage(int[] grades) {
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }

        double avg = (double) sum / grades.length;
        System.out.printf("Average: %.2f%n", avg);
    }

    // search student by name (case-insensitive)
    static void searchByName(String[] names, int[] grades, String searchName) {
        boolean found = false;

        // loop required to use index i
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + names[i] + "(" + grades[i] + ")");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
    }

    // curve grades by +5, max 100
    static void curveGrades(int[] grades) {
        for (int i = 0; i < grades.length; i++) {
            grades[i] += 5;
            if (grades[i] > 100) {
                grades[i] = 100;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // read number of students
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // if number of students is invalid, exit
        if (n <= 0) {
            System.out.println("No of students must be greater than zero");
            return;
        }

        // arrays to store names and grades
        String[] names = new String[n];
        int[] grades = new int[n];

        // read student names and grades
        for (int i = 0; i < n; i++) {

            // ask again until valid name is entered
            while (true) {
                String name = sc.nextLine();

                if (name.trim().isEmpty()) {
                    System.out.println("Invalid name, enter again");
                } else {
                    names[i] = name;
                    break;
                }
            }

            // ask again until valid grade (0-100)
            while (true) {
                int grade = sc.nextInt();
                sc.nextLine(); // consume newline

                if (grade < 0 || grade > 100) {
                    System.out.println("Invalid grade, enter again");
                } else {
                    grades[i] = grade;
                    break;
                }
            }
        }

        // menu-driven program
        while (true) {
            System.out.println("1. Print all");
            System.out.println("2. Print topper");
            System.out.println("3. Class Average");
            System.out.println("4. Search by name");
            System.out.println("5. Curve grades");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                printAll(names, grades);

            } else if (choice == 2) {
                printTopper(names, grades);

            } else if (choice == 3) {
                printAverage(grades);

            } else if (choice == 4) {
                String searchName = sc.nextLine();
                searchByName(names, grades, searchName);

            } else if (choice == 5) {
                curveGrades(grades);
                System.out.println("Grades curved successfully");

            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;

            } else {
                System.out.println("Invalid choice");
                continue;
            }
        }
    }
}
