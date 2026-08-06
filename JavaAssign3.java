import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        String sub1 = input.nextLine();

        System.out.print("Enter marks for Subject 2: ");
        String sub2 = input.nextLine();

        System.out.print("Enter marks for Subject 3: ");
        String sub3 = input.nextLine();

        // String to Integer
        Integer score1 = Integer.parseInt(sub1);
        Integer score2 = Integer.parseInt(sub2);
        Integer score3 = Integer.parseInt(sub3);

        int totalMarks = score1 + score2 + score3;

        System.out.println("\nTotal Marks Obtained = " + totalMarks);

        input.close();
    }
}
/* Enter marks for Subject 1: 85
Enter marks for Subject 2: 90
Enter marks for Subject 3: 88

Total Marks Obtained = 263 */
