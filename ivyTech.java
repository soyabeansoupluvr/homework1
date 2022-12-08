import java.util.Scanner;
public class ivyTech {
    public static void main(String[] args) {
        int studentNumber = 0;
        String studentName[] = new String[3];
        double studentGrade[] = new double[3];
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ivy Tech Student Records\n------------------------");

            while (studentNumber < studentName.length) {
                System.out.print("What is Student " + studentNumber + "'s name? ");
                studentName[studentNumber] = sc.next();
                System.out.print("What is Student " + studentNumber + "'s grade? ");
                studentGrade[studentNumber] = sc.nextDouble();
                studentNumber++;
            }

            System.out.println("------------------------");

            for (studentNumber = 0; studentNumber < studentName.length; studentNumber++) {
                System.out.printf("Student: %d, Name: %s, Grade: %3.1f", 
                    studentNumber, studentName[studentNumber], studentGrade[studentNumber]);
                System.out.println();
            }

            System.out.print("------------------------\nWhich record would you like? ");
            studentNumber = sc.nextInt();
            System.out.println(studentName[studentNumber] + " has a grade of "
                + studentGrade[studentNumber] + ".");

            sc.close();
        }
    }
}