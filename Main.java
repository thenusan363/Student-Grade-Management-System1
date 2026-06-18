import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        FileHandler.load(manager);

        while (true) {

            try {

                System.out.println("\n===== Student Grade Manager =====");

                System.out.println("1.Add Student");
                System.out.println("2.View Students");
                System.out.println("3.Update Student");
                System.out.println("4.Delete Student");
                System.out.println("5.Save");
                System.out.println("6.Exit");

                System.out.print("Enter Choice : ");

                int choice = sc.nextInt();

                switch (choice) {

                    case 1:

                        System.out.print("ID : ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Name : ");
                        String name = sc.nextLine();

                        System.out.print("Marks : ");
                        int marks = sc.nextInt();

                        manager.addStudent(new Student(id, name, marks));

                        break;

                    case 2:

                        manager.viewStudents();

                        break;

                    case 3:

                        System.out.print("ID : ");
                        id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("New Name : ");
                        name = sc.nextLine();

                        System.out.print("New Marks : ");
                        marks = sc.nextInt();

                        manager.updateStudent(id, name, marks);

                        break;

                    case 4:

                        System.out.print("ID : ");

                        id = sc.nextInt();

                        manager.deleteStudent(id);

                        break;

                    case 5:

                        FileHandler.save(manager.getStudents());

                        break;

                    case 6:

                        FileHandler.save(manager.getStudents());

                        System.out.println("Thank You");
                        sc.close();
                        return;

                    default:

                        System.out.println("Invalid Choice");
                }

            } catch (Exception e) {
                e.printStackTrace();

            }
            
        }

    }
}
    

