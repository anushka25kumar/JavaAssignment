class Student {
    int id;
    String studentName;
    int score;

    Student(int i, String n, int s) {
        id = i;
        studentName = n;
        score = s;
    }

    void showDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + studentName);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Student student1 = new Student(258, "Anushka", 92);
        student1.showDetails();
    }
}
/* Output:
Student ID: 258
Student Name: Anushka
Score: 92 */
