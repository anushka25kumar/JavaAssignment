import java.util.ArrayList;
import java.util.Scanner;

class TodoList {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<String> tasks = new ArrayList<>();
System.out.print("Enter number of tasks: ");
int n = sc.nextInt();
sc.nextLine();
for (int i = 0; i < n; i++) {
System.out.print("Enter task: ");
tasks.add(sc.nextLine());
}
StringBuffer list = new StringBuffer();
for (int i = 0; i < tasks.size(); i++) {
list.append((i + 1) + ". " + tasks.get(i) + "\n");
}
System.out.println("\nTo-Do List:");
System.out.println(list);
sc.close();
}
}
/* Enter number of tasks: 3
Enter task: Complete Java assignment
Enter task: Study for DBMS
Enter task: Practice C programming

To-Do List:
1. Complete Java assignment
2. Study for DBMS
3. Practice C programming */
