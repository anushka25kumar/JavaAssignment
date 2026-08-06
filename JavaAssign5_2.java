import java.util.ArrayList;
import java.util.Scanner;
class CourseRegistration {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> courses = new ArrayList<>();
while (true) {
System.out.println("\n1. Add Course");
System.out.println("2. Remove Course");
System.out.println("3. View Courses");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
int choice = sc.nextInt();
sc.nextLine();
if (choice == 1) {
System.out.print("Enter course name: ");
String course = sc.nextLine();
courses.add(course);
System.out.println("Course added.");
}
else if (choice == 2) {
System.out.print("Enter course name to remove:
");
String course = sc.nextLine();
if (courses.remove(course)) {
System.out.println("Course removed.");
} else {
System.out.println("Course not found.");
}
}
else if (choice == 3) {
StringBuffer list = new StringBuffer();
if (courses.size() == 0) {
System.out.println("No courses
registered.");
} else {
for (int i = 0; i < courses.size(); i++) {
list.append((i + 1) + ". " +
courses.get(i) + "\n");
}
System.out.println("\nRegistered
Courses:");
System.out.println(list);
}
}
else if (choice == 4) {
System.out.println("Program ended.");
break;
}
else {
System.out.println("Invalid choice.");
}
}
sc.close();
}
}
/* 1. Add Course
2. Remove Course
3. View Courses
4. Exit
Enter your choice: 1
Enter course name: Java
Course added.

1. Add Course
2. Remove Course
3. View Courses
4. Exit
Enter your choice: 1
Enter course name: DBMS
Course added.

1. Add Course
2. Remove Course
3. View Courses
4. Exit
Enter your choice: 3

Registered Courses:
1. Java
2. DBMS


1. Add Course
2. Remove Course
3. View Courses
4. Exit
Enter your choice: 2
Enter course name to remove: Java
Course removed.

1. Add Course
2. Remove Course
3. View Courses
4. Exit
Enter your choice: 3

Registered Courses:
1. DBMS


1. Add Course
2. Remove Course
3. View Courses
4. Exit
Enter your choice: 4
Program ended. */
