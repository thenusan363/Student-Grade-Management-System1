import java.util.*;
public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();
    HashMap<Integer, Student> map = new HashMap<>();

    public void addStudent(Student s) {
        students.add(s);
        map.put(s.getId(), s);
    }

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

    public void deleteStudent(int id) {

        Student s = map.remove(id);

        if (s != null) {
            students.remove(s);
            System.out.println("Deleted Successfully");
        } else {
            System.out.println("Student Not Found");
        }

    }

    public ArrayList<Student> getStudents() {
        return students;
    }
}

