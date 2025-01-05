import java.util.*;

public class Marks{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();

      
        int[] marks = new int[numberOfSubjects];
        int sum = 0;

    
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            sum += marks[i];
        }

        
        double average = (double) sum / numberOfSubjects;

        
        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + average);

        
        scanner.close();
    }
}
