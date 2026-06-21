import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StudentManagerTest {

    @Test
    void testAddStudent() {
        StudentManager manager = new StudentManager();
        Student s = new Student(1, "Test", 90);

        manager.addStudent(s);

        assertEquals(1, manager.getStudents().size());
    }

    @Test
    void testUpdateStudent() {
        StudentManager manager = new StudentManager();
        Student s = new Student(1, "Test", 90);

        manager.addStudent(s);
        manager.updateStudent(1, "Updated", 95);

        assertEquals("Updated", manager.getStudents().get(0).getName());
    }

    @Test
    void testDeleteStudent() {
        StudentManager manager = new StudentManager();
        Student s = new Student(1, "Test", 90);

        manager.addStudent(s);
        manager.deleteStudent(1);

        assertEquals(0, manager.getStudents().size());
    }
}