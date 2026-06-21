import java.util.*;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();
    HashMap<Integer, Student> map = new HashMap<>();

    /**
     * Adds a student to the manager.
     * 
     * @param s Student object to add
     */
    public void addStudent(Student s) {
        students.add(s);
        map.put(s.getId(), s);
    }

    /**
     * Displays all students.
     */
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Found.");
            return;
        }

        for (Student s : students) {
            System.out.println("ID : " + s.getId());
            System.out.println("Name : " + s.getName());
            System.out.println("Marks : " + s.getMarks());
            System.out.println("----------------------");
        }
    }

    /**
     * Updates student details.
     * 
     * @param id    Student ID
     * @param name  New name
     * @param marks New marks
     */
    public void updateStudent(int id, String name, int marks) {

        if (map.containsKey(id)) {

            Student s = map.get(id);

            s.setName(name);
            s.setMarks(marks);

            System.out.println("Updated Successfully");

        } else {
            System.out.println("Student Not Found");
        }
    }

    /**
     * Deletes a student by ID.
     * 
     * @param id Student ID
     */
    public void deleteStudent(int id) {

        Student s = map.remove(id);

        if (s != null) {
            students.remove(s);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Student Not Found");
        }

    }

    /**
     * Returns all students.
     * 
     * @return List of students
     */
    public ArrayList<Student> getStudents() {
        return students;
    }
}
