import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = sc.next();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            students.add(new Student(name, marks));
        }

        int total = 0;
        int highest = students.get(0).getMarks();
        int lowest = students.get(0).getMarks();

        for (Student s : students) {
            int m = s.getMarks();
            total += m;
            if (m > highest) highest = m;
            if (m < lowest) lowest = m;
        }

        double average = (double) total / students.size();

        System.out.println("\n--- Student Summary Report ---");
        for (Student s : students) {
            System.out.println(s.getName() + " : " + s.getMarks());
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
