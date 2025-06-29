
public class WaitingList {

    public static void main(String[] args) {

        Student[] students = new Student[6];

        students[0] = new Student(1, "Bill", "Jones", "UNDER-REVIEW");
        students[1] = new Student(2, "John", "Smith", "UNDER-REVIEW");
        students[2] = new Student(3, "Wally", "Wiggles", "ENROLLED");
        students[3] = new Student(4, "May", "Hanks", "UNDER-REVIEW");
        students[4] = new Student(5, "Jane", "Carson", "UNDER-REVIEW");
        students[5] = new Student(6, "Lori", "Random", "UNDER-REVIEW");

        ListManager listManager = new ListManager(students);

        String studentLastName = "Carson";
        int option;
        while (true) {
            System.out.println("Welcome to the Waiting List Management System");
            System.out.println("===========================================");
            System.out.println("1. List all students");
            System.out.println("2. Find a student by last name");
            System.out.println("3. Update a student's status to ENROLLED");
            System.out.println("4. Remove a student from the waiting list");
            System.out.println("5. Exit");
            System.out.print("Please select an option (1-5): ");
            option = Integer.parseInt(System.console().readLine());
            System.out.println();
            switch (option) {
                case 1:
                    listManager.listStudents();
                    break;
                case 2:
                    System.out.print("Enter the last name of the student to find: ");
                    studentLastName = System.console().readLine();
                    if (studentLastName.isEmpty()) {
                        System.out.println("Last name cannot be empty.");
                        continue;
                    }
                    studentLastName = studentLastName.trim();
                    if (studentLastName.isBlank()) {
                        System.out.println("Last name cannot be blank.");
                        continue;
                    }
                    studentLastName = studentLastName.substring(0, 1).toUpperCase()
                            + studentLastName.substring(1).toLowerCase();
                    System.out.println("Searching for student: " + studentLastName);
                    System.out.println();
                    listManager.findStudent(studentLastName);
                    break;
                case 3:
                    System.out.print("Enter the last name of the student to update status to ENROLLED: ");
                    studentLastName = System.console().readLine();
                    if (studentLastName.isEmpty()) {
                        System.out.println("Last name cannot be empty.");
                        continue;
                    }
                    studentLastName = studentLastName.trim();
                    if (studentLastName.isBlank()) {
                        System.out.println("Last name cannot be blank.");
                        continue;
                    }
                    studentLastName = studentLastName.substring(0, 1).toUpperCase()
                            + studentLastName.substring(1).toLowerCase();
                    System.out.println("Updating status for student: " + studentLastName);
                    System.out.println();
                    if (!listManager.studentsMap.containsKey(studentLastName)) {
                        System.out.println("Student with last name '" + studentLastName + "' does not exist.");
                        continue;
                    }
                    // Update the student's status to ENROLLED
                    System.out.println("Updating status for student: " + studentLastName);
                    System.out.println();
                    listManager.updateStudentStatus(studentLastName, "ENROLLED");
                    break;
                case 4:
                    System.out.print("Enter the last name of the student to remove: ");
                    studentLastName = System.console().readLine();
                    if (studentLastName.isEmpty()) {
                        System.out.println("Last name cannot be empty.");
                        continue;
                    }
                    studentLastName = studentLastName.trim();
                    if (studentLastName.isBlank()) {
                        System.out.println("Last name cannot be blank.");
                        continue;
                    }
                    studentLastName = studentLastName.substring(0, 1).toUpperCase()
                            + studentLastName.substring(1).toLowerCase();
                    System.out.println("Removing student: " + studentLastName);
                    System.out.println();
                    if (!listManager.studentsMap.containsKey(studentLastName)) {
                        System.out.println("Student with last name '" + studentLastName + "' does not exist.");
                        continue;
                    }
                    // Remove the student from the waiting list
                    System.out.println("Removing student: " + studentLastName);
                    System.out.println();
                    // Call the removeStudent method
                    listManager.removeStudent(studentLastName);
                    break;
                case 5:
                    System.out.println("Exiting the Waiting List Management System.");
                    return;
                default:
                    System.out.println("\nInvalid option selected.\n");
            }
            System.out.println();
        }

    }
}